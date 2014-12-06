package model;

public class Player { //OK

	//attribute
	
  private int number;

  private String name;

  private int gold;
    
  private People activePpl;
    
  private People declinePpl;
 
    // method

  public void choosePpl(People people) { //same than addActivePeople ???
  }

  public void conquer() {
  }

  public void deploy() {
  }

  public Player() {
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