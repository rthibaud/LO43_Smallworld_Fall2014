package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MapPanel extends JPanel{
	
	private ArrayList<JLabel> board;
	private ArrayList<Integer> typeOfArea;
	private ArrayList<Integer> attribute;
	private int nbCases;
	
	private Border redBorder;
	private Border blueBorder;
	private Border greenBorder;
	private Border yellowBorder;
	private Border greyBorder;
	
	private Border redbevelBorder;
	private Border bluebevelBorder;
	private Border greenbevelBorder;
	private Border yellowbevelBorder;
	private Border greybevelBorder;
	
	private Border redraisebevelBorder;
	private Border blueraisebevelBorder;
	private Border greenraisebevelBorder;
	private Border yellowraisebevelBorder;
	private Border greyraisebevelBorder;
	
	private Border redmatteBorder;
	private Border bluematteBorder;
	private Border greenmatteBorder;
	private Border yellowmatteBorder;
	private Border greymatteBorder;
	
	public MapPanel()
	{
		int i=0,type,att;
		JLabel tmp;
		initialiseBorder();
		Random rand = new Random();
		nbCases=29;
		
		board=new ArrayList<JLabel>();
		typeOfArea=new ArrayList<Integer>();
		attribute=new ArrayList<Integer>();
		for (i=0;i<29;i++)
		{			
			type= rand.nextInt(5 - 0 + 1);
			att=rand.nextInt(4-0);
			typeOfArea.add(type);
			attribute.add(att);
			/*tmp.setIcon*/
			tmp=new JLabel(" "+i+" "+type +" "+att);
			switch(att)
			{
			case 0:tmp.setBorder(greyBorder);break;
			case 1:tmp.setBorder(greybevelBorder);break;
			case 2:tmp.setBorder(greyraisebevelBorder);break;
			case 3:tmp.setBorder(greymatteBorder);break;
			}
			
			board.add(tmp);
			this.add(board.get(i));
		}
		
		 
	}

	private void initialiseBorder()
	{
		redBorder=BorderFactory.createLineBorder(Color.red);
		blueBorder=BorderFactory.createLineBorder(Color.blue);
		greenBorder=BorderFactory.createLineBorder(Color.green);
		yellowBorder=BorderFactory.createLineBorder(Color.yellow);
		greyBorder=BorderFactory.createLineBorder(Color.gray);
		
		redbevelBorder=BorderFactory.createBevelBorder(nbCases, Color.red, Color.red);
		bluebevelBorder=BorderFactory.createBevelBorder(nbCases, Color.blue, Color.blue);
		greenbevelBorder=BorderFactory.createBevelBorder(nbCases, Color.green, Color.green);
		yellowbevelBorder=BorderFactory.createBevelBorder(nbCases, Color.yellow, Color.yellow);
		greybevelBorder=BorderFactory.createBevelBorder(nbCases, Color.gray, Color.gray);
		
		redraisebevelBorder=BorderFactory.createSoftBevelBorder(nbCases, Color.red, Color.red);
		blueraisebevelBorder=BorderFactory.createSoftBevelBorder(nbCases, Color.blue, Color.blue);
		greenraisebevelBorder=BorderFactory.createSoftBevelBorder(nbCases, Color.green, Color.green);
		yellowraisebevelBorder=BorderFactory.createSoftBevelBorder(nbCases, Color.yellow, Color.yellow);
		greyraisebevelBorder=BorderFactory.createSoftBevelBorder(nbCases, Color.gray, Color.gray);
		
		redmatteBorder=BorderFactory.createEtchedBorder(Color.red, Color.black);
		bluematteBorder=BorderFactory.createEtchedBorder(Color.blue, Color.black);
		greenmatteBorder=BorderFactory.createEtchedBorder(Color.green, Color.black);
		yellowmatteBorder=BorderFactory.createEtchedBorder(Color.yellow, Color.black);
		greymatteBorder=BorderFactory.createEtchedBorder(Color.gray, Color.black);
	}
	
}
