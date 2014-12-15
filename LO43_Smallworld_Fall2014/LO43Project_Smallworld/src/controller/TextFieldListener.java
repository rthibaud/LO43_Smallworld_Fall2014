package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import model.Application;

public class TextFieldListener implements ActionListener {

	private Application app;
	
	public TextFieldListener(Application application) {
		app=application;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		JTextField source=(JTextField) e.getSource();
		//if(source.getName()=="")
			
	}
}