package absfactory;

public class USPhoneNumber implements PhoneNumber{
	String phoneNumber;
	
	public USPhoneNumber(String phoneNumber) {
		if(!isValidPhoneNumber(phoneNumber)) {
			throw new IllegalArgumentException("Invalid US phone number");
		}
		this.phoneNumber = phoneNumber;
	}
	@Override
	public boolean isValidPhoneNumber(String phoneNumber) {
		return phoneNumber.matches("^(\\([0-9]{3}\\) |[0-9]{3}-)[0-9]{3}-[0-9]{4}$");
	}

}
