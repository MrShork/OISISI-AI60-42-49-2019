//package view;
//
//
//import java.awt.BorderLayout;
//import java.awt.Dimension;
//import java.awt.Toolkit;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.util.List;
//import java.util.Locale;
//import java.util.ResourceBundle;
//import java.util.concurrent.Executors;
//import java.util.concurrent.ScheduledExecutorService;
//import java.util.concurrent.TimeUnit;
//
//import java.awt.Dimension; 
//import java.awt.Image; 
//import java.awt.Toolkit;
//
//import javax.swing.BoxLayout;
//import javax.swing.JFrame;
//import javax.swing.JTable;
//import javax.swing.SwingUtilities;
//
//
//
//public class MainFrame extends JFrame {
//	
//private static MainFrame instance = null;
//	
//	public static MainFrame getInstance() {
//		if(instance == null)
//		{
//			instance = new MainFrame();
//			
//		}
//		return instance;
//	}
//	private StatusBar statusBar;
//	
//
//	
//	
//	public MainFrame() {
//		
//		Toolkit kit = Toolkit.getDefaultToolkit();
//        Dimension screenSize = kit.getScreenSize();
//        int screenHeight = screenSize.height;
//        int screenWidth = screenSize.width;
//        setSize(screenWidth / 2, screenHeight / 2);
//        setTitle("Aplikacija");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLocationRelativeTo(null);
//
//        //kreiranje naslednika klase JMenuBar i njeno postavljanje u glavni prozor aplikacije
//        MenuBar menu=new MenuBar();
//        this.setJMenuBar(menu);
//
//      //kreiramo instancu klase Toolbar
 //       ToolBar toolbar=new ToolBar();
//        //dodajemo u Frame naš Toolbar, klasa BorderLayout se odnosi na rad sa prostorim rasporedom
//        //komponenti, za sada je dovoljno znati da na ovaj način Toolbar se postavlja na vrh glavne forme
 //       add(toolbar, BorderLayout.NORTH);
 //  	    statusBar = new StatusBar();
//		statusBar.setLayout(new BoxLayout(statusBar, BoxLayout.X_AXIS));
//		this.add(statusBar, BorderLayout.SOUTH);
//		add(Tabovi.getInstance());
//		
//	
//	}
//	
//	
//}



package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

import model.BaseofZaposleni;
import model.BaseofSoftware;
import model.Softver;
import model.Zaposleni;
import model.Cetkica;
import view.ToolBar;
import view.StatusBar;
import model.Adresa;
//import Utils;


