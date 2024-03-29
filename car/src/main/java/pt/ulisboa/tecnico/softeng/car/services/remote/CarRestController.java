package pt.ulisboa.tecnico.softeng.car.services.remote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pt.ulisboa.tecnico.softeng.car.exception.CarException;
import pt.ulisboa.tecnico.softeng.car.services.local.RentACarInterface;
import pt.ulisboa.tecnico.softeng.car.services.local.dataobjects.RentACarData;
import pt.ulisboa.tecnico.softeng.car.services.remote.dataobjects.RestRentingData;
 
import java.util.List;

@RestController
@RequestMapping(value = "/rest/rentacars")
public class CarRestController {
	private static Logger logger = LoggerFactory.getLogger(CarRestController.class);

	@RequestMapping(value = "/rent", method = RequestMethod.POST)
	public ResponseEntity<String> rent(@RequestBody RestRentingData rentingData) {
		logger.info("rent type:{}, license:{}, nif:{}, iban:{}, begin:{}, end:{}, adventureId:{}",
				rentingData.getTypeValue(), rentingData.getDrivingLicense(), rentingData.getBuyerNIF(),
				rentingData.getBuyerIBAN(), rentingData.getBegin(), rentingData.getEnd(), rentingData.getAdventureId());
		try {
			return new ResponseEntity<>(RentACarInterface.rent(rentingData.getTypeValue(),
					rentingData.getDrivingLicense(), rentingData.getBuyerNIF(), rentingData.getBuyerIBAN(),
					rentingData.getBegin(), rentingData.getEnd(), rentingData.getAdventureId()), HttpStatus.OK);

		} catch (CarException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/cancel", method = RequestMethod.POST)
	public ResponseEntity<String> cancel(@RequestParam String reference) {
		logger.info("cancel reference:{}", reference);
		try {
			return new ResponseEntity<>(RentACarInterface.cancelRenting(reference), HttpStatus.OK);
		} catch (CarException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/renting", method = RequestMethod.GET)
	public ResponseEntity<RestRentingData> renting(@RequestParam String reference) {
		logger.info("renting reference:{}", reference);
		try {
			RestRentingData rentingData = RentACarInterface.getRentingData(reference);
			return new ResponseEntity<RestRentingData>(rentingData, HttpStatus.OK);
		} catch (CarException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@CrossOrigin
	@RequestMapping(value = "/vehicles")
    public ResponseEntity<List<Object>> getVehicles(@RequestParam(value="param1") String begin,
													@RequestParam(value="param2") String end) {

		try {

	    	List<RentACarData> aux = RentACarInterface.getRentACars();

	        return new ResponseEntity<>(RentACarInterface.vehicle2HashMap(aux, begin, end), HttpStatus.OK);
		} catch (CarException ce) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
    }
	
	@RequestMapping(value = "/rentSelected", method = RequestMethod.POST)
	public ResponseEntity<String> rentSelected(@RequestBody RestRentingData rentingData) {
		logger.info("rent license:{}, nif:{}, iban:{}, begin:{}, end:{}, adventureId:{}, id:{}",
				rentingData.getDrivingLicense(), rentingData.getBuyerNIF(),
				rentingData.getBuyerIBAN(), rentingData.getBegin(), rentingData.getEnd(), rentingData.getAdventureId(), rentingData.getId());
		try {
			return new ResponseEntity<>(RentACarInterface.rentSelected(
					rentingData.getDrivingLicense(), rentingData.getBuyerNIF(), rentingData.getBuyerIBAN(),
					rentingData.getBegin(), rentingData.getEnd(), rentingData.getAdventureId(), rentingData.getId()), HttpStatus.OK);

		} catch (CarException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

}
