package adapter;

import javax.swing.JFrame;

public class LinuxGUI {

	public void displaySwingApp() {
		JFrame jframe = new JFrame("Linux Application");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		jframe.setSize(300, 300);
	}

}
