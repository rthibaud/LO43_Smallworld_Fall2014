package model;

import javax.swing.JFrame;

import view.*;
import controller.*;

public class Application {
	private Window win;
	public NbPlayersWindow nbplay;
	public NewPlayerWindow newplay;
	public Turn turn;
	
	public Application()
	{
		win=new Window();
		win.setVisible(true);
		
		nbplay = new NbPlayersWindow();
		nbplay.okbtAddListener(new ButtonListener(this));
		
		Draw draw = new Draw();
		
	}
	
	//methods
	public void createNewTurn(){
		int i = nbplay.getNbPlayer();
		turn = new Turn(i);
		
		newplay = new NewPlayerWindow(1);
		newplay.okbtAddListener(new ButtonListener(this));
	}

	public void createNewPlayerWindow(int lenght) {
		newplay = new NewPlayerWindow(lenght);
		newplay.okbtAddListener(new ButtonListener(this));	
	}
	
	
	
	public static void main(String [] args)
	{
		Application app=new Application();
	}

	
}
