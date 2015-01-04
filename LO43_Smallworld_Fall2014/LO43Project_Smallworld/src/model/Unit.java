package model;

public class Unit {//OK

	//attribute
  private int def;

  private int atk;

  	//constructors
  public Unit() {
	  def = 0;
	  atk = 0;
  }

  
	public Unit(int def, int atk) {
		this.def = def;
		this.atk = atk;
	}
  
  	//getters and setters

	public int getDef() {
		return def;
	}


	public void setDef(int def) {
		this.def = def;
	}


	public int getAtk() {
		return atk;
	}


	public void setAtk(int atk) {
		this.atk = atk;
	}

}