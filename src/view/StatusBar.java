package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.BevelBorder;




public class StatusBar extends JPanel{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	static JLabel statusLabel;
		
	
	public StatusBar()
	{
		super();
	
		JPanel statusBar = new JPanel();
		statusBar.setBorder(new BevelBorder(BevelBorder.LOWERED));
		
		
		
		statusBar.setLayout(new BoxLayout(statusBar, BoxLayout.X_AXIS));
		 statusLabel = new JLabel("Status bar");
		statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
		 
		 
		
		JLabel statusLabel2 = new JLabel();
	
		
	
		/*DateTimeFormatter dtf = DateTimeFormatter.ofPattern(" HH:mm dd/MM//yyyy");
		statusLabel2.setText(dtf.format(LocalDateTime.now()).toString());
		statusBar.add(statusLabel2);*/
		Timer timer = new Timer(1000, e -> {
	        Date date = new Date();
	        statusLabel2.setText(date.toString());
	    });
	    timer.setInitialDelay(0);
	    timer.start();
	   
	    
		statusBar.add(statusLabel);
		statusBar.add(Box.createHorizontalGlue());
		statusBar.add(statusLabel2);
		
		
		add("South",statusBar);
		
		
		

		
		
	}
	}
	

	