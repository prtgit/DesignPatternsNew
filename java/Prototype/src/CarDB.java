
public class CarDB {
	// Assume that this class represents database and stores some values 
	// of initialization attributes of Car object
	
	int engineCapacity = 2000;
	int noOfSeats = 5;
	int horsePower = 150;
	
	public CarDB(){
		System.out.println("Accessing database to fetch base values for car object");
	}
	
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
}
