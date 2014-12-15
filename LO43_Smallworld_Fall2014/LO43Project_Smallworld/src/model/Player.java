package model;

import view.*;

public class Player { //OK

	//attribute
	
  private int number;

  private String name;

  private int gold;
    
  private People activePpl;
    
  private People declinePpl;
  
  	//constructors 
  
  public Player() {
	  this.number=0;
	  this.name="player";
	  this.gold=5;
	  activePpl=null;
	  declinePpl=null;
  }
  
  public Player(int i) {
	  this.number=i;
	  gold = 5;
	  activePpl=null;
	  declinePpl=null;
	  
	  NewPlayerWindow playerWin = new NewPlayerWindow(i);
	  playerWin.setVisible(true);
  }

 public Player(String name, int number) {
	  this.number=number;
	  this.name=name;
	  this.gold=5;
	  activePpl=null;
	  declinePpl=null;
  }
 
    // method


  
  /*public void choosePpl(People people) { // Need modifications I think (Romain Dulieu) -> I merged choosePpl and addActivePeople 
	  declinePpl=activePpl;
	  activePpl=people;
  }*/
  

public void addActivePeople(People ppl){ // add gold, reset gold and add new activePeople -> switch activePpl to declinePpl
	 addGold(ppl.getGold());
	 ppl.setGold(0);
	 declinePpl=activePpl;
	 activePpl=ppl;
  }

  public void conquer() {
  }

  public void deploy() {
  }



  public void addGold(int gold){
	  gold+=gold;
  }
  

}

