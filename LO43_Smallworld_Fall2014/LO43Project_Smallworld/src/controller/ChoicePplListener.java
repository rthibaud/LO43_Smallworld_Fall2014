package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

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
				if (app.turn.getPlayers().get(app.turn.getActive()).getGold()>=0){
					app.draw.drawAvailable(0, app.turn.getPlayers().get(app.turn.getActive()));
					app.replaceAvailable();
					app.lockButtons(false);
				}else
					app.choiceErrorMess(1);	
			}else{
				app.choiceErrorMess(3);
			}
		}else if (source.getName()=="bt2"){
			if (app.turn.getPlayers().get(app.turn.getActive()).canDraw()){
				if (app.turn.getPlayers().get(app.turn.getActive()).getGold()>=1){
					app.draw.drawAvailable(1, app.turn.getPlayers().get(app.turn.getActive()));
					app.replaceAvailable();
					app.lockButtons(false);
				}else
					app.choiceErrorMess(1);	
			}else{
				app.choiceErrorMess(3);
			}
		}else if (source.getName()=="bt3"){
			if (app.turn.getPlayers().get(app.turn.getActive()).canDraw()){
				if (app.turn.getPlayers().get(app.turn.getActive()).getGold()>=2){
					app.draw.drawAvailable(2, app.turn.getPlayers().get(app.turn.getActive()));
					app.replaceAvailable();
					app.lockButtons(false);
				}else
					app.choiceErrorMess(1);	
				
			}else{
				app.choiceErrorMess(3);
			}
		}else if (source.getName()=="bt4"){
			if (app.turn.getPlayers().get(app.turn.getActive()).canDraw()){
				if (app.turn.getPlayers().get(app.turn.getActive()).getGold()>=3){
					app.draw.drawAvailable(3, app.turn.getPlayers().get(app.turn.getActive()));
					app.replaceAvailable();
					app.lockButtons(false);
				}else
					app.choiceErrorMess(1);			
			}else{
				app.choiceErrorMess(3);
			}
		}else if (source.getName()=="bt5"){
			if (app.turn.getPlayers().get(app.turn.getActive()).canDraw()){
				if (app.turn.getPlayers().get(app.turn.getActive()).getGold()>=4){
					app.draw.drawAvailable(4, app.turn.getPlayers().get(app.turn.getActive()));
					app.replaceAvailable();
					app.lockButtons(false);
				}else
					app.choiceErrorMess(1);	
			}else{
				app.choiceErrorMess(3);
			}
		}else if (source.getName()=="bt6"){
			if (app.turn.getPlayers().get(app.turn.getActive()).canDraw()){
				if (app.turn.getPlayers().get(app.turn.getActive()).getGold()>=5){
					app.draw.drawAvailable(5, app.turn.getPlayers().get(app.turn.getActive()));
					app.replaceAvailable();
					app.lockButtons(false);
				}else
					app.choiceErrorMess(1);	
			}else{
				app.choiceErrorMess(3);
			}	
		}else if (source.getName()=="btdec"){
			if (app.turn.getPlayers().get(app.turn.getActive()).canDraw()){
				app.choiceErrorMess(4);
			}else{
				if(app.turn.getPlayers().get(app.turn.getActive()).getDeclinePpl()!=null){
					app.draw.addPow(app.turn.getPlayers().get(app.turn.getActive()).getDeclinePower());
					app.turn.getPlayers().get(app.turn.getActive()).getDeclinePpl().init();
					app.draw.addPpl(app.turn.getPlayers().get(app.turn.getActive()).getDeclinePpl());
				}
				app.board.putUnitsAway(app.turn.getPlayers().get(app.turn.getActive()));
				app.turn.getPlayers().get(app.turn.getActive()).putPplDecline();
				app.replaceAvailable();
				app.lockButtons(false);
				app.actions.action.pan1.finishbt.setVisible(true);
			}
			
		}
	}

}
