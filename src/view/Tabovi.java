package view;

import javax.swing.JTabbedPane;
import javax.swing.RowFilter;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Comparator;

public class Tabovi extends JTabbedPane {
	private static Tabovi instance = null;

	
	public static Tabovi getInstance() {
		if(instance == null)
		{
			instance = new Tabovi();
		}
		return instance;
	}
	public Tabovi() {

		JPanel panel= new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.setSize(1*Toolkit.getDefaultToolkit().getScreenSize().width/5,2*Toolkit.getDefaultToolkit().getScreenSize().height/5);
		 
		JPanel panel1= new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
		panel1.setSize(1*Toolkit.getDefaultToolkit().getScreenSize().width/5,2*Toolkit.getDefaultToolkit().getScreenSize().height/5);
		
		
		addTab("Zaposleni",panel);
		addTab("Softveri",panel1);
		setVisible(true);
}
	}
