package model;

import view.*;
import controller.*;

public class Application {
	private Window win;
	public NbPlayersWindow nbplay;
	
	public Application()
	{
		win=new Window();
		win.setVisible(true);
		
		nbplay = new NbPlayersWindow();
		nbplay.okbtAddListener(new ButtonListener(this));
	}
	
	//methods
	public void createNewTurn(){
		int i = nbplay.getNbPlayer();
		Turn turn = new Turn(i);
	}
	
	
	
	public static void main(String [] args)
	{
		Application app=new Application();
	}
}
