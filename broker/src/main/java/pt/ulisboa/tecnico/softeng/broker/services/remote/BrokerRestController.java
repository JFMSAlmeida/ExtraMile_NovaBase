package pt.ulisboa.tecnico.softeng.broker.services.remote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.web.bind.annotation.*;
import pt.ulisboa.tecnico.softeng.broker.domain.Broker;
import pt.ulisboa.tecnico.softeng.broker.domain.Client;
import pt.ulisboa.tecnico.softeng.broker.services.local.BrokerInterface;
import pt.ulisboa.tecnico.softeng.broker.exception.BrokerException;
import pt.ulisboa.tecnico.softeng.broker.services.local.dataobjects.AdventureData;
import pt.ulisboa.tecnico.softeng.broker.services.local.dataobjects.BrokerData;
import pt.ulisboa.tecnico.softeng.broker.services.local.dataobjects.ClientData;
import pt.ulisboa.tecnico.softeng.broker.services.local.dataobjects.AdventureData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.LocalDate;
 
@RestController
@RequestMapping(value = "/rest/brokers")
public class BrokerRestController {

	@CrossOrigin
	@RequestMapping(value = "/showAdventures")
	public ResponseEntity<ArrayList<Object>> showAdventures(@RequestParam(value="param1") String brokerCode,
															@RequestParam(value="param2") String clientNif) {

		ClientData clientData = BrokerInterface.getClientDataByBrokerCodeAndNif(brokerCode, clientNif);

		if (clientData == null) return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		try {
			return new ResponseEntity<>(BrokerInterface.adventures2HashMap(clientData.getAdventures()), HttpStatus.OK);

		} catch (BrokerException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}


	@CrossOrigin
	@RequestMapping(value = "/showReferences")
	public ResponseEntity<ArrayList<Object>> showReferences(@RequestParam(value = "param") String[] paramValues) {

		ArrayList<Object> response = new ArrayList<>();

		try {
			ClientData clientData = BrokerInterface.getClientDataByBrokerCodeAndNif(paramValues[0], paramValues[1]);


			for(AdventureData a : clientData.getAdventures()){
				for(int i = 2; i < paramValues.length; i++){
					if(a.getId().equals(paramValues[i])){
						ArrayList<Object> references = new ArrayList<>();
						references.add(paramValues[i]);
						references.add(a.getPaymentConfirmation());
						references.add(a.getAmount());
						response.add(references);
					}
				}
			}
			return new ResponseEntity<>(response,HttpStatus.OK);

		} catch (BrokerException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}

	@CrossOrigin
	@RequestMapping(value = "/processPayment")
	public ResponseEntity<Map<String, Object>> processPayment(@RequestParam(value = "param") String[] paramValues) {

        Map<String, Object> json = new HashMap<String, Object>();
		try {
			boolean flag = true;
			for (int i = 1; i < paramValues.length; i++) {
				flag = flag && BrokerInterface.processAdventure2(paramValues[0], paramValues[i]);
			}
			json.put("success", flag);
			return new ResponseEntity<>(json, HttpStatus.OK);
		} catch (BrokerException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}

	@CrossOrigin
	@RequestMapping(value = "/process")
	public ResponseEntity<Map<String, Object>> process(@RequestParam(value="param1") String brokerCode){
		try {
			BrokerInterface.processAdventure2(brokerCode);
			Map<String, Object> json = new HashMap<String, Object>();
			json.put("success", true);
			json.put("message", brokerCode);
			return new ResponseEntity<>(json, HttpStatus.OK);

		} catch (BrokerException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@CrossOrigin
	@RequestMapping(value = "/processPart")
	public ResponseEntity<Map<String, Object>> processPart (@RequestParam(value="param1") String brokerCode,
			  												@RequestParam(value="param2") String advId,
			  												@RequestParam(value="param") String[] id) {
		
		try {
			int size = id.length;
			for(int i = 0; i < size; i++) {
				System.out.println(id[i]);
			}

			Map<String, Object> json = new HashMap<String, Object>();
			
			for(int i = 0; i < size; i++) {
				BrokerInterface.process(brokerCode, id[i], advId);
				json.put("success", true);
			}

			return new ResponseEntity<>(json, HttpStatus.OK);

		} catch (BrokerException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@CrossOrigin
	@RequestMapping(value = "/getAdventurePrice")
	public ResponseEntity<Map<String,Object>> getAdventurePrice(@RequestParam(value="param1") String brokerCode,
														   @RequestParam(value="param2") String advId,
														   @RequestParam(value="param3") String clientNif) {

		try {
			Map<String, Object> json = new HashMap<String, Object>();

			json.put("price", BrokerInterface.getAdventurePriceById(brokerCode, advId, clientNif));

			return new ResponseEntity<>(json, HttpStatus.OK);

		} catch (BrokerException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

 
	}

	@CrossOrigin
	@RequestMapping(value = "/echo")
	public ResponseEntity<Map<String, Object>> echo(@RequestParam(value="request", defaultValue="Echo") String request) {
		try {
			Map<String, Object> json = new HashMap<String, Object>();
			json.put("success", true);
			json.put("message", request);
			return new ResponseEntity<>(json, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@CrossOrigin
	@RequestMapping(value = "/signup")
	public ResponseEntity<Map<String, Object>> signup(@RequestParam(value="brokerCode") String brokerCode,
													  @RequestParam(value="nif") String nif,
													  @RequestParam(value="iban") String iban,
													  @RequestParam(value="age") int age,
													  @RequestParam(value="dl") String dl) {
		try {
			BrokerInterface.signUp(brokerCode, nif, iban, age, dl);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (BrokerException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@CrossOrigin
	@RequestMapping(value = "/login")
	public ResponseEntity<Map<String, Object>> login(@RequestParam(value="brokerCode") String brokerCode,
													  @RequestParam(value="nif") String nif) {
		try {
			ClientData cd = BrokerInterface.getClientDataByBrokerCodeAndNif(brokerCode, nif);
			Map<String, Object> json = new HashMap<String, Object>();

			if (cd == null)
				json.put("success", false);

			else {
				json.put("success", true);
				json.put("nif", nif);
				json.put("iban", cd.getIban());
				json.put("age", cd.getAge());
				json.put("drivinglicense", cd.getDrivingLicense());
			}
			return new ResponseEntity<>(json, HttpStatus.OK);
		} catch (BrokerException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@CrossOrigin
	@RequestMapping(value = "/updateClientInfo")
	public ResponseEntity<?> updateClientInfo(@RequestParam(value="brokerCode") String brokerCode,
											  @RequestParam(value="nif") String nif,
											  @RequestParam(value="iban") String iban,
											  @RequestParam(value="age") int age,
											  @RequestParam(value="dl") String dl) {
		try {
			Map<String, Object> json = new HashMap<String, Object>();
			if(BrokerInterface.updateClientInfo(brokerCode, nif, iban, age, dl))
				json.put("success", true);
			else
				json.put("success", false);
			return new ResponseEntity<>(json, HttpStatus.OK);

		} catch (BrokerException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@CrossOrigin
	@RequestMapping (value = "/createAdventure")
	public ResponseEntity<Map<String,Object>> createAdventure (@RequestParam(value="brokerCode") String brokerCode,
																						@RequestParam(value="clientNif") String clientNif,
																						@RequestParam(value="begin") String begin,
																						@RequestParam(value="end") String end,
																						@RequestParam(value="margin") double margin,
																						@RequestParam(value="rentVehicle") boolean rentVehicle) {
		try {
			
			LocalDate b = new LocalDate(begin);
			LocalDate e = new LocalDate(end);

			AdventureData advData = new AdventureData();
			advData.setMargin(margin);
			advData.setVehicle(rentVehicle);
			advData.setBegin(b);
			advData.setEnd(e);

			Map<String, Object> json = new HashMap<String, Object>();

			
			AdventureData advdt = BrokerInterface.createAdventure2(brokerCode, clientNif, advData);

			json.put("advId", advdt.getId());

			
			return new ResponseEntity<>(json ,HttpStatus.OK);
			
		} catch (BrokerException e) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST); 
		}

	}

}
