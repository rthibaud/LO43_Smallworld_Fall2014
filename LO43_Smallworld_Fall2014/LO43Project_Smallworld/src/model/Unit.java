package model;

public class Unit {//OK

	//attribute
  private int def;

  private int atk;
  
  private People people;

  	//constructors
  public Unit() {
	  def = 0;
	  atk = 0;
  }

  
	public Unit(int def, int atk) {
		this.def = def;
		this.atk = atk;
	}
  
  	//method
	public People getPeople(){
		return people;
	}

}