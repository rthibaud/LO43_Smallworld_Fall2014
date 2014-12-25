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
  

}


/*	type
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
	
	txt file model :
	
	int : nb of squares
	0 type attribute nb of adjacency squares 0 1 .. X (list of squares) 
	1
	.
	.
	.
	nb of squares - 1
*/
	
