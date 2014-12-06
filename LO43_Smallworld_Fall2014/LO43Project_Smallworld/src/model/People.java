package model;

import java.util.Vector;

public class People {//OK

	//attribute
  private String name;

  private int number;

  private int maxPawn;

  private int pawnPlayed;

  private int gold;

  private Power power;
  
  private State state;
  
<<<<<<< HEAD
  private Vector <PplUnit>  people;
  
  
  	//method
=======
  //getters and setters
  
    public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}
  
  	//method

 

	public void linkPower(Power pow) { // equivalent to setPower, a classic setter
	  
	  power = pow;
	}
>>>>>>> origin/master

  public People() {
	  name="";
	  number=0;
	  maxPawn=0;
	  pawnPlayed=0;
	  gold=0;
	  power=null;
	  state=State.draw;
	  for (int i=0; i<maxPawn; i++){
		  people.add(new PplUnit());
	  }
  }
  
  public People(String name, int number, int max, Power pow) {
	  this.name=name;
	  this.number=number;
	  maxPawn=max;
	  pawnPlayed=0;
	  gold=0;
	  power=pow;
	  state=State.draw;
	  for (int i=0; i<maxPawn; i++){
		  people.add(new PplUnit());
	  }
  }

}