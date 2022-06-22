package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





import view.DeleteZaposleni;



//import view.EditSubject;
import view.MainFrame;

public class DialogController {
	public static ActionListener deleteDialog(){
		return new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			
					MainFrame mainFrame =MainFrame.getInstance();
					switch(mainFrame.getSelectedTab()) {
						case 0:
							new DeleteZaposleni(mainFrame);
							break;
						case 1:
							new DeleteZaposleni(mainFrame);
							break;
				
				}
			} 

	};
	

}
	}
