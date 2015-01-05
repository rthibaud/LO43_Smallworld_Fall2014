package model;

public class Dynamic extends Unit { //OK

	//attribute
	
    protected Player owner;

    //constructors
    
  public Dynamic(){
	  super();
	  owner = null;
  }
    
  public Dynamic(int atk, int def) {
	  super(atk,def);
	  owner = null;
  }
  
  public Dynamic(Player powner) {
	  super();
	  owner = powner;
  }

  	//method
}