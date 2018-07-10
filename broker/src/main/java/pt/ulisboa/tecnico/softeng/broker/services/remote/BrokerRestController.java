package pt.ulisboa.tecnico.softeng.broker.services.remote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.web.bind.annotation.*;
import pt.ulisboa.tecnico.softeng.broker.domain.Broker;
import pt.ulisboa.tecnico.softeng.broker.services.local.BrokerInterface;
import pt.ulisboa.tecnico.softeng.broker.exception.BrokerException;
import pt.ulisboa.tecnico.softeng.broker.services.local.dataobjects.ClientData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
	@RequestMapping(value = "/processPayment")
	public ResponseEntity<Boolean> processPayment(@RequestParam(value="param1") String brokerCode,
												  @RequestBody ArrayList<Object> data){
		for(int i = 0; i < data.size(); i++){
			BrokerInterface.processAdventure(brokerCode, (String) data.get(i));
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
	@RequestMapping(value = "/echo")
	public ResponseEntity<Map<String, Object>> echo(@RequestParam(value="request", defaultValue="Echo") String request) {
		Map<String, Object> json = new HashMap<String, Object>();
		json.put("success", false);
		json.put("message", request);
		return new ResponseEntity<>(json, HttpStatus.OK);
	}
}