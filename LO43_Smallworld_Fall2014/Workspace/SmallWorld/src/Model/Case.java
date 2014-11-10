package Model;


public class Case {
	private int nom; // pour differencier les cases en attendant de trouver mieux
	private int	 type; //0 pour les collines, 1 pour les champs, 2 marais, 3 montagnes
	private int ajout; //0 pour rien, 1 antre, 2 campement, 3 montagne, 4 taniere, 5 forteresse, 6 heros, 7 dragon
					//est-ce que ça vaut le coup de faire une enumeration ou des classes?
	private Case[] caseadj; //tableau des cases adjacentes
}
