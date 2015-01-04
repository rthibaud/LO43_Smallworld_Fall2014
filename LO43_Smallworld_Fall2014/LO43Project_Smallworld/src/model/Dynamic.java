package model;

public class Dynamic extends Unit { //OK

	//attribute
	
    private Player owner;

    //constructors
    
  public Dynamic(int atk, int def) {
	  super();
	  owner = null;
  }
  
  public Dynamic(Player powner) {
	  super();
	  owner = powner;
  }

  	//method
}