package model;

import java.util.Vector;

public class Turn { //OK
	
	// attribute

  private int number;

  private int maxNumber;

  private int activePlayer;
  
  private int nbPlayers;

  private Vector <Player> players;
  
  	//Constructors
  public Turn(){
	  number = 0;
	  maxNumber = 0;
	  activePlayer = 0;
	  nbPlayers=0;
	  players = new Vector <Player>();
  }
  
  public Turn(int pnumber, int pmaxNumber, int pactivePlayer){
	  number = pnumber;
	  maxNumber = pmaxNumber;
	  activePlayer = pactivePlayer;
	  players = new Vector <Player>();
  }
  
  public Turn(int nbPlayers){
	  switch(nbPlayers){
	  	case 2: maxNumber = 8;
	  		break;
	  	case 3 : maxNumber = 8;
	  		break;
	  	case 4 : maxNumber = 9;
	  		break;
	  	case 5 : maxNumber = 10;
	  		break;
		  
	  }
	  this.nbPlayers=nbPlayers;
	  players = new Vector <Player>();
  }
  
  
  
  	// method

  public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public int getMaxNumber() {
	return maxNumber;
}

public void setMaxNumber(int maxNumber) {
	this.maxNumber = maxNumber;
}

public void nextPlayer() {
	  if (activePlayer == players.size()-1){
		  activePlayer = 0 ;
		  number=number+1;
	  }else
		  activePlayer=activePlayer+1;
  }

  public void nextTurn() { // inutile finalement, on utilise nextPlayer
	  	number=number+1;
	  	if(number>maxNumber){
	  		//Compte des points et gestion du vainqueur
	  	}
  }
  
  public void addPlayer(String nom, int nb){
	  
	  players.add(new Player(nom, nb));
  }
  
  public int getLenght(){
	  if (players!=null)
		  return players.size();
	  return 0;
  }

public int getNbPlayers() {
	return nbPlayers;
}

public Vector<Player> getPlayers() {
	return players;
}

public int getActive(){
	return activePlayer;
}

public void determineVictory() {
	
	Player winner = players.get(0);
	for(Player test : players){
		if(test.getGold()>winner.getGold()){
			winner = test;
		}
	}
	System.out.println("The winner is "+winner.getName()+" with "+winner.getGold()+" UV !"); // a mettre dans une fenetre
	System.out.println("BRAVO !");
}

}