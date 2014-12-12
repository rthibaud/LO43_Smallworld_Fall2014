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
  
  	// method

  public void nextPlayer() {
	  activePlayer=activePlayer+1;
  }

  public void nextTurn() {
  }


}