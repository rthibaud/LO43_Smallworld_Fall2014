package model;

import java.util.Vector;

public class Board { //OK

	//attribute
	
  private int nbPlayer;

  private Vector <Square>  squareTable;
  
  	//method

  public Board() {
	  nbPlayer = 0;
	  squareTable = new Vector <Square>();
  }
  
  public Board(int pnbPlayer){
	  nbPlayer = pnbPlayer;
	  // if we have time we can add several boards in function of the number of player
	  squareTable = new Vector <Square>();
  }

}