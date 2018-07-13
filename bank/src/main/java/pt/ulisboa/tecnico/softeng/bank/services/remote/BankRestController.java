package pt.ulisboa.tecnico.softeng.bank.services.remote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pt.ulisboa.tecnico.softeng.bank.exception.BankException;
import pt.ulisboa.tecnico.softeng.bank.services.local.BankInterface;
import pt.ulisboa.tecnico.softeng.bank.services.local.dataobjects.AccountData;
import pt.ulisboa.tecnico.softeng.bank.services.local.dataobjects.BankOperationData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/rest/banks")
public class BankRestController {
	private static Logger logger = LoggerFactory.getLogger(BankRestController.class);

	@RequestMapping(value = "/accounts/{iban}/processPayment", method = RequestMethod.POST)
	public ResponseEntity<String> processPayment(@RequestBody BankOperationData bankOperationData) {
		logger.info("processPayment iban:{}, amount:{}, transactionSource:{}, transactionReference:{}",
				bankOperationData.getIban(), bankOperationData.getValue(), bankOperationData.getTransactionSource(),
				bankOperationData.getTransactionReference());
		try {
			return new ResponseEntity<String>(BankInterface.processPayment(bankOperationData), HttpStatus.OK);
		} catch (BankException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/cancel", method = RequestMethod.POST)
	public ResponseEntity<String> cancelPayment(@RequestParam String reference) {
		logger.info("cancelPayment reference:{}", reference);
		try {
			return new ResponseEntity<>(BankInterface.cancelPayment(reference), HttpStatus.OK);
		} catch (BankException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/operation", method = RequestMethod.GET)
	public ResponseEntity<BankOperationData> getOperationData(@RequestParam String reference) {
		logger.info("getOperationData reference:{}", reference);
		try {
			BankOperationData result = BankInterface.getOperationData(reference);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (BankException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@CrossOrigin
	@RequestMapping(value = "/balance", method = RequestMethod.GET)
	public ResponseEntity<?> getClientBalance(@RequestParam String iban) {
		logger.info("getClientBalance iban:{}", iban);
		try {
			AccountData ad = BankInterface.getAccountData2(iban);

			Map<String, Object> json = new HashMap<String, Object>();

			if (ad == null) {
				json.put("success", false);
			}

			else {
				json.put("success", true);
				json.put("balance", ad.getBalance());
			}

			return new ResponseEntity<>(json, HttpStatus.OK);
		} catch (BankException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@CrossOrigin
	@RequestMapping(value = "/transactions", method = RequestMethod.GET)
	public ResponseEntity<?> getClientTransactions(@RequestParam String iban) {
		logger.info("getClientTransactions iban:{}", iban);

		try {
			Map<String, Object> json = new HashMap<String, Object>();

			ArrayList<Object> array = BankInterface.getTransactions(iban);
			if (array == null) {
				json.put("success", false);
			}
			else {
				json.put("success", true);
				json.put("transactions", array);
			}
			return new ResponseEntity<>(json, HttpStatus.OK);
		} catch (BankException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

}
