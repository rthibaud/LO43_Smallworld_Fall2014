package model;

public class Player { //OK

	//attribute
	
  private int number;

  private String name;

  private int gold;
    
  private People activePpl;
    
  private People declinePpl;
 
    // method


  
  public void choosePpl(People people) { // Need modifications I think (Romain Dulieu)
	  declinePpl=activePpl;
	  activePpl=people;


  }

  public void conquer() {
  }

  public void deploy() {
  }

  public Player() {
	  this.number=0;
	  this.name="player";
	  this.gold=5;
	  activePpl=null;
	  declinePpl=null;
  }
  
 public Player(String name, int number) {
	  this.number=number;
	  this.name=name;
	  this.gold=5;
	  activePpl=null;
	  declinePpl=null;
  }

  public void addGold(int gold){
	  gold+=gold;
  }
  
  public void addActivePeople(People ppl){ // add gold, reset gold and add new activePeople
	 addGold(ppl.getGold());
	 ppl.setGold(0);
	 activePpl=ppl;
  }
}

