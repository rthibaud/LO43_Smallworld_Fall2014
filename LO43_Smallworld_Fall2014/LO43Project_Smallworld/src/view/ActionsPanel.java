package view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Draw;
import model.Turn;

public class ActionsPanel extends JPanel {
	public ActionChoicePanel pan1;
	public ChoicePpl pan2;
	
	
	public ActionsPanel(Turn turn, Draw draw){
		//this.setTitle("Game");		
		Toolkit toolkit = getToolkit();
		Dimension screenDim = toolkit.getScreenSize(); //gets the screen's resolution
		this.setBounds(screenDim.width/2-175,screenDim.height/2-125,500,600); //creates the window in the middle of the screen
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLocationRelativeTo(null);
		//this.setResizable(false);
		this.setVisible(true);
		
		//creates the container
		final JPanel container = new JPanel();
		//this.setContentPane(container);
		
		//creates the elements 
		pan1 = new ActionChoicePanel(turn);
		pan2 = new ChoicePpl(turn, draw);
		
		container.setLayout(new GridLayout(1,2));
		
		//adds the elements
		this.add(pan1);
		this.add(pan2);
	}	
	
	public void addListeners(ActionListener a, ActionListener b){
		pan1.actionAddListeners(a);
		pan2.choiceAddListeners(b);
	}

	public void actualise(Draw draw, Turn turn) {
		pan2.replaceButtons(draw, turn);
		pan1.actualise(turn);
	}
	
	public void choiceErrMsg(int i){
		switch (i) {
		case 1 :
			pan2.mess1();
			break;
		case 2 :
			pan2.mess2();
			break;
		case 3 : 
			pan2.mess3();
			break;
		case 4 :
			pan2.mess4();
			break;
	}

	}

	public void lockbt(boolean bool) {
		if (bool == false)
			pan2.lockbt();
		else
			pan2.unlockbt();
	}
}
