package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlightFactory {
	static final Map<String, Flight> flightMap = new HashMap<>(); // >1
	
	Flight getFlight(String flightKey) {
		Flight flight = flightMap.get(flightKey);
		
		if(flight == null) {
			flight = new Flight();
			flight.company = flightKey;
			flightMap.put(flightKey, flight); // > 2
		}
		
		return flight;
	}
	
}
