package pt.ulisboa.tecnico.softeng.broker.services.remote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.ulisboa.tecnico.softeng.broker.services.local.BrokerInterface;
import pt.ulisboa.tecnico.softeng.broker.exception.BrokerException;

@RestController
@RequestMapping(value = "/rest/brokers")
public class BrokerRestController {
	private static Logger logger = LoggerFactory.getLogger(BrokerRestController.class);

	@RequestMapping(value = "/process", method = RequestMethod.POST)
	public String process(@RequestParam(value="param1") String brokerCode,
						  @RequestParam(value="param2") String id) {
		try {
			BrokerInterface.processAdventure(brokerCode, id);
			return "ok";
		} catch (BrokerException be) {
			return "not ok";
		}
	}
}
