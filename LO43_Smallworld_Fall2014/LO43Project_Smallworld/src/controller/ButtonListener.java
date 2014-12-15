package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

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
			//app.getNbplay().getContentPane().getTopLevelAncestor()).dispose() ;
		}
	}

}
