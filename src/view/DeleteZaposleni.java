package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controllers.DialogController;

public class DeleteZaposleni extends JDialog{

	public DeleteZaposleni(MainFrame mainFrame) {
		// TODO Auto-generated constructor stub
		super();
		
		setTitle("Brisanje Studenta");
		setSize(300,200);
		setLocationRelativeTo(mainFrame);
		setModalityType(JDialog.DEFAULT_MODALITY_TYPE);
		setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		add(panel);
		
		JPanel message = new JPanel();
		message.setLayout(new BoxLayout(message, BoxLayout.X_AXIS));
		
		JLabel lblMessage = new JLabel("Da li ste sigurni da zelite da obrisete zaposlenog?");
		message.add(lblMessage);
		
		
		JPanel buttons = new JPanel();
		buttons.setMaximumSize(new Dimension(200,25));
		buttons.setLayout(new BoxLayout(buttons, BoxLayout.X_AXIS));
		
		JButton confirm=new JButton("Potvrdi");
		confirm.setPreferredSize(new Dimension(100,20));
		confirm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				// TODO Auto-generated method stub
				//DialogController.getInstance().deleteStudent();
				dispose();
			}
        });
	    JButton quit=new JButton("Odustani");
	    quit.setPreferredSize(new Dimension(100,20));
		quit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				// TODO Auto-generated method stub
				
				dispose();
			}
        });
	    buttons.add(confirm);
	    buttons.add(Box.createHorizontalStrut(30));
	    buttons.add(quit);
		
		panel.add(Box.createVerticalStrut(20));
		panel.add(Box.createVerticalStrut(20));
		panel.add(Box.createVerticalStrut(20));
		panel.add(message);
		panel.add(Box.createVerticalStrut(20));
		panel.add(Box.createVerticalStrut(20));
		panel.add(buttons);
		
		setVisible(true);	
	}

}