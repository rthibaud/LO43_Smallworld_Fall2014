package model;

public class Power { //OK

	//attribute
  private String name;

  private int maxPawn;

  private Boolean decline;

  //Constructors
  	
  public Power() {
	  name="";
	  maxPawn=0;
	  decline=false;
  }


  public Power(String name, int number, int maxPawn) {
	this.name = name;
	this.maxPawn = maxPawn;
	this.decline = false;
  }


public String getName() {
	return name;
}


public int getMaxPawn() {
	return this.maxPawn;
}
  	
  
  	//method
}