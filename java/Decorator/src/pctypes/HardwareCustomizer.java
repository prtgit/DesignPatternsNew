package pctypes;

public abstract class HardwareCustomizer implements Computer 
{
	protected Computer tempComp;
	public HardwareCustomizer(Computer newComp)
	{
		_____________________; //>> 2.Fill in the blank
		
	}
	public String getParts()
	{
		return ____________________; //>> 3.Fill in the blank
	}
	public int getCost()
	{
		return tempComp.getCost();
	}

}
