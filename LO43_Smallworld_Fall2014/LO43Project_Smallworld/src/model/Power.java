package model;

public class Power { //OK

	//attribute
  private String name;

  private int number;

  private int maxPawn;

  private Boolean decline;

  //Constructors
  	
  public Power() {
	  name="";
	  number=0;
	  maxPawn=0;
	  decline=false;
  }


  public Power(String name, int number, int maxPawn) {
	this.name = name;
	this.number = number;
	this.maxPawn = maxPawn;
	this.decline = false;
  }
  	
  
  	//method
}