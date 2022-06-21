package view;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.JRadioButtonMenuItem;



public class MenuBar extends JMenuBar{
	
	public MenuBar (){
		
	    JMenu file=new JMenu("File");
	    JMenu miNew =new JMenu("New");
		JMenuItem miProject=new JMenuItem("Project");
		JMenuItem miPackage=new JMenuItem("Package");
		miNew.add(miProject);
		miNew.addSeparator();
		miNew.add(miPackage);
		
		JMenuItem miOpen =new JMenuItem("Open");
		JMenuItem miClose =new JMenuItem("Close");
		JMenuItem miCloseAll =new JMenuItem("Close All");
				
		file.add(miNew);
		file.addSeparator();
		file.add(miOpen);
		file.addSeparator();
		file.add(miClose);
		file.add(miCloseAll);
		file.addSeparator();
		
		//radio button-i u ovom primeru rade kao grupa:
		ButtonGroup bg1=new ButtonGroup();
		JRadioButtonMenuItem rmiInsert=new 
		JRadioButtonMenuItem("Insert",true);
		JRadioButtonMenuItem rmiOver=new
		JRadioButtonMenuItem("Overtype");
		bg1.add(rmiInsert);
		bg1.add(rmiOver);
		
		file.add(rmiInsert);
		file.add(rmiOver);
		
		JMenu edit=new JMenu("Edit");
		JMenu source=new JMenu("Source");
		
		add(file);
		add(edit);
		add(source);
		
	}

}

