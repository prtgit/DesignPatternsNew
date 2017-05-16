package absfactory;

public class PostCodeFactory implements AbstractFactory {

	@Override
	public PostCode getPostCode(Country country, String postalCode) {
		if (country == Country.US)
			return new USPostCode(postalCode);
		if (country == Country.UK)
			return new UKPostCode(postalCode);

		return null;
	}

	@Override
	public PhoneNumber getPhoneNumber(Country country, String phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}
}
