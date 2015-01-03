package model;

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
  
  	public People(String name, int nb){
  		this.name = name;
  		this.number = nb;
  		maxPawn = 5;
  		pawnPlayed = 0;
  		gold = 0;
  		power = null;
  		state = state.draw;
  	}
  
    public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}
	
	public Power getPower() {
		return power;
	}

	public void setPower(Power power) {
		this.power = power;
	}
	
	public void setState(State st){
		state = st;
	}
	
  	//method

  public People() {
	  name="";
	  number=0;
	  maxPawn=0;
	  pawnPlayed=0;
	  gold=0;
	  power=null;
	  state=State.draw;
	  
  }
  
  public People(String name, int number, int max, Power pow) {
	  this.name=name;
	  this.number=number;
	  maxPawn=max;
	  pawnPlayed=0;
	  gold=0;
	  power=pow;
	  state=State.draw;
  }

  public String getName() {
	return name;
  }

  public void addGold(int nb){
	  gold+=nb;
  }
  
  public void setPawnPlayed(int i){
	  this.pawnPlayed=i;
  }
  
  public int getPawnPlayed(){
	  return this.pawnPlayed;
  }
  
  //initialize a people that was already used
  public void init(){
	  this.gold=0;
	  this.power=null;
	  this.pawnPlayed=0;
	  state=State.draw;
  }

}