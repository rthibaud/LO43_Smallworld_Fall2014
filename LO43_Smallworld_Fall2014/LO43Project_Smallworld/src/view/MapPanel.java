package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseListener;
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
		nbCases=30;
		this.setLayout(new GridLayout(0,5));
		board=new ArrayList<JLabel>();
		typeOfArea=new ArrayList<Integer>();
		attribute=new ArrayList<Integer>();
		for (i=0;i<nbCases;i++)
		{			
			type= rand.nextInt(5 - 0 + 1);
			att=rand.nextInt(4-0);
			typeOfArea.add(type);
			attribute.add(att);
			tmp=new JLabel();
			setIcon(type,tmp);
			settypeBorder(att,tmp);
			
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
	
	private void settypeBorder(int attribute, JLabel tmp)
	{
		switch(attribute)
		{
		case 0:tmp.setBorder(greyBorder);break;
		case 1:tmp.setBorder(greybevelBorder);break;
		case 2:tmp.setBorder(greyraisebevelBorder);break;
		case 3:tmp.setBorder(greymatteBorder);break;
		}
	}
	
	private void setIcon(int type, JLabel tmp)
	{
		
		switch(type)
		{
		case 0: ImageIcon background = new ImageIcon(new ImageIcon("img/salle_info.jpg").getImage().getScaledInstance(100, 120, Image.SCALE_DEFAULT));
				tmp.setIcon(background);break;
		case 1: ImageIcon background1 = new ImageIcon(new ImageIcon("img/atelier.jpg").getImage().getScaledInstance(100, 120, Image.SCALE_DEFAULT));
				tmp.setIcon(background1);break;
		case 2: ImageIcon background2 = new ImageIcon(new ImageIcon("img/entreprise.jpg").getImage().getScaledInstance(100, 120, Image.SCALE_DEFAULT));
				tmp.setIcon(background2);break;
		case 3: ImageIcon background3 = new ImageIcon(new ImageIcon("img/foyer.jpeg").getImage().getScaledInstance(100, 120, Image.SCALE_DEFAULT));
				tmp.setIcon(background3);break;
		case 4: ImageIcon background4 = new ImageIcon(new ImageIcon("img/amphi.jpg").getImage().getScaledInstance(100, 120, Image.SCALE_DEFAULT));
				tmp.setIcon(background4);break;
		case 5: ImageIcon background5 = new ImageIcon(new ImageIcon("img/gare.jpg").getImage().getScaledInstance(100, 120, Image.SCALE_DEFAULT));
				tmp.setIcon(background5);break;
		}
	}
	public void changeBorderColor(String color,int position)
	{
		switch(color)
		{
		case "red":switch(attribute.get(position))
					{
					case 0:board.get(position).setBorder(redBorder);break;
					case 1:board.get(position).setBorder(redbevelBorder);break;
					case 2:board.get(position).setBorder(redraisebevelBorder);break;
					case 3:board.get(position).setBorder(redmatteBorder);break;
					}break;
		case "blue":switch(attribute.get(position))
					{
					case 0:board.get(position).setBorder(blueBorder);break;
					case 1:board.get(position).setBorder(bluebevelBorder);break;
					case 2:board.get(position).setBorder(blueraisebevelBorder);break;
					case 3:board.get(position).setBorder(bluematteBorder);break;
					}break;
		case "green":switch(attribute.get(position))
					{
					case 0:board.get(position).setBorder(greenBorder);break;
					case 1:board.get(position).setBorder(greenbevelBorder);break;
					case 2:board.get(position).setBorder(greenraisebevelBorder);break;
					case 3:board.get(position).setBorder(greenmatteBorder);break;
					}break;
		case "yellow":switch(attribute.get(position))
					{
					case 0:board.get(position).setBorder(yellowBorder);break;
					case 1:board.get(position).setBorder(yellowbevelBorder);break;
					case 2:board.get(position).setBorder(yellowraisebevelBorder);break;
					case 3:board.get(position).setBorder(yellowmatteBorder);break;
					}break;
		case "gray":switch(attribute.get(position))
					{
					case 0:board.get(position).setBorder(greyBorder);break;
					case 1:board.get(position).setBorder(greybevelBorder);break;
					case 2:board.get(position).setBorder(greyraisebevelBorder);break;
					case 3:board.get(position).setBorder(greymatteBorder);break;
					}break;
		}
	}
	
	public ArrayList<Integer> getType()
	{
		return typeOfArea;
	}
	
	public ArrayList<Integer> getAttribute()
	{
		return attribute;
	}
	
	public void addMouseListener(MouseListener m)
	{
		int i;
		
		for (i=0;i<nbCases;i++)
		{
			board.get(i).addMouseListener(m);
		}
	}
}
