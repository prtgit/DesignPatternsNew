package flyweight;

public class Flight {
	String company;
	
	void drawOnMap(int flightNo, double latitude, double longitude) {
		System.out.println();
		System.out.println(company + " flight " + flightNo + " is currently at latitude " + latitude + " and longitude "
				+ longitude);
	}
}
