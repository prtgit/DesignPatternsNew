package absfactory;

public class PostPhoneFactory {
	public static AbstractFactory getFactory(Type type) {
		if (type == Type.POST)
			return new PostCodeFactory();
		if (type == Type.PHONE)
			return new PhoneNumberFactory();

		return null;
	}
}
