package model;

import java.util.Random;
import java.util.Vector;

import view.*;

public class Player { //OK

	//attribute
	
  private int number;

  private String name;

  private int gold;
    
  private People activePpl;
    
  private People declinePpl;
  
  	//constructors 
  
  public Player() {
	  this.number=0;
	  this.name="player";
	  this.gold=5;
	  activePpl=null;
	  declinePpl=null;
  }
  
  public Player(int i) {
	  this.number=i;
	  gold = 5;
	  activePpl=null;
	  declinePpl=null;
	  
	  NewPlayerWindow playerWin = new NewPlayerWindow(i);
	  playerWin.setVisible(true);
  }

 public Player(String name, int number) {
	  this.number=number;
	  this.name=name;
	  this.gold=5;
	  activePpl=null;
	  declinePpl=null;
  }
 
 public boolean putPplDecline(){
	 this.activePpl.setState(State.inDecline);
	 
	 if (this.declinePpl!=null)
		 this.declinePpl.setState(State.draw);
	 
	 if (activePpl != null){
		 declinePpl=activePpl;
		 activePpl = null;
		 return true ;
	 }
	 return false ;
 }
 
 public boolean canDraw(){
	 return activePpl==null;
 }
 
 public int getGold(){
	 return gold;
 }
    // method


  
  /*public void choosePpl(People people) { // Need modifications I think (Romain Dulieu) -> I merged choosePpl and addActivePeople 
	  declinePpl=activePpl;
	  activePpl=people;
  }*/
  

public void addActivePeople(People ppl){ // add gold, reset gold and add new activePeople -> switch activePpl to declinePpl
	 addGold(ppl.getGold());
	 ppl.setGold(0);
	 this.activePpl=ppl;
	 ppl.setStock(ppl.getMaxPawn()+ppl.getPower().getMaxPawn());
  }


  public void addGold(int gold){
	  this.gold+=gold;
  }

public String getName() {
	return name;
}
  
public People getDeclinePpl(){
	return declinePpl;
}

public Power getDeclinePower() {
	return declinePpl.getPower();
}

public People getPeople(){
	return activePpl;
}

public Power getPower(){
	return activePpl.getPower();
}

}

