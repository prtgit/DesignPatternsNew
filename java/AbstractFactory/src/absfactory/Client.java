package absfactory;

public class Client {
	/*
	 * There should not be any exeception or compilations issues once all
	 * blanks are filled.
	 */
	public static void main(String[] args) {
		AbstractFactory phoneNumberFactory = PostPhoneFactory.getFactory(Type.PHONE); //>1
		phoneNumberFactory.getPhoneNumber(Country.UK, "+44 7836 191 191"); //>2

		AbstractFactory postCodeFactory = PostPhoneFactory.getFactory(Type.POST); //>3
		postCodeFactory.getPhoneNumber(Country.UK, "SW15 5PU"); //>4
		postCodeFactory.getPhoneNumber(Country.US, "27606"); //>5
	}
}
