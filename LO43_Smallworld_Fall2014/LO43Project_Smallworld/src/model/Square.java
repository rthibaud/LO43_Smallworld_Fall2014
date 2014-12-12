package model;

import java.util.Vector;

public class Square { //OK

	//attribute
  private int number;

  private Attribute specialAttribute;

  private Vector <Unit>  unitList;
   
  private Vector <Square>  adjacency;

  	//Constructors
  
  public Square() {
	 number = 0;
	 specialAttribute = null;
	 unitList = new Vector <Unit>();
	 adjacency = new Vector <Square>();
  }
  
  public Square(int number, Attribute specialAttribute, Vector<Unit> unitList,Vector<Square> adjacency) {
	this.number = number;
	this.specialAttribute = specialAttribute;
	this.unitList = unitList;
	this.adjacency = adjacency;
  }


  
  
  
  	//method


}