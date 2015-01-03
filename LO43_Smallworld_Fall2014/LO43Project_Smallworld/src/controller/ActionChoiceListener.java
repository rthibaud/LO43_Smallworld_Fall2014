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
			
		}else if(source.getName()=="fbt1"){ //1st conquest
			
			
		}else if (source.getName()=="bt2"){
				
			
		}else if (source.getName()=="bt3"){
			app.turn.nextPlayer();
			app.lockButtons(true);
			app.actions.pan1.conquerbt.setText("Conquer");
			app.actions.pan1.conquerbt.setName("bt1");
			app.replaceAvailable();
			
		}
	}
}
