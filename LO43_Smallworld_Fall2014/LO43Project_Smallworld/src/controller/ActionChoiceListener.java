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
		if(source.getName()=="bt1"){
			
		}else if (source.getName()=="bt2"){
				
			
		}
	}
}
