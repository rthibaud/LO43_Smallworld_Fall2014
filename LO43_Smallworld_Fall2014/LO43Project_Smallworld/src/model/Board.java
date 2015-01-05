package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Random;
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
	  int i;
	  for (Square sq : squareTable){
		  if (!sq.getUnitList().isEmpty()){
			  if (sq.getPeopleOfUnit()==p.getPeople()){
				  i = sq.countPplUnit();
				  int j =0;
				  if (i!=1){
					  for(Unit u : sq.getUnitList()){
						  if (j<i+1){
						  if (u instanceof PplUnit){
							  p.getPeople().getPplUnitList().add((PplUnit)u); //cast to PplUnit a vérifier
							  sq.getUnitList().remove(u);
							  j++;
						  }	  
						  }
					  }
				  }
<<<<<<< HEAD

				  p.getPeople().addPawnPlayed(-i+1);

=======
				  p.getPeople().setPawnPlayed(p.getPeople().getPawnPlayed()-i+1);
>>>>>>> origin/master
				  p.getPeople().addStock(i-1);
			  }
		  }
	  }
  }
  
  
  
  //The function to count the number of points earned by player p during this turn
  public int countPoints(Player p){
	int nbpt=0;
	
	for(Square sq : squareTable){ // pour toutes les cases
		 if (!sq.getUnitList().isEmpty()){ //verifier que ce n'est pas vide
			 if (sq.getOwner()==p) 
				 nbpt=nbpt+1;
		 }
	}
	
	if (p.getPeople().getName()=="Administratif" || p.getPeople().getName()=="Vacataire"){ 
		for(Square sq : squareTable){ // pour toutes les cases
			 if (!sq.getUnitList().isEmpty()){ //verifier que ce n'est pas vide
				if (sq.getPeopleOfUnit()==p.getPeople()) 
					 nbpt=nbpt+1;
			 }
		}
	}else if(p.getPeople().getName()=="Alternant"){
		for(Square sq : squareTable){ // pour toutes les cases
			 if (!sq.getUnitList().isEmpty()){ //verifier que ce n'est pas vide
				if (sq.getPeopleOfUnit()==p.getPeople() && sq.getType()==2)  //LES CHAMPS ?
					 nbpt=nbpt+1;
			 }
		}
	}else if(p.getPeople().getName()=="EE"){
		for(Square sq : squareTable){ // pour toutes les cases
			 if (!sq.getUnitList().isEmpty()){ //verifier que ce n'est pas vide
				if (sq.getPeopleOfUnit()==p.getPeople() && sq.getSpecialAttribute()==1)  //LES CHAMPS ?
					nbpt=nbpt+1;
			 }
		}
	}
	
	if  (p.getPeople().getPower().getName()=="des amphis") {//AMPHI = marais ???
		for(Square sq : squareTable){ // pour toutes les cases
			 if (!sq.getUnitList().isEmpty()){ //verifier que ce n'est pas vide
				if (sq.getPeopleOfUnit()==p.getPeople() && sq.getType()==5)  
					nbpt=nbpt+1;
			 }
		}
	}else if  (p.getPeople().getPower().getName()=="des salles info") {//INFO = MONTAGNE  ???
		for(Square sq : squareTable){ // pour toutes les cases
			 if (!sq.getUnitList().isEmpty()){ //verifier que ce n'est pas vide
				if (sq.getPeopleOfUnit()==p.getPeople() && sq.getType()==6)  //LES CHAMPS ?
					nbpt=nbpt+1;
			 }
		}
	}else if  (p.getPeople().getPower().getName()=="des lieux de vie") {//LIEU DE VIE = PLAINE???
		for(Square sq : squareTable){ // pour toutes les cases
			 if (!sq.getUnitList().isEmpty()){ //verifier que ce n'est pas vide
				if (sq.getPeopleOfUnit()==p.getPeople() && sq.getType()==4)  
					nbpt=nbpt+1;
			 }
		}
	}
	
	if (p.getDeclinePpl()!=null && p.getDeclinePpl().getName()=="Administratif"){ 
		for(Square sq : squareTable){ // pour toutes les cases
			 if (!sq.getUnitList().isEmpty()){ //verifier que ce n'est pas vide
				if (sq.getPeopleOfUnit()==p.getDeclinePpl()) 
					 nbpt=nbpt+1;
			 }
		}
	}
	
	if (p.getPeople().getPower().getName()=="proche des entreprises")
		nbpt = nbpt +2;
	
	return nbpt;
  }


	/*
	 * Create a list of availaible square to conquer
	 * Choose a square
	 * count def
	 * if possible place def+2 pawns
	 * 
	 */
	public void conquer(Player activePlayer,/*int choice,*/boolean lastConquest) {
	  
	  HashSet <Integer>  possible = new HashSet<Integer>();
	  int dice = 0, def=0; //def pas forcement utile une fois intégré à l'interface
	  
	  if(activePlayer.getPeople().getPawnPlayed()==0){
		  possible.addAll(squareTable.get(0).getAdjacency());
	  }else{
		  for(int i=0;i<size;i++){
			  if(squareTable.get(i).getPeopleOfUnit()==activePlayer.getPeople()){
				  possible.addAll(squareTable.get(i).getAdjacency());  
			  }
		  }
		  possible.remove(0);
		  /*for(Integer i : possible){
			  if(squareTable.get(i).getOwner()!=null){
				  if(squareTable.get(i).getOwner().getPeople()==activePlayer.getPeople()){
					  possible.remove(i);
				  }
			  }
		  }  on doit utiliser les iterateurs*/ 
	  }
	  
	  //choosing section
	  System.out.println("Choose a square from this list :");
	 // for(int i=0;i<possible.size();i++){
		  System.out.print(possible);
	//  }
	  System.out.println();
	  Scanner sc = new Scanner(System.in);
	  int choice = sc.nextInt();
	  
	  def=squareTable.get(choice).def();
	  if(lastConquest){
		  dice = dice();
		  System.out.println("dice = "+dice);
	  }else{
		  dice = 0;
	  }
	  if(activePlayer.getPeople().getStock()+dice>=def+2){
		  //Warning ! should be modify to include power 
		  if(squareTable.get(choice).getOwner()!=null){  
			  System.out.println("pawn : "+squareTable.get(choice).getOwner().getPeople().getPawnPlayed());
			  System.out.println("size : "+-squareTable.get(choice).getUnitList().size());
			  squareTable.get(choice).getOwner().getPeople().addPawnPlayed(-squareTable.get(choice).getUnitList().size());
			  squareTable.get(choice).getOwner().getPeople().addStock(+1);
			  squareTable.get(choice).getOwner().getPeople().getPplUnitList().add((PplUnit) squareTable.get(choice).removeNextPplUnit());
			  System.out.println("stock : "+squareTable.get(choice).getOwner().getPeople().getStock());
		  }
		  squareTable.get(choice).getUnitList().clear();
		 	 
		  System.out.println("def :"+def);
		  if(dice>=def+2){
			  dice=def+1;
		  }
		  for(int i=0;i<def+2-dice;i++){
			  squareTable.get(choice).getUnitList().add(activePlayer.getPeople().getPplUnitList().remove(0));
			  activePlayer.getPeople().addStock(-1);
			  activePlayer.getPeople().addPawnPlayed(+1);
			  System.out.println("stock : "+activePlayer.getPeople().getStock()+" PP : "+activePlayer.getPeople().getPawnPlayed());
		  }
		  squareTable.get(choice).setOwner(activePlayer);
		  System.out.println( squareTable.get(choice).getUnitList());
	  }
	}

				  
	
	public void deploy(Player p, int choiceSq, int choiceNb) {
		HashSet <Integer>  possible = new HashSet<Integer>();
		for(Square sq : this.squareTable){
			if (sq.getPeopleOfUnit()==p.getPeople()){
				possible.add(sq.getNumber());
			}
		}
		
		 System.out.println("Choose a square from this list :");
		  for(int i=0;i<possible.size();i++){
			  System.out.print(possible);
		  }
		  System.out.println();		  
		  
		  if (choiceNb<=p.getPeople().getStock()){
			  int k = 0;
			  while(k<choiceNb){
				  squareTable.get(choiceSq).getUnitList().add(p.getPeople().getPplUnitList().get(0));
				  p.getPeople().addPawnPlayed(1);
				  p.getPeople().addStock(-1);
				  k++;
			  }
		  } else
			  System.out.println("you don't have enough units");
		  
		} 
		 
	
	  public int dice(){
		  Random rand = new Random();
		  int result = 0;
		  
		  int dice = rand.nextInt(6); 
		  if(dice<3){
			  result = dice+1;		  
		  }else{
			  result = 0;
		  }
		  return result;
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
	
