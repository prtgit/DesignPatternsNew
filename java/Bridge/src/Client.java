
public class Client {

	public static void main(String[] args) {
		DarkTheme darkTheme =  new DarkTheme();
		LightTheme lightTheme = new LightTheme();
		
		Editor editor = new Editor();
		editor.setTheme(darkTheme); //> 1
		
		Terminal terminal = new Terminal();
		terminal.setTheme(lightTheme); //> 2
	}

}
