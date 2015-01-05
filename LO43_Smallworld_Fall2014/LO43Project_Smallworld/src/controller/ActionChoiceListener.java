package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Application;

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
			app.board.putUnitsAway(app.turn.getPlayers().get(app.turn.getActive()));
			app.board.conquer(app.turn.getPlayers().get(app.turn.getActive()),false); //DEBUG
			/*****!!!****/

		}else if (source.getName()=="bt2"){//deploy
			app.actions.action.pan1.conquerbt.setVisible(false);
			app.actions.action.pan1.deploybt.setEnabled(false);getClass();
			app.lockButtons(false);
			app.board.putUnitsAway(app.turn.getPlayers().get(app.turn.getActive()));
			app.board.deploy(app.turn.getPlayers().get(app.turn.getActive()), 3, 1);
			//mtn faut aussi les replacer
			
		}else if (source.getName()=="bt3"){ //finish turn
		//	app.turn.getPlayers().get(app.turn.getActive()).addGold(app.board.countPoints(app.turn.getPlayers().get(app.turn.getActive())));
			app.turn.nextPlayer();
			if(app.turn.getNumber()>app.turn.getMaxNumber()){
				app.turn.determineVictory();//décompte des points
			}
			app.lockButtons(true);
			app.actions.action.pan1.conquerbt.setText("Conquer");
			app.actions.action.pan1.conquerbt.setVisible(true);
			app.actions.action.pan1.deploybt.setEnabled(true);
			app.replaceAvailable();			
		}
	}
}
