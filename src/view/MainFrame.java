package view;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import java.awt.Dimension; 
import java.awt.Image; 
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.SwingUtilities;



public class MainFrame extends JFrame {
	
	public MainFrame() { 
		Toolkit kit = Toolkit.getDefaultToolkit(); 
		 Dimension screenSize = kit.getScreenSize(); 
		 int screenHeight = screenSize.height; 
		 int screenWidth = screenSize.width; 
		 // Podesavamo dimenzije prozora na polovinu dimenzija ekrana
		 setSize(screenWidth / 2, screenHeight / 2); 
		 // Dodeljujemo ikonu 
		 Image img = kit.getImage("images/iko.jpg"); 
		 setIconImage(img); 
		 //Podesavamo naslov
		 setTitle("My Second GUI App"); 
		 //Postavljamo akciju pri zatvaranju prozora
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		 }
	
	
	
	
}
