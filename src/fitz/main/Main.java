package fitz.main;

import javax.swing.SwingUtilities;

/**
 * 
 * @author Scott
 *
 */

public class Main {

	/*
	 * GUI elements for application
	 */

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			System.out.println("Program Started");
			BuildGUI gui = new BuildGUI();
			gui.initGUI();
        });
	}
	

}
