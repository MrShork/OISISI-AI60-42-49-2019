package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AddZaposleni extends JDialog {
	
	public AddZaposleni(MainFrame frame) 
	{
		super();
		setTitle("Dodavanje zaposlenog");
		setSize(500,500);
		setLocationRelativeTo(frame);
		setModalityType(JDialog.DEFAULT_MODALITY_TYPE);
		setResizable(false);
		
		JButton confirm=new JButton("Potvrdi");

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel ime = new JPanel();
		ime.setMaximumSize(new Dimension(300,25));
		ime.setLayout(new BoxLayout(ime, BoxLayout.X_AXIS));

		JPanel prezime = new JPanel();
		prezime.setMaximumSize(new Dimension(300,25));
		prezime.setLayout(new BoxLayout(prezime, BoxLayout.X_AXIS));
		
		JPanel datum_rodjenja = new JPanel();
		datum_rodjenja.setMaximumSize(new Dimension(300,25));
		datum_rodjenja.setLayout(new BoxLayout(datum_rodjenja, BoxLayout.X_AXIS));
		
		JPanel adresa_stanovanja = new JPanel();
		adresa_stanovanja.setMaximumSize(new Dimension(300,25));
		adresa_stanovanja.setLayout(new BoxLayout(adresa_stanovanja, BoxLayout.X_AXIS));
		
		
		JPanel Jmbg = new JPanel();
		Jmbg.setMaximumSize(new Dimension(300,25));
		Jmbg.setLayout(new BoxLayout(Jmbg, BoxLayout.X_AXIS));
		
		JPanel buttons = new JPanel();
		buttons.setMaximumSize(new Dimension(200,25));
		buttons.setLayout(new BoxLayout(buttons, BoxLayout.X_AXIS));
		
		Dimension dim=new Dimension(150,20);

        JLabel lblName=new JLabel("Ime");
        lblName.setPreferredSize(dim);
        JTextField txtName=new JTextField();
        txtName.setPreferredSize(dim);
        ime.add(lblName);
		ime.add(txtName);
        
        JLabel lblSurname=new JLabel("Prezime");
        lblSurname.setPreferredSize(dim);
        JTextField txtSurname=new JTextField();
        txtSurname.setPreferredSize(dim);
        prezime.add(lblSurname);
		prezime.add(txtSurname);        
        
        JLabel lblDate=new JLabel("Datum rodjenja");
        lblDate.setPreferredSize(dim);
        JTextField txtDate=new JTextField();
        txtDate.setPreferredSize(dim);
        datum_rodjenja.add(lblDate);
		datum_rodjenja.add(txtDate);
        
        JLabel lblAdress=new JLabel("Adresa stanovanja");
        lblAdress.setPreferredSize(dim);
        JTextField txtAdress=new JTextField();
        txtAdress.setPreferredSize(dim);
        
        adresa_stanovanja.add(lblAdress);
		adresa_stanovanja.add(txtAdress);
		
		JLabel lbljmbg=new JLabel("JMBG");
        lbljmbg.setPreferredSize(dim);
        JTextField txtjmbg=new JTextField();
        txtjmbg.setPreferredSize(dim);
     
        Jmbg.add(lbljmbg);
		Jmbg.add(txtjmbg);
		
		
		
	    JButton quit=new JButton("Odustani");
        quit.setPreferredSize(new Dimension(100,20));
		quit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				dispose();
				
			}
			
			
		});
		
		
		  confirm.setPreferredSize(new Dimension(100,20));
		  
		  buttons.add(confirm);
		  buttons.add(Box.createHorizontalStrut(30));
		  buttons.add(quit);
			
			panel.add(Box.createVerticalStrut(20));
			panel.add(ime);
			panel.add(Box.createVerticalStrut(20));
			panel.add(prezime);
			panel.add(Box.createVerticalStrut(20));
			panel.add(datum_rodjenja);
			panel.add(Box.createVerticalStrut(20));
			panel.add(adresa_stanovanja);
			panel.add(Box.createVerticalStrut(20));
			panel.add(Jmbg);
			panel.add(Box.createVerticalStrut(20));
			
			panel.add(Box.createVerticalStrut(20));
			panel.add(buttons);
			panel.add(Box.createVerticalStrut(20));
			
			add(panel);
			setVisible(true);
			
			
       
	}

}
