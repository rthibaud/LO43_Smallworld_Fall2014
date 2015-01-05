package model;

import java.util.Vector;

public class People {//OK

	//attribute
  private String name;

  private int maxPawn;
  
  private int realMax; //le maxi de people + pow

  private int pawnPlayed;
  
  private int stock;

  private int gold;

  private Power power;
  
  private State state;
  
  private Vector<PplUnit> pplUnitList;
  
  // Constructors
  
  	public People(String name, int nb){
  		this.name = name;
  		maxPawn = 5;
  		realMax = 5;
  		pawnPlayed = 0;
  		stock = 0;
  		gold = 0;
  		power = null;
  		state = state.draw;
  		pplUnitList = new Vector <PplUnit> ();
  		
  	}
  	
  	public People() {
  	  name="";
  	  maxPawn=0;
  	  realMax=0;
  	  pawnPlayed=0;
  	  gold=0;
  	  power=null;
  	  state=State.draw;
  	  pplUnitList = new Vector<PplUnit>();
  	  
    }
    
    public People(String name, int max, Power pow) {
  	  this.name=name;
  	  pawnPlayed=0;
  	  gold=0;
  	  power=pow;
  	  state=State.draw;
  	  maxPawn=max;
  	  realMax = max+pow.getMaxPawn();
  	  for (int i=0; i<realMax; i++){
  		  this.pplUnitList.add(new PplUnit(1,1,this));
  	  }
  	
  	  //for()
  	  //this.pplUnitList
    }
  	
    //getters and setters
    
    public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getMaxPawn() {
		return maxPawn;
	}

	public void setMaxPawn(int maxPawn) {
		this.maxPawn = maxPawn;
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
		this.realMax = power.getMaxPawn() + this.maxPawn;
		for (int i=0; i<realMax; i++){
			this.pplUnitList.add(new PplUnit(1,1,this));
		}
	}
	
	public void setState(State st){
		state = st;
	}


  public Vector<PplUnit> getPplUnitList() {
		return pplUnitList;
	}

	public void setPplUnitList(Vector<PplUnit> pplUnitList) {
		this.pplUnitList = pplUnitList;
	}
	
  	//method

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
  
  public void addPawnPlayed(int nb){
	  pawnPlayed+=nb;
  }

  public void addStock(int nb){
	  stock+=nb;
  }
  
  
//initialize a people that was already used
  public void init(){
	  this.gold=0;
	  this.power=null;
	  this.pawnPlayed=0;
	  this.stock=0;
	  state=State.draw;
	  this.realMax=0;
	  this.pplUnitList.clear();
  }
  

}