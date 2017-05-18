package pctypes;

public class Laptop extends HardwareCustomizer {
    
	private int ssd = 200;
	private int ssdCost = 80;
	public Laptop (Computer newComp) {
		_____________________; //>> 4. Fill in the blank
	}
	public String getParts() {
		return _______________________+"Solid State Drive= "+ssd +"GB"; //>> 5.Fill in the blank
	}

	@Override
	public int getCost() {
		return tempComp.getCost()+ssdCost;
	}

}
