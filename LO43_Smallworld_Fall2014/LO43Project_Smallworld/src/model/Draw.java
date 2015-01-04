package model;

import java.util.LinkedList;
import java.util.Random;
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
	  
	  createPpl();
	  createPow();
	  createAva();
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

  public void addAvailable(People ppl){
	  available.add(ppl) ; // It shifts the current element to the right (add 1 to the index).
  }
  
  /* draw a people from the 6 available people and give it to a player. 
  * then replace it in the available list with a new association of people/power.
  * Need to check the gold amount on the people, give it the player and reset it.
  *
  **/ 
  public void drawAvailable (int index, Player play){
	  for(int i=0;i<index;i++){
		  available.get(i).addGold(1);
		  play.addGold(-1); 	//in theory it's always possible
	  }
	  People ppl=available.remove(index);
	  ppl.setState(State.active);
	  play.addActivePeople(ppl);
	  addAvailable(drawDeck());
  }
  
  /* draw the next element in the people deck.
   Before remove it from the list, link it with the next element in the power deck. */
  public People drawDeck(){
	  deckPpl.getFirst().setPower(removePow()); 
	  return removePpl();
  }
  
  /*
   *  	Replace all elements in the deck in a random order 
   *	We create a new deck and we place each people from the old deck in a random order  
  */
  public void shufflePeople(){
	 LinkedList <People> tmp = new LinkedList <People>();
	 Random rand = new Random();
	 
	 while(!deckPpl.isEmpty()){
	 	int indexAleatoire = rand.nextInt(deckPpl.size()); //  a random index of the old deck.
	 	tmp.add(deckPpl.remove(indexAleatoire));
	 }
	 
	 deckPpl=tmp;
  }
  
  // replace all elements in the deck in a random order. Same algorithm than shufflePeople
  public void shufflePower(){
	  LinkedList <Power> tmp = new LinkedList <Power>();
		Random rand = new Random();
		 
	 while(!deckPow.isEmpty()){
	 	int indexAleatoire = rand.nextInt(deckPow.size()); //  a random index of the old deck.
	 	tmp.add(deckPow.remove(indexAleatoire));
	 }
	 
	 deckPow=tmp;
  }  
  
  // replace in the decks all available "combinaison" of power/people
  public void clearAvailable(){
	  People tmp = new People();
	  
	  while(!available.isEmpty()){
		  tmp=available.remove(0);
		  addPow(tmp.getPower());
		  tmp.setPower(null);
		  addPpl(tmp);
	  }
	  
	  shufflePeople();
	  shufflePower();
  }
  
  public void createAva(){
	  for (int i=0; i<6; i++){
		  addAvailable(drawDeck());
	  }
	  
	/*  for(People p : available)
		  System.out.println(p.getName()+"    "+p.getPower().getName());*/
  }
  
  //create the people   POUR HAOCHENG
  public void createPpl(){
	  People ppl1 = new People("ppl 1", 1);
	  People ppl2 = new People("ppl 2", 2);
	  People ppl3 = new People("ppl 3", 3);
	  People ppl4 = new People("ppl 4", 4);
	  People ppl5 = new People("ppl 5", 5);
	  People ppl6 = new People("ppl 6", 6);
	  People ppl7 = new People("ppl 7", 7);
	  People ppl8 = new People("ppl 8", 8);
	  People ppl9 = new People("ppl 9", 9);
	  People ppl10 = new People("ppl 10", 10);


	  deckPpl.add(ppl1);
	  deckPpl.add(ppl2);
	  deckPpl.add(ppl3);
	  deckPpl.add(ppl4);
	  deckPpl.add(ppl5);
	  deckPpl.add(ppl6);
	  deckPpl.add(ppl7);
	  deckPpl.add(ppl8);
	  deckPpl.add(ppl9);
	  deckPpl.add(ppl10);
	  
	  shufflePeople();
  }
  
  public void createPow(){
	  Power pow1 = new Power ("pow 1", 1, 5);
	  Power pow2 = new Power ("pow 2", 2, 5);
	  Power pow3 = new Power ("pow 3", 3, 5);
	  Power pow4 = new Power ("pow 4", 4, 5);
	  Power pow5 = new Power ("pow 5", 5, 5);
	  Power pow6 = new Power ("pow 6", 6, 5);
	  Power pow7 = new Power ("pow 7", 7, 5);
	  Power pow8 = new Power ("pow 8", 8, 5);
	  Power pow9 = new Power ("pow 9", 9, 5);
	  Power pow10 = new Power ("pow 10", 10, 5);
	  
	  deckPow.add(pow1);
	  deckPow.add(pow2);
	  deckPow.add(pow3);
	  deckPow.add(pow4);
	  deckPow.add(pow5);
	  deckPow.add(pow6);
	  deckPow.add(pow7);
	  deckPow.add(pow8);
	  deckPow.add(pow9);
	  deckPow.add(pow10);
	  
	  shufflePower();	    
  }



public Vector<People> getAvailable() {
	return available;
}

  
}