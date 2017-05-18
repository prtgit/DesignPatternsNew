package pctypes;

public class BasicComputer implements Computer {
    private int ram = 256;
    private int rom = 4;
	@Override
	_________________________ {   //>> 1.Fill in the blank
		return "RAM ="+ ram +"MB, ROM="+rom;
		
	}

	@Override
	public int getCost() {
		return 200; 
		
	}
}