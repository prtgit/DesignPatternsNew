package absfactory;

public class USPostCode implements PostCode{
    String postalCode;
    
	public USPostCode(String postalCode)
    {
    	if(!isValidPostalCode(postalCode)) {
    		throw new IllegalArgumentException("Invalid postcode");
    	}
    	
    	this.postalCode = postalCode;
    }
	
	@Override
	public boolean isValidPostalCode(String postalCode) {
		return postalCode.matches("^[0-9]{5}(?:-[0-9]{4})?$");
	}

}
