package model;

import java.util.Vector;

public class Turn { //OK
	
	// attribute

  private int number;

  private int maxNumber;

  private int activePlayer;

  private Vector <Player> players;
  
  	//Constructors
  public Turn(){
	  number = 0;
	  maxNumber = 0;
	  activePlayer = 0;
	  players = new Vector <Player>();
  }
  
  public Turn(int pnumber, int pmaxNumber, int pactivePlayer){
	  number = pnumber;
	  maxNumber = pmaxNumber;
	  activePlayer = pactivePlayer;
	  players = new Vector <Player>();
  }
  
  public Turn(int nbPlayers){
	  players=new Vector<Player>(nbPlayers);
	  for (Player p : players){
		  p = new Player(players.indexOf(p)+1);
	  }
	  switch(nbPlayers){
	  	case 2: maxNumber = 8;
	  		break;
	  	case 3 : maxNumber = 8;
	  		break;
	  	case 4 : maxNumber = 9;
	  		break;
	  	case 5 : maxNumber = 10;
	  		break;
		  
	  }
  }
  
  	// method

  public void nextPlayer() {
	  activePlayer=activePlayer+1;
  }

  public void nextTurn() {
	  	number=number+1;
  }


}