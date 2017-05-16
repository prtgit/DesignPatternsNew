package absfactory;


public interface AbstractFactory {
	public PostCode getPostCode(Country country, String postalCode);

	public PhoneNumber getPhoneNumber(Country country, String phoneNumber);
}
