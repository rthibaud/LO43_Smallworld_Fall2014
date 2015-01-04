package model;

public class PplUnit extends Dynamic { //OK

		//attribute
    private People people;

    public PplUnit(){
    	super();
    	people = null;
    }
    
    public PplUnit(People people) {
    	super();
    	this.people = people;
    }

    	//Constructors
    
    
    	//method
    
    public People getPeople(){
    	return people;
    }
    
}