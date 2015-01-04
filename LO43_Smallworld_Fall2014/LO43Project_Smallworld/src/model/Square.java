package model;

import java.util.Vector;

public class Square { //OK

	//attribute
  private int number;
  
  private int type;

  private int specialAttribute;

  private Vector <Unit>  unitList;
   
  private Vector <Integer>  adjacency;

  	//Constructors
  
  public Square() {
	 number = 0;
	 type = 0;
	 specialAttribute = 0;
	 unitList = new Vector <Unit>();
	 adjacency = new Vector <Integer>();
  }
  
  public Square(int number,int type, int specialAttribute) {
	this.number = number;
	this.type = type;
	this.specialAttribute = specialAttribute;
	this.unitList = new Vector <Unit>();
	this.adjacency = new Vector <Integer>();
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


  
  
  
  	//method
public int def(){
	int def=0;
	
	if (type==6)def++;
	for(int i=0;i<unitList.size();i++){
		def+=unitList.get(i).getDef();
	}
	return def;
}

}