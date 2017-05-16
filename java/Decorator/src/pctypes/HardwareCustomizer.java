package pctypes;

public abstract class HardwareCustomizer implements Computer 
{
	protected Computer tempComp;
	public HardwareCustomizer(Computer newComp)
	{
		tempComp = newComp; 
		
	}
	public String getParts()
	{
		return tempComp.getParts(); 
	}
	public int getCost()
	{
		return tempComp.getCost();
	}

}
