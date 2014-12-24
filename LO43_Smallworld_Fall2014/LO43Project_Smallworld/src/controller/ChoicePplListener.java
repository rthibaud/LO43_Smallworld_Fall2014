package controller;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;

import model.Application;

public class ChoicePplListener implements ActionListener {
	
	private Application app;
	
	public ChoicePplListener(Application application) {
		app=application;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		JButton source=(JButton) e.getSource();
		if(source.getName()=="bt1"){
			if (app.turn.getPlayers().get(app.turn.getActive()).canDraw()){
				app.draw.drawAvailable(0, app.turn.getPlayers().get(app.turn.getActive()));
				app.turn.nextPlayer();
				app.replaceAvailable();
				
			}else{
				app.choiceErrorMess1();
			}
		}else if (source.getName()=="bt2"){
			if (app.turn.getPlayers().get(app.turn.getActive()).canDraw()){
				app.draw.drawAvailable(1, app.turn.getPlayers().get(app.turn.getActive()));
				app.turn.nextPlayer();
				app.replaceAvailable();
			}else{
				app.choiceErrorMess1();
			}
		}else if (source.getName()=="bt3"){
			if (app.turn.getPlayers().get(app.turn.getActive()).canDraw()){
				app.draw.drawAvailable(2, app.turn.getPlayers().get(app.turn.getActive()));
				app.turn.nextPlayer();
				app.replaceAvailable();
				
			}else{
				app.choiceErrorMess1();
			}
		}else if (source.getName()=="bt4"){
			if (app.turn.getPlayers().get(app.turn.getActive()).canDraw()){
				app.draw.drawAvailable(3, app.turn.getPlayers().get(app.turn.getActive()));
				app.turn.nextPlayer();
				app.replaceAvailable();
				
			}else{
				app.choiceErrorMess1();
			}
		}else if (source.getName()=="bt5"){
			if (app.turn.getPlayers().get(app.turn.getActive()).canDraw()){
				app.draw.drawAvailable(4, app.turn.getPlayers().get(app.turn.getActive()));
				app.turn.nextPlayer();
				app.replaceAvailable();
				
			}else{
				app.choiceErrorMess1();
			}
		}else if (source.getName()=="bt6"){
			if (app.turn.getPlayers().get(app.turn.getActive()).canDraw()){
				app.draw.drawAvailable(5, app.turn.getPlayers().get(app.turn.getActive()));
				app.turn.nextPlayer();
				app.replaceAvailable();
				
			}else{
				app.choiceErrorMess1();
			}	
		}
	}

}
