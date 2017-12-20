package fitz.main;

import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * 
 * @author Scott
 *
 */

public class BuildGUI extends JFrame {
	
	/*
	 * GUI elements for application
	 */

	private JFrame mainFrame;
	
	public BuildGUI() {
		
	}
	
	
	public void initGUI() {
		mainFrame = new JFrame();
		mainFrame.setTitle("Banking App");
		mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon logo = new ImageIcon("resources/logo.png");
		mainFrame.setIconImage(logo.getImage());
		createMenuBar();
		
	}
	
	private void createMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Open");
		openItem.setToolTipText("Open an Item");
		
		JMenuItem exitItem = new JMenuItem("Exit");
		exitItem.setToolTipText("Exit the program");
		exitItem.addActionListener((ActionEvent event) -> {
			System.exit(0);
		});
		
		fileMenu.add(openItem);
		fileMenu.add(exitItem);
		
		JMenu optionMenu = new JMenu("Options");
		JMenuItem setItem = new JMenuItem("Set..");
		optionMenu.add(setItem);
		
		menuBar.add(fileMenu);
		menuBar.add(optionMenu);
		mainFrame.setJMenuBar(menuBar);
	}
}
