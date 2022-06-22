package view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import model.BaseofZaposleni;
import model.BaseofSoftware;
import model.Softver;
import model.Zaposleni;
import model.Cetkica;
import view.ToolBar;
import view.StatusBar;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MainFrame mainframe = new MainFrame();
		//mainframe.setVisible(true);
		BaseofZaposleni.popuniListe();
		BaseofSoftware.popuniListe();
		
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
		//frame.addWindowListener(new WindowAdapter() {
		//	public void windowClosing(WindowEvent e) {
				
		//	}
	//	});
	}

}
