package pt.ulisboa.tecnico.softeng.activity.services.remote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer;
import pt.ulisboa.tecnico.softeng.activity.exception.ActivityException;
import pt.ulisboa.tecnico.softeng.activity.services.local.ActivityInterface;
import pt.ulisboa.tecnico.softeng.activity.services.remote.dataobjects.RestActivityBookingData;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/providers")
public class ActivityRestController {
	private static Logger logger = LoggerFactory.getLogger(ActivityRestController.class);

	@RequestMapping(value = "/reserve", method = RequestMethod.POST)
	public ResponseEntity<String> reserve(@RequestBody RestActivityBookingData activityBookingData) {
		logger.info("reserveActivity begin:{}, end:{}, age:{}, nif:{}, iban:{}, adventureId:{}",
				activityBookingData.getBegin(), activityBookingData.getEnd(), activityBookingData.getAge(),
				activityBookingData.getNif(), activityBookingData.getIban(), activityBookingData.getAdventureId());
		try {
			return new ResponseEntity<String>(ActivityInterface.reserveActivity(activityBookingData), HttpStatus.OK);
		} catch (ActivityException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value = "/reserveSelected")
	public ResponseEntity<String> reserveSelected(@RequestBody RestActivityBookingData activityBookingData) {
		logger.info("reserveActivity begin:{}, end:{}, age:{}, nif:{}, iban:{}, adventureId:{}, id:{}",
				activityBookingData.getBegin(), activityBookingData.getEnd(), activityBookingData.getAge(),
				activityBookingData.getNif(), activityBookingData.getIban(), activityBookingData.getAdventureId(), activityBookingData.getId());
		try {
			return new ResponseEntity<String>(ActivityInterface.reserveSelectedActivity(activityBookingData), HttpStatus.OK);
		} catch (ActivityException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} 
	}

	@RequestMapping(value = "/cancel", method = RequestMethod.POST)
	public ResponseEntity<String> cancel(@RequestParam String reference) {
		logger.info("cancel reference:{}", reference);
		try {
			return new ResponseEntity<>(ActivityInterface.cancelReservation(reference), HttpStatus.OK);
		} catch (ActivityException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/reservation", method = RequestMethod.GET)
	public ResponseEntity<RestActivityBookingData> reservation(@RequestParam String reference) {
		logger.info("reservation reference:{}", reference);
		try {
			return new ResponseEntity<>(ActivityInterface.getActivityReservationData(reference), HttpStatus.OK);
		} catch (ActivityException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@CrossOrigin
	@RequestMapping(value = "/activities")
	public ResponseEntity<?> getActivities(@RequestParam(value="begin") String begin,
											@RequestParam(value="end") String end) {

		try {
			List<ActivityOffer> offers =  ActivityInterface.getAllOffers(begin, end);

			return new ResponseEntity<>(ActivityInterface.offersToHashMap(offers), HttpStatus.OK);

		} catch (ActivityException e) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

}
