package flyweight;

import java.util.Random;

public class FlightWorldMap {

	String flights[] = { "Delta", "American Airlines", "United", "BA", "Air France", "KLM" };
	Random random = new Random();
	FlightFactory flightFactory = new FlightFactory();
	
	private double getRandomLatitude() {
		double value = Math.random() * 90;
		return random.nextBoolean() ? value : value * -1D;
	}
	
	private double getRandomLongitude() {
		double value = Math.random() * 180;
		return random.nextBoolean() ? value : value * -1D;
	}
	
	private String getRandomFlight()
	{
		return flights[random.nextInt(5)];
	}
	
	
	private int getRandomFlightNo() {
		return random.nextInt(999);
	}
	
	public void displayAllFlights() {
		for(int i = 0; i < 100000; i++) {
			Flight flight = flightFactory.getFlight(getRandomFlight()); // >3
			flight.drawOnMap(getRandomFlightNo(), getRandomLatitude(), getRandomLongitude());
		}
	}
}
