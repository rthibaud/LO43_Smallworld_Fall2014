package model;

import java.util.Vector;

public class Square { //OK

	//attribute
  private int number;
  
  private int type;

  private int specialAttribute;

  private Vector <Unit>  unitList;
   
  private Vector <Integer>  adjacency;
  
  private Player owner; //the player who control the ACTIVE People on this board

  	//Constructors
  
  public Square() {
	 number = 0;
	 type = 0;
	 specialAttribute = 0;
	 unitList = new Vector <Unit>();
	 adjacency = new Vector <Integer>();
	 owner = null;
  }
  
  public Square(int number,int type, int specialAttribute) {
	this.number = number;
	this.type = type;
	this.specialAttribute = specialAttribute;
	this.unitList = new Vector <Unit>();
	this.adjacency = new Vector <Integer>();
	this.owner = null;
  }

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public int getType() {
	return type;
}

public void setType(int type) {
	this.type = type;
}

public int getSpecialAttribute() {
	return specialAttribute;
}

public void setSpecialAttribute(int specialAttribute) {
	this.specialAttribute = specialAttribute;
}

public Vector<Unit> getUnitList() {
	return unitList;
}

public void setUnitList(Vector<Unit> unitList) {
	this.unitList = unitList;
}

public Vector<Integer> getAdjacency() {
	return adjacency;
}

public void setAdjacency(Vector<Integer> adjacency) {
	this.adjacency = adjacency;
}  
  
  public Player getOwner() {
	return owner;
}

public void setOwner(Player owner) {
	this.owner = owner;
}

//method
public int def(){
	int def=0;
	
	if (type==6)def++;
	for(Unit ppl : unitList ){
		def+=ppl.getDef();
	}
	return def;
}

//compte le nb d'unités appartenant à un joueur
public int countPplUnit(){
	int i=0;
	for(Unit u : this.unitList){
		if (u instanceof PplUnit)
			i=i+1;
	}
	return i;
}

//récupère le peuple sur la case
public People getPeopleOfUnit(){
	int i = countPplUnit();
	if (i!=0){
		for(Unit u : this.unitList){
			if (u instanceof PplUnit)
				return ((PplUnit) u).getPeople();
		}
	}
	return null;
}

public Unit removeNextPplUnit() {
	
	Unit u = null;
	for(Unit unit : unitList){
		if(unit instanceof PplUnit){
			u = unit;
			unitList.remove(unit);
			return u;
		}
	}
	
	return u;
}

}