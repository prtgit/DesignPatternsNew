package adapter;

public class AdapterClient {
	
	// For the purpose of understanding we assume that 
	// Our application in Linux requires Swing. While 
	// windows application would use AWT.
	public static void main(String[] args) {
		GUIAdapter gui = new GUIAdapter(getOperatingSystem());
		gui.display();
	}
	
	
	public static String getOperatingSystem() {
		return System.getProperty("os.name");
	}
}
