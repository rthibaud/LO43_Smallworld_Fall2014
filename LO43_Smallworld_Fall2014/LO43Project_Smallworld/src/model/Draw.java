package model;

import java.util.LinkedList;
import java.util.Vector;

public class Draw { //OK

	//attribute
   
  private LinkedList <People>  deckPpl; //Usage of a linked list to represent a deck

  private LinkedList <Power> deckPow; 
   
  private Vector <People>  available;

  	//method

  public Draw() { //constructor
	  deckPpl = new LinkedList <People>();
	  deckPow = new LinkedList <Power>();
	  available = new Vector <People>();
  }
  
  // the LinkedList should be use by adding object at the end and remove them at the beginning to represent a deck.
  public void addPpl(People ppl){
	  deckPpl.add(ppl);
  }
  
  public People removePpl(){
	  return deckPpl.removeFirst();
  }
  
  public void addPow(Power pow){
	  deckPow.add(pow);
  }
  
  public Power removePow(){
	  return deckPow.removeFirst();
  }

  // available is a vector and will contains 6 to 1 People.
  public void addAvailable(People ppl,int index){
	  available.add(index, ppl); ; // It shifts the current element to the right (add 1 to the index).
  }
  
  /* draw a people from the 6 available people and give it to a player. 
  * then replace it in the available list with a new association of people/power.
  * Need to check the gold amount on the people, give it the player and reset it.
  *
  **/
  public void drawAvailable(int index, Player player) {
	  
	  People toReturn = new People();
	  toReturn = available.remove(index);
	  available.add(index, drawDeck());
	  player.addActivePeople(toReturn);
	  
	  
  }
  
  /* draw the next element in the people deck.
   Before remove it from the list, link it with the next element in the power deck. */
  public People drawDeck(){
	  
	  deckPpl.getFirst().linkPower(removePow()); 
	  return removePpl();
  }
}