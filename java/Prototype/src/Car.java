public class Car implements PrototypeCloneable {
	private String name;
	private int engineCapacity;
	private int noOfSeats;
	private int horsePower;
	private boolean cruiseControl = false;
	private boolean automaticClimateControl = false;

	public Car() {
		CarDB carDB = new CarDB();
		this.engineCapacity = carDB.getEngineCapacity();
		this.noOfSeats = carDB.getNoOfSeats();
		this.horsePower = carDB.getNoOfSeats();
		System.out.println("Creating car object..");
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public boolean isCruiseControl() {
		return cruiseControl;
	}

	public void setCruiseControl(boolean cruiseControl) {
		this.cruiseControl = cruiseControl;
	}

	public boolean isAutomaticClimateControl() {
		return automaticClimateControl;
	}

	public void setAutomaticClimateControl(boolean automaticClimateControl) {
		this.automaticClimateControl = automaticClimateControl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car clone() throws CloneNotSupportedException {
		System.out.println("Cloning Car object..");
		return (Car) super.clone();
	}

	public void printDetails() {
		System.out.println("Name: " + this.name + "\nEngine Capacity: " + this.engineCapacity + "\nNumber of seats: "
				+ this.noOfSeats + "\nHorse Power: " + this.horsePower + "\nCruise Control: " + this.cruiseControl
				+ "\nAutomatic Climate Control: " + this.automaticClimateControl);
	}
}