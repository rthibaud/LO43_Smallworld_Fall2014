package controller;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;

import model.Application;

public class ButtonListener implements ActionListener {
	
	private Application app;
	
	public ButtonListener(Application application) {
		app=application;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		JButton source=(JButton) e.getSource();
		if(source.getName()=="okbtNbPlayer"){
			app.createNewTurn();
			((Window) ((JComponent) app.nbplay.getContentPane()).getTopLevelAncestor()).dispose() ;
		}else if (source.getName()=="okbtNew"){
			app.turn.addPlayer(app.newplay.readJTF(), app.turn.getLenght());
			((Window) ((JComponent) app.newplay.getContentPane()).getTopLevelAncestor()).dispose() ;
			if(app.turn.getLenght()!=app.turn.getNbPlayers()){
				app.createNewPlayerWindow(app.turn.getLenght()+1);
			}else{
				//FAUDRA FAIRE APPARAITRE LE PLATEAU ICI !!!!!!
				app.createNewActionsWindow();
				
			}
			
		}
	}

}