public class MainFrame extends JFrame implements ChangeListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7240939624608584060L;
	protected int currentTab = 0;
	
	JTable zaposleniTable;
	JTable softwareTable;
	DefaultTableModel wtModel;
	Object[][] contentZaposleni;
	int velicinaZaposleni;
	
	JTabbedPane myTabbedPane;
	JScrollPane ztScrollPane;
	
	int selectedIndex;
	
	public int getSelectedIndex() {
		int selectedIndex;
		
		if (currentTab == 0) {
			selectedIndex = zaposleniTable.getSelectedRow();
		} else {
			selectedIndex = softwareTable.getSelectedRow();
		}
		
		System.out.println(selectedIndex);			
		return selectedIndex;
	}
	
	public void osvezi() {
		uradiOpetFor();
		System.out.println("ovo radi");
	}
	
	
	
	private void uradiOpetFor() {
		
		dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
		
		myTabbedPane.removeAll();
		
		generisiTabele();
		
		this.setVisible(true);
	}
	private StatusBar statusBar;
	public MainFrame(){
	
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int Height = screenSize.height;
		int Width = screenSize.width;
		
		// glavni meni aplikacije - ActionListener
		MenuBar menu=new MenuBar();
		this.setJMenuBar(menu);
		ToolBar toolbar=new ToolBar();
//      //dodajemo u Frame naš Toolbar, klasa BorderLayout se odnosi na rad sa prostorim rasporedom
//      //komponenti, za sada je dovoljno znati da na ovaj način Toolbar se postavlja na vrh glavne forme
		add(toolbar, BorderLayout.NORTH);
 	    statusBar = new StatusBar();
		statusBar.setLayout(new BoxLayout(statusBar, BoxLayout.X_AXIS));
		this.add(statusBar, BorderLayout.SOUTH);
		// toolbar aplikacije - ActionListener
		//ToolBar toolbar = new ToolBar(this);
		//add(toolbar, BorderLayout.NORTH);
	
		setSize(Width*3/4,Height*3/4);
		setTitle("Programcic");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setBackground(Color.RED);
//		
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		LocalDateTime currentTime = LocalDateTime.now();  
//		System.out.println(dtf.format(currentTime));
	
//		JPanel statusPanel = new JPanel();
//		statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
//		add(statusPanel, BorderLayout.SOUTH);
//		statusPanel.setPreferredSize(new Dimension(getWidth(), 24));
//		statusPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
//		JLabel statusLabel = new JLabel(dtf.format(currentTime));
//		
//		
//		statusPanel.add(statusLabel);
		
		myTabbedPane = new JTabbedPane();
		
		generisiTabele();
		
		myTabbedPane.addChangeListener(this);
		
		currentTab = myTabbedPane.getSelectedIndex();

		this.add(myTabbedPane);
		

	}
	
	private void generisiTabele() {
//		Pravljenje tabele zaposlenih
		String[] zaposleniHeader = new String[] { "Ime", "Prezime", "JMBG", "Datum rodjenja", "Email", "Adresa", "Softver"};
		
		velicinaZaposleni = BaseofZaposleni.getZaposleni().size();
		contentZaposleni = new Object[velicinaZaposleni][zaposleniHeader.length];
		for(int i = 0; i < velicinaZaposleni; i++) {
			Zaposleni zaposleni = BaseofZaposleni.getZaposleni().get(i);
			contentZaposleni[i][0] = zaposleni.getIme();
			contentZaposleni[i][1] = zaposleni.getPrezime();
			contentZaposleni[i][2] = zaposleni.getJmbg();
			contentZaposleni[i][3] = zaposleni.getDatum_rodjenja();
			contentZaposleni[i][4] = zaposleni.getEmail_adresa();
			contentZaposleni[i][5] = zaposleni.getAdresa_stanovanja().getUlica() + " " + zaposleni.getAdresa_stanovanja().getBroj() + ", " + zaposleni.getAdresa_stanovanja().getGrad();
			contentZaposleni[i][6] = zaposleni.getSoftveri();
			
		}
		
		wtModel = new DefaultTableModel(contentZaposleni, zaposleniHeader);
		zaposleniTable = new JTable(wtModel);
		
		zaposleniTable.setRowSelectionAllowed(true);
		zaposleniTable.setColumnSelectionAllowed(false);
		zaposleniTable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		zaposleniTable.setDefaultEditor(Object.class, null);
		JScrollPane ztScrollPane = new JScrollPane(zaposleniTable);
	
		
//		Pravljenje tabele softvera		
		String[] softverHeader = new String[] { "Naziv", "Cetkice", "Format fajla", "Alati", "Render" };

		int velicinaSoftver = BaseofSoftware.getSoftveri().size();
		Object[][] contentSoftver = new Object[velicinaSoftver][softverHeader.length];
		for(int i = 0; i < velicinaSoftver; i++) {
			Softver softver = BaseofSoftware.getSoftveri().get(i);
			String cetkiceString = "";
			int brojCetkica = 0;
			for(int j = 0; j < softver.getCetkice().size(); j++) {
				if(brojCetkica != 0) {
					cetkiceString += ", ";
				}
				cetkiceString += softver.getCetkice().get(j).getNaziv();
				brojCetkica ++;
			}
			contentSoftver[i][0] = softver.getNaziv();
			contentSoftver[i][1] = cetkiceString;
			contentSoftver[i][2] = softver.getFormat();
			contentSoftver[i][3] = softver.getAlatiZaAnimaciju();
			contentSoftver[i][4] = softver.getRender().getNaziv();
		}
		
		DefaultTableModel stModel = new DefaultTableModel(contentSoftver, softverHeader);
		softwareTable = new JTable(stModel);
		
		softwareTable.setRowSelectionAllowed(true);
		softwareTable.setColumnSelectionAllowed(false);
		softwareTable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		softwareTable.setDefaultEditor(Object.class, null);
		JScrollPane stScrollPane = new JScrollPane(softwareTable);
		
		myTabbedPane.addTab("Zaposleni", ztScrollPane);
		myTabbedPane.addTab("Softver", stScrollPane);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
        JTabbedPane tabbedPane = (JTabbedPane) e.getSource();
        currentTab = tabbedPane.getSelectedIndex();
	} 
	

}


