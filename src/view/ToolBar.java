package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.RowSorter;
import javax.swing.SwingConstants;


import javax.swing.Box;
import javax.swing.JTextField;



public class ToolBar extends JToolBar{
	
	public ToolBar(){
		//u konstruktor nadklase, tj klse JToolbar prosleđuje
		//se orijentacija toolbar-a, moguća i sa konstantom: SwingConstants.VERTICAL
		
		super(SwingConstants.HORIZONTAL);
		JButton btnNew = new JButton();
		btnNew.setToolTipText("New");
		btnNew.setIcon(new ImageIcon("images/add.png"));
		add(btnNew);

		addSeparator();

		JButton btnOpen = new JButton();
		btnOpen.setToolTipText("Open");
		btnOpen.setIcon(new ImageIcon("images/edit.png"));
		add(btnOpen);
	
		addSeparator();
		
		JToggleButton tglBtnBold=new JToggleButton();
		tglBtnBold.setToolTipText("Bold");
		tglBtnBold.setIcon(new ImageIcon("images/delete.png"));
		add(tglBtnBold);
		

		//toolbar je pokretljiv, probati i sa statičnim toolbarom
		setFloatable(true);
		setBackground(new Color(255,255,204));
	
}

}
