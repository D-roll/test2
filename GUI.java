package demo;

import javax.swing.*;

public class GUI {
	
	public static void setUpGui() {
		JFrame frame = new JFrame("被导入的构架");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setVisible(true);
	}
}