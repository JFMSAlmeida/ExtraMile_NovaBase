package pt.ulisboa.tecnico.softeng.hotel.services.remote;

import org.apache.tomcat.jni.Local;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pt.ulisboa.tecnico.softeng.hotel.domain.Room;
import pt.ulisboa.tecnico.softeng.hotel.exception.HotelException;
import pt.ulisboa.tecnico.softeng.hotel.services.local.HotelInterface;
import pt.ulisboa.tecnico.softeng.hotel.services.remote.dataobjects.RestRoomBookingData;

import java.util.ArrayList; 
import java.util.List;

@RestController
@RequestMapping(value = "/rest/hotels")
public class HotelRestController {
	private static Logger logger = LoggerFactory.getLogger(HotelRestController.class);

	@RequestMapping(value = "/reserve", method = RequestMethod.POST)
	public ResponseEntity<String> reserve(@RequestBody RestRoomBookingData roomBookingData) {
		logger.info("reserve type:{}, arrival:{}, departure:{}, nif:{}, iba:{}, adventureId:{}",
				roomBookingData.getRoomType(), roomBookingData.getArrival(), roomBookingData.getDeparture(),
				roomBookingData.getBuyerNif(), roomBookingData.getBuyerIban(), roomBookingData.getAdventureId());
		try {
			return new ResponseEntity<String>(HotelInterface.reserveRoom(roomBookingData), HttpStatus.OK);
		} catch (HotelException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value = "/reserveSelected", method = RequestMethod.POST)
	public ResponseEntity<String> reserveSelected(@RequestBody RestRoomBookingData roomBookingData) {
		logger.info("reserve type:{}, arrival:{}, departure:{}, nif:{}, iba:{}, adventureId:{}, id:{}",
				roomBookingData.getRoomType(), roomBookingData.getArrival(), roomBookingData.getDeparture(),
				roomBookingData.getBuyerNif(), roomBookingData.getBuyerIban(), roomBookingData.getAdventureId(), roomBookingData.getId());
		try {
			return new ResponseEntity<String>(HotelInterface.reserveSelectedRoom(roomBookingData), HttpStatus.OK);
		} catch (HotelException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	

	@RequestMapping(value = "/cancel", method = RequestMethod.POST)
	public ResponseEntity<String> cancel(@RequestParam String reference) {
		logger.info("cancel reference:{}", reference);
		try {
			return new ResponseEntity<>(HotelInterface.cancelBooking(reference), HttpStatus.OK);
		} catch (HotelException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/booking", method = RequestMethod.GET)
	public ResponseEntity<RestRoomBookingData> booking(@RequestParam String reference) {
		logger.info("booking reference:{}", reference);
		try {
			return new ResponseEntity<>(HotelInterface.getRoomBookingData(reference), HttpStatus.OK);
		} catch (HotelException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@CrossOrigin
	@RequestMapping(value = "/rooms")
    public ResponseEntity<List<Object>> getRooms(@RequestParam(value="param1") String begin,
														@RequestParam(value="param2") String end) {

	    try {
	    	List<Room> teste123 = HotelInterface.getAllRooms(begin, end);

	        return new ResponseEntity<>(HotelInterface.rooms2HashMap(teste123), HttpStatus.OK);

    } catch (HotelException he) {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    }

	@RequestMapping(value = "/bulk", method = RequestMethod.POST)
	public ResponseEntity<String[]> bulk(@RequestParam int number,
			@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate arrival,
			@DateTimeFormat(pattern = "yyyy-MM-dd") @RequestParam LocalDate departure, @RequestParam String nif,
			@RequestParam String iban, @RequestParam String bulkId) {
		logger.info("bulk number:{}, arrival:{}, departure:{}, nif:{}, iban:{}, bulkId:{}", number, arrival, departure,
				nif, iban, bulkId);
		try {
			return new ResponseEntity<>(HotelInterface.bulkBooking(number, arrival, departure, nif, iban, bulkId)
					.stream().toArray(size -> new String[size]), HttpStatus.OK);
		} catch (HotelException be) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

}
