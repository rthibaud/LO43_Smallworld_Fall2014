package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Application;
import model.Player;

public class ActionChoiceListener implements ActionListener{
	
private Application app;
	
	public ActionChoiceListener(Application application) {
		app=application;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		JButton source=(JButton) e.getSource();
		if(source.getName()=="bt1"){ //normal conquest
			app.lockButtons(false);
			/*****!!!****/
			app.board.conquer(app.turn.getPlayers().get(app.turn.getActive()),3,false); //DEBUG
			/*****!!!****/
		}else if(source.getName()=="fbt1"){ //1st conquest -> normalement ce cas est inclus dans la methode conquer
			/*****!!!****/
			app.board.conquer(app.turn.getPlayers().get(app.turn.getActive()),3,false); //DEBUG
			/*****!!!****/
			
		}else if (source.getName()=="bt2"){//deploy
			app.actions.pan1.conquerbt.setVisible(false);
			app.actions.pan1.deploybt.setEnabled(false);getClass();
			app.lockButtons(false);
			app.board.putUnitsAway(app.turn.getPlayers().get(app.turn.getActive()));
			//mtn faut aussi les replacer
			
		}else if (source.getName()=="bt3"){ //finish turn
	//		app.turn.getPlayers().get(app.turn.getActive()).addGold(app.board.countPoints(app.turn.getPlayers().get(app.turn.getActive())));
			app.turn.nextPlayer();
			app.lockButtons(true);
			app.actions.pan1.conquerbt.setText("Conquer");
			app.actions.pan1.conquerbt.setName("bt1");
			app.actions.pan1.conquerbt.setVisible(true);
			app.actions.pan1.deploybt.setEnabled(true);
			app.replaceAvailable();
			
		}
	}
}
