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
  
  
  public int countPoints(Player p){
	int nbpt=0;
	
	for(Square sq : squareTable){ // pour toutes les cases
		 if (!sq.getUnitList().isEmpty()){ //verifier que ce n'est pas vide
			 if (sq.getUnitList().get(0).getPeople()==p.getPeople() || sq.getUnitList().get(0).getPeople()==p.getDeclinePpl()) 
				 nbpt=nbpt+1;
		 }
	}
	
	if (p.getPeople().getName()=="Administratif" || p.getPeople().getName()=="Vacataire"){ 
		for(Square sq : squareTable){ // pour toutes les cases
			 if (!sq.getUnitList().isEmpty()){ //verifier que ce n'est pas vide
				if (sq.getUnitList().get(0).getPeople()==p.getPeople()) 
					 nbpt=nbpt+1;
			 }
		}
	}else if(p.getPeople().getName()=="Alternant"){
		for(Square sq : squareTable){ // pour toutes les cases
			 if (!sq.getUnitList().isEmpty()){ //verifier que ce n'est pas vide
				if (sq.getUnitList().get(0).getPeople()==p.getPeople() && sq.getType()==2)  //LES CHAMPS ?
					 nbpt=nbpt+1;
			 }
		}
	}else if(p.getPeople().getName()=="EE"){
		for(Square sq : squareTable){ // pour toutes les cases
			 if (!sq.getUnitList().isEmpty()){ //verifier que ce n'est pas vide
				if (sq.getUnitList().get(0).getPeople()==p.getPeople() && sq.getSpecialAttribute()==1)  //LES CHAMPS ?
					nbpt=nbpt+1;
			 }
		}
	}
	
	if  (p.getPeople().getPower().getName()=="des amphis") {//AMPHI = marais ???
		for(Square sq : squareTable){ // pour toutes les cases
			 if (!sq.getUnitList().isEmpty()){ //verifier que ce n'est pas vide
				if (sq.getUnitList().get(0).getPeople()==p.getPeople() && sq.getType()==5)  
					nbpt=nbpt+1;
			 }
		}
	}else if  (p.getPeople().getPower().getName()=="des salles info") {//INFO = MONTAGNE  ???
		for(Square sq : squareTable){ // pour toutes les cases
			 if (!sq.getUnitList().isEmpty()){ //verifier que ce n'est pas vide
				if (sq.getUnitList().get(0).getPeople()==p.getPeople() && sq.getType()==6)  //LES CHAMPS ?
					nbpt=nbpt+1;
			 }
		}
	}else if  (p.getPeople().getPower().getName()=="des lieux de vie") {//LIEU DE VIE = PLAINE???
		for(Square sq : squareTable){ // pour toutes les cases
			 if (!sq.getUnitList().isEmpty()){ //verifier que ce n'est pas vide
				if (sq.getUnitList().get(0).getPeople()==p.getPeople() && sq.getType()==4)  
					nbpt=nbpt+1;
			 }
		}
	}else if  (p.getPeople().getPower().getName()=="en double fili�re" || p.getPeople().getPower().getName()=="du p�re 200") {
		for(Square sq : squareTable){ // pour toutes les cases
			 if (!sq.getUnitList().isEmpty()){ //verifier que ce n'est pas vide
				if (sq.getUnitList().get(0).getPeople()==p.getPeople() )  
					nbpt=nbpt+1;
			 }
		}
	}
	
	if (p.getDeclinePpl().getName()=="Administratif"){ 
		for(Square sq : squareTable){ // pour toutes les cases
			 if (!sq.getUnitList().isEmpty()){ //verifier que ce n'est pas vide
				if (sq.getUnitList().get(0).getPeople()==p.getDeclinePpl()) 
					 nbpt=nbpt+1;
			 }
		}
	}
	
	if (p.getPeople().getPower().getName()=="proche des entreprises")
		nbpt = nbpt +2;
	
	return nbpt;
  }
}

/*else if (p.getDeclinePpl().getName()=="Administratif"){
	for(Square sq : squareTable){ // pour toutes les cases
		 if (!sq.getUnitList().isEmpty()){ //verifier que ce n'est pas vide
			if (sq.getUnitList().get(0).getPeople()==p.getDeclinePpl()) 
				 nbpt=nbpt+2;
			if(sq.getUnitList().get(0).getPeople()==p.getPeople())
				 nbpt=nbpt+1;
		 }
	}
}/*


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
	
