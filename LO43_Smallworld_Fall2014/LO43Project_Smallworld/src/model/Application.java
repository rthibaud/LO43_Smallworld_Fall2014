package model;


import view.*;
import controller.*;

public class Application {
	private Window win;
	public NbPlayersWindow nbplay;
	public NewPlayerWindow newplay;
	public Turn turn;
	public Draw draw;
	public Window actions;
	public Board board;
	
	public Application()
	{
		//win=new Window();
		//win.setVisible(true);
		
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
	
	public void createNewActionsWindow() {
		actions = new Window(turn, draw);	
		//actions.addListeners(new ActionChoiceListener(this), new ChoicePplListener(this));
	}

	public void replaceAvailable() {
		//actions.actualise(draw, turn);	
	}
	
	public void choiceErrorMess(int i) {
		//actions.choiceErrMsg(i);
	}
	
	
	public static void main(String [] args)
	{
		Application app=new Application();
	}

	public void lockButtons(boolean bool) {
		//actions.lockbt(bool);	
	}
	



	
}
