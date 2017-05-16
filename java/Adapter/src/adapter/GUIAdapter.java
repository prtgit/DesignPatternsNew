package adapter;

public class GUIAdapter {
	WindowsGUI winGUI;
	LinuxGUI linuxGUI;
	MacGUI macGUI;

	boolean isWindows;
	boolean isLinux;

	public GUIAdapter(String operatingSystem) {
		if (operatingSystem.contains("Windows")) {
			winGUI = new WindowsGUI();
			isWindows = true;
		} else if (operatingSystem.contains("Linux")) {
			linuxGUI = new LinuxGUI();
			isLinux = true;
		} else {
			macGUI = new MacGUI();
		}

	}

	public void display() {
		if (isWindows) {
			winGUI.displayAWTApp(); // > 1
		} else if (isLinux) {
			linuxGUI.displaySwingApp(); // > 2
		} else {
			macGUI.display(); // > 3
		}
	}
}
