package model;

public class PplUnit extends Dynamic { //OK

		//attribute
    private People people;

    public PplUnit(){
    	super();
    	people = null;
    }
    
    public PplUnit(int atk, int def,People people) {
    	super(atk,def);
    	this.people = people;
    }

    	//Constructors
    
    
    	//method
    
    public People getPeople(){
    	return people;
    }
    
}