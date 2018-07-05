package pt.ulisboa.tecnico.softeng.broker.services.local;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import pt.ist.fenixframework.Atomic;
import pt.ist.fenixframework.Atomic.TxMode;
import pt.ist.fenixframework.FenixFramework;
import pt.ulisboa.tecnico.softeng.broker.domain.Adventure;
import pt.ulisboa.tecnico.softeng.broker.domain.Broker;
import pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking;
import pt.ulisboa.tecnico.softeng.broker.domain.Client;
import pt.ulisboa.tecnico.softeng.broker.services.local.dataobjects.AdventureData;
import pt.ulisboa.tecnico.softeng.broker.services.local.dataobjects.BrokerData;
import pt.ulisboa.tecnico.softeng.broker.services.local.dataobjects.BrokerData.CopyDepth;
import pt.ulisboa.tecnico.softeng.broker.services.local.dataobjects.BulkData;
import pt.ulisboa.tecnico.softeng.broker.services.local.dataobjects.ClientData;
import pt.ulisboa.tecnico.softeng.broker.services.remote.ActivityInterface;
import pt.ulisboa.tecnico.softeng.broker.services.remote.CarInterface;
import pt.ulisboa.tecnico.softeng.broker.services.remote.HotelInterface;
import pt.ulisboa.tecnico.softeng.broker.services.remote.dataobjects.RestActivityBookingData;
import pt.ulisboa.tecnico.softeng.broker.services.remote.dataobjects.RestRentingData;
import pt.ulisboa.tecnico.softeng.broker.services.remote.dataobjects.RestRoomBookingData;

public class BrokerInterface {

	@Atomic(mode = TxMode.READ)
	public static List<BrokerData> getBrokers() {
		List<BrokerData> brokers = new ArrayList<>();
		for (Broker broker : FenixFramework.getDomainRoot().getBrokerSet()) {
			brokers.add(new BrokerData(broker, CopyDepth.SHALLOW));
		}
		return brokers;
	}

	@Atomic(mode = TxMode.WRITE)
	public static void createBroker(BrokerData brokerData) {
		new Broker(brokerData.getCode(), brokerData.getName(), brokerData.getNifAsSeller(), brokerData.getNifAsBuyer(),
				brokerData.getIban());
	}

	@Atomic(mode = TxMode.READ)
	public static BrokerData getBrokerDataByCode(String brokerCode, CopyDepth depth) {
		Broker broker = getBrokerByCode(brokerCode);

		if (broker != null) {
			return new BrokerData(broker, depth);
		} else {
			return null;
		}
	}

	@Atomic(mode = TxMode.READ)
	public static ClientData getClientDataByBrokerCodeAndNif(String brokerCode, String clientNif) {
		Broker broker = getBrokerByCode(brokerCode);
		if (broker == null) {
			return null;
		}

		Client client = broker.getClientByNIF(clientNif);
		if (client == null) {
			return null;
		}

		return new ClientData(client);
	}

	@Atomic(mode = TxMode.WRITE)
	public static void createClient(String brokerCode, ClientData clientData) {
		new Client(getBrokerByCode(brokerCode), clientData.getIban(), clientData.getNif(),
				clientData.getDrivingLicense(), clientData.getAge() != null ? clientData.getAge() : 0);
	}

	@Atomic(mode = TxMode.WRITE)
	public static void createAdventure(String brokerCode, String clientNif, AdventureData adventureData) {
		Broker broker = getBrokerByCode(brokerCode);
		Client client = broker.getClientByNIF(clientNif);
		new Adventure(broker, adventureData.getBegin(), adventureData.getEnd(), client,
				adventureData.getMargin() != null ? adventureData.getMargin() : -1, adventureData.getVehicle());
	}

	@Atomic(mode = TxMode.WRITE)
	public static void createBulkRoomBooking(String brokerCode, BulkData bulkData) {
		new BulkRoomBooking(getBrokerByCode(brokerCode), bulkData.getNumber() != null ? bulkData.getNumber() : 0,
				bulkData.getArrival(), bulkData.getDeparture(), bulkData.getBuyerNif(), bulkData.getBuyerIban());

	}

	@Atomic(mode = TxMode.WRITE)
	public static void processAdventure(String brokerCode, String id) {
		Adventure adventure = FenixFramework.getDomainRoot().getBrokerSet().stream()
				.filter(b -> b.getCode().equals(brokerCode)).flatMap(b -> b.getAdventureSet().stream())
				.filter(a -> a.getID().equals(id)).findFirst().orElse(null);

		adventure.process();
	}

	@Atomic(mode = TxMode.WRITE)
	public static void processBulk(String brokerCode, String bulkId) {
		BulkRoomBooking bulkRoomBooking = FenixFramework.getDomainRoot().getBrokerSet().stream()
				.filter(b -> b.getCode().equals(brokerCode)).flatMap(b -> b.getRoomBulkBookingSet().stream())
				.filter(r -> r.getId().equals(bulkId)).findFirst().orElse(null);

		bulkRoomBooking.processBooking();
	}

	@Atomic(mode = TxMode.WRITE)
	public static void deleteBrokers() {
		for (Broker broker : FenixFramework.getDomainRoot().getBrokerSet()) {
			broker.delete();
		}
	}

	private static Broker getBrokerByCode(String code) {
		for (Broker broker : FenixFramework.getDomainRoot().getBrokerSet()) {
			if (broker.getCode().equals(code)) {
				return broker;
			}
		}
		return null;
	}

	@Atomic(mode = TxMode.WRITE)
	public static void processAdventure2(String brokerCode) {
		List<Adventure> list = FenixFramework.getDomainRoot().getBrokerSet().stream()
				.filter(b -> b.getCode().equals(brokerCode)).flatMap(b -> b.getAdventureSet().stream())
				.collect(Collectors.toList());

		for (Adventure adv: list)
			while(adv.getState().getValue() != Adventure.State.PROCESS_PAYMENT )
				adv.process();
	}

	public static Map<String, Object> adventures2HashMap(List<AdventureData> listAdventures) {

		Map<String, Object> adventures = new HashMap<>();

		for (AdventureData adv: listAdventures) {
			int i = 0;
			if (adv.getState() == Adventure.State.PROCESS_PAYMENT) {
				Map<String, Object> advt = new HashMap<>();
				advt.put("id", adv.getId());
				advt.put("age", adv.getAge());
				advt.put("begin", adv.getBegin());
				advt.put("end", adv.getEnd());
				advt.put("hasVehicle", adv.getVehicle());

				RestActivityBookingData actData = ActivityInterface.getActivityReservationData(adv.getActivityConfirmation());
				advt.put("activityName", actData.getName());

				if(!adv.getBegin().equals(adv.getEnd())) {
					RestRoomBookingData roomData = HotelInterface.getRoomBookingData(adv.getRoomConfirmation());
					advt.put("hotelName", roomData.getHotelName());
					advt.put("roomNumber", roomData.getRoomNumber());
					advt.put("roomType", roomData.getRoomType());
				}
				if(adv.getVehicle()) {
					RestRentingData rentData = CarInterface.getRentingData(adv.getRentingConfirmation());
					advt.put("vehicleType", rentData.getTypeValue());
					advt.put("kilometers", rentData.getKilometers());
					advt.put("rentBegin", rentData.getBegin());
					advt.put("rentEnd", rentData.getEnd());
				}

				adventures.put("adventures" + i, advt );
				i++;
			}
		}
		return adventures;
	}
}
