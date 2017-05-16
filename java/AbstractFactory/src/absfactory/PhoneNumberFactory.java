package absfactory;

public class PhoneNumberFactory implements AbstractFactory{

	@Override
	public PostCode getPostCode(Country country, String postalCode) {
		return null;
	}

	@Override
	public PhoneNumber getPhoneNumber(Country country, String phoneNumber) {
		if (country == Country.US)
			return new USPhoneNumber(phoneNumber);
		if (country == Country.UK)
			return new UKPhoneNumber(phoneNumber);
		
		return null;
	}
}
