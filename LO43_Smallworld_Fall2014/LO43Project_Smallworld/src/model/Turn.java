package model;

import java.util.Vector;

public class Turn { //OK
	
	// attribute

  private int number;

  private int maxNumber;

  private int activePlayer;

  private Vector <Player> players;
  
  	// method

  public void nextPlayer() {
	  activePlayer=activePlayer+1;
  }

  public void nextTurn() {
  }

  public Turn() {
  }

}