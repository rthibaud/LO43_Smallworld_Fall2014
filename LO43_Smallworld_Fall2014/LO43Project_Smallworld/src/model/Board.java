package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class Board { //OK

	//attribute
	
  private int nbPlayer;
  
  private int size;

  private Vector <Square>  squareTable;
  
  	// Constructor

  public Board() {
	  nbPlayer = 0;
	  squareTable = new Vector <Square>();
	  size = 0;
  }
  
  public Board(int pnbPlayer){
	  nbPlayer = pnbPlayer;
	  String boardFile="files/";
	  int nbsquare;
	  // if we have time we can add several boards in function of the number of player
	  switch(nbPlayer){ 
	  		case 2:
	  			boardFile=boardFile.concat("2Player.txt");
	  			break;
	  		case 3:
	  			boardFile=boardFile.concat("3Player.txt");
	  			break;
	  		case 4:
	  			boardFile=boardFile.concat("4Player.txt");
	  			break;
	  		case 5:
	  			boardFile=boardFile.concat("5Player.txt");
	  			break;
	  		default:
	  			boardFile="error";
	  }
	  
	  squareTable = new Vector <Square>();
	  Scanner scanner = null;
	  try {
		  try {
			  	scanner = new Scanner(new File(boardFile));
			  	size = scanner.nextInt();
			  	for(int i=0;i<size;i++){
			  		Square tmp = new Square(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
			  		nbsquare=scanner.nextInt();
			  		for(int j=0;j<nbsquare;j++){
			  			tmp.getAdjacency().add(scanner.nextInt());
			  		}
			  		squareTable.add(tmp);
			  		
			  		
			  	}
			  	
			  	
			  	
		  } finally {
			  if (scanner != null)
				  scanner.close();
			  
		  }
	  } catch (FileNotFoundException e) {
		  e.printStackTrace();
	  }
	  

	  
  }
  
  	//method
  public void printBoard(){
	  
	  for(Square s: squareTable){
		  System.out.println("Square number "+s.getNumber()+" of type "+s.getType()+" with attribute "+s.getSpecialAttribute());
		  System.out.print("Adjacency list : ");
		  for(Integer i: s.getAdjacency()){
			  System.out.print(i+" ");
		  }
		  System.out.println();
	  }	  
  }
  
  
  //the function to leave only 1 unit per square
  public void putUnitsAway(Player p){
	  for (Square sq : squareTable){
		  if (!sq.getUnitList().isEmpty()){
			  if (sq.getUnitList().get(0).getPeople()==p.getPeople()){
				  p.getPeople().setPawnPlayed(p.getPeople().getPawnPlayed()-sq.getUnitList().size()+1);
				  for (int i = 1; i<sq.getUnitList().size(); i++ ){
					  sq.getUnitList().remove(sq.getUnitList().size()-1);
				  }
			  }
		  }
	  }
  }


	/*
	 * Create a list of availaible square to conquer
	 * Choose a square
	 * count def
	 * if possible place def+2 pawns
	 * 
	 */
	public void conquer(Player activePlayer,int choice) {
	  
	  Vector <Integer>  possible = new Vector<Integer>();
	  Unit unit = new Unit(); //constructeur avec un peuple
	  int def=0; //pas forcement utile une fois intégrer à l'interface
	  
	  if(activePlayer.getPeople().getPawnPlayed()==0){
		  possible=squareTable.get(0).getAdjacency();
	  }else{
		  for(int i=0;i<size;i++){
			  if(squareTable.get(i).getOwner()==activePlayer){
				  possible.addAll(squareTable.get(i).getAdjacency()); // je ne suis pas sur que ça marche 
			  }
		  }
	  }
	  
	  //choosing section
	  System.out.println("Choose a square from this list :");
	  for(int i=0;i<possible.size();i++){
		  System.out.print(possible+" ");
	  }
	  System.out.println();
	  //A demander l'utilisateur, pour le moment je le rentre en parametre : choice
	  
	  def=squareTable.get(choice).def();
	  if(activePlayer.getPeople().getStock()>=def+2){
		  //Warning ! should be modify to include power 
			  squareTable.get(choice).getOwner().getPeople().addPawnPlayed(-squareTable.get(choice).getUnitList().size());
			  squareTable.get(choice).getOwner().getPeople().addStock(+1);
			  squareTable.get(choice).getUnitList().clear();
			  
			  for(int i=0;i<def+2;i++){
				  squareTable.get(choice).getUnitList().add(unit);
				  activePlayer.getPeople().addStock(-1);
				  activePlayer.getPeople().addPawnPlayed(+1);
			  }
	  }
	  
	}
	
	public void deploy() {
		
	
	}


}

/*	
 * 	txt file model :
	
	int : nb of squares
	0 type attribute nb of adjacency squares 0 1 .. X (list of squares) 
	1
	.
	.
	.
	nb of squares - 1
 * 
 * type
	0 -> outside of the board
	1 -> eau
	2 -> champs
	3 -> foret
	4 -> plaine
	5 -> marais
	6 -> montagne

	attribute
	0 -> nothing
	1 -> mage
	2 -> mine
	3 -> tunnel
	
*/
	
