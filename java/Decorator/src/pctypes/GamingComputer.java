package pctypes;

public class GamingComputer extends HardwareCustomizer {
    private int graphics = 2;
    private int graphicsCost = 10;
	_____________________ (Computer newComp) //>> 6.Fill in the header for the missing routine
	{
		_________________; //>> 7.Fill in the blank
		
		
	}
    
        @Override
	public String getParts() {
		return _____________________+"Graphics Card= "+graphics +"GB"; //>> 8.Fill in the blank
	}

	@Override
	public int getCost() {
		return tempComp.getCost()+graphicsCost;
	}

}
