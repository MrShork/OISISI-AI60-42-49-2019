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
	    JMenu miOpen =new JMenu("Open");		
	    JMenuItem miProject=new JMenuItem("Zaposleni");	
	    JMenuItem miPackage=new JMenuItem("Softveri");
	    miOpen.add(miProject);
	    miOpen.addSeparator();
	    miOpen.add(miPackage);
		
		JMenuItem miNew =new JMenuItem("New");
		JMenuItem miClose =new JMenuItem("Exit");
		
		
		file.add(miNew);
		file.addSeparator();
		file.add(miOpen);
		
		
		file.addSeparator();
		file.add(miClose);
		
		file.addSeparator();
		
		
		
		JMenu edit=new JMenu("Edit");
		 JMenuItem miEdit=new JMenuItem("Edit");
		 JMenuItem miDelete=new JMenuItem("Delete");
		
		JMenu help=new JMenu("Help");
		JMenuItem miAbout=new JMenuItem("About");
		
		edit.add(miEdit);
		edit.add(miDelete);
		help.add(miAbout);
		
		add(file);
		add(edit);
		add(help);
		
	}

}



