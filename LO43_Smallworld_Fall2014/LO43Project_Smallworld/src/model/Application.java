package model;

import java.awt.Image;

import javax.swing.JFrame;

import view.*;
import controller.*;

public class Application {
	private Window win;
	public NbPlayersWindow nbplay;
	public NewPlayerWindow newplay;
	public Turn turn;
	public Draw draw;
	public ChoicePpl choice;
	public Board board;
	
	public Application()
	{
		win=new Window();
		win.setVisible(true);
		
		nbplay = new NbPlayersWindow();
		nbplay.okbtAddListener(new ButtonListener(this));
		
		draw = new Draw();
		
	}
	
	//methods
	public void createNewTurn(){
		int i = nbplay.getNbPlayer();
		turn = new Turn(i);
		board = new Board(i);
		board.printBoard();
		
		newplay = new NewPlayerWindow(1);
		newplay.okbtAddListener(new ButtonListener(this));
	}

	public void createNewPlayerWindow(int lenght) {
		newplay = new NewPlayerWindow(lenght);
		newplay.okbtAddListener(new ButtonListener(this));	
	}
	
	public void createNewChoice() {
		choice = new ChoicePpl(turn, draw);	
		choice.choiceAddListeners(new ChoicePplListener(this));
	}

	public void replaceAvailable() {
		choice.replaceButtons(draw, turn);	
	}
	
	public void choiceErrorMess(int i) {
		switch (i) {
			case 1 :
				choice.mess1();
				break;
			case 2 :
				choice.mess2();
				break;
			case 3 : 
				choice.mess3();
				break;
			case 4 :
				choice.mess4();
				break;
		}
	}
	
	
	
	public static void main(String [] args)
	{
		Application app=new Application();
	}
	
	

	

	



	
}
