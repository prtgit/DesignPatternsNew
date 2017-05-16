package pctypes;

public class Laptop extends HardwareCustomizer{
    
	private int ssd = 200;
	private int ssdCost = 80;
	public Laptop (Computer newComp) {
		super(newComp);                     
		// TODO Auto-generated constructor stub
	}
	public String getParts() {
		// TODO Auto-generated method stub
		return tempComp.getParts()+"Solid State Drive= "+ssd +"GB"; //>> 5.Fill in the blank
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return tempComp.getCost()+ssdCost;
	}

}
