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

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.SwingUtilities;



public class MainFrame extends JFrame {
	
	public MainFrame() { 
		 super(); 
		 setSize(300, 200); // Dimenzije su inicijalno (0, 0)
		 setTitle("My First GUI App"); 
		 }
	
	
	
	
}