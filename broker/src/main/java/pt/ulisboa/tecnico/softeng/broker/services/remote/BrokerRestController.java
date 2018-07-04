package pt.ulisboa.tecnico.softeng.broker.services.remote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.ulisboa.tecnico.softeng.broker.services.local.BrokerInterface;
import pt.ulisboa.tecnico.softeng.broker.exception.BrokerException;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/rest/brokers")
public class BrokerRestController {
	private static Logger logger = LoggerFactory.getLogger(BrokerRestController.class);

	@CrossOrigin
	@RequestMapping(value = "/process")
	public ResponseEntity<Map<String, Object>> process(@RequestParam(value="param1") String brokerCode,
													   @RequestParam(value="param2") String id) {
		try {
			BrokerInterface.processAdventure(brokerCode, id);

			Map<String, Object> message = new HashMap<String, Object>();
			message.put("location", "/rest/brokers");
			message.put("summary", "ok");
			message.put("code", 200);
			Map<String, Object> json = new HashMap<String, Object>();
			json.put("success", true);
			json.put("message", message);
			return new ResponseEntity<Map<String, Object>>(json, HttpStatus.OK);

		} catch (BrokerException be) {
			Map<String, Object> message = new HashMap<String, Object>();
			message.put("location", "/rest/brokers");
			message.put("summary", "error");
			message.put("code", 500);
			Map<String, Object> json = new HashMap<String, Object>();
			json.put("success", false);
			json.put("message", message);
			return new ResponseEntity<Map<String, Object>>(json, HttpStatus.OK);
		}
	}

	@CrossOrigin
	@RequestMapping(value = "/echo")
	public ResponseEntity<Map<String, Object>> echo(@RequestParam(value="request", defaultValue="Echo") String request) {
		Map<String, Object> json = new HashMap<String, Object>();
		json.put("success", false);
		json.put("message", request);
		return new ResponseEntity<Map<String, Object>>(json, HttpStatus.OK);
	}
}