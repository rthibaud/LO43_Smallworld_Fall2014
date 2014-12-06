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

  public People() {
  }

}