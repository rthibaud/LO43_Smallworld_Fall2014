package view;

import javax.swing.JFrame;

import model.Draw;
import model.Player;
import model.Turn;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Window extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ConnectionPanel connection;
	public MapPanel map;
	private PlayerPanel player;
	private StackPanel stack;
	//private InfoPanel info;
	public ActionsPanel action;
	
	
	public Window(Turn t, Draw d)
	{
		this.setSize(1700, 800);
		setVisible(true);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		map=new MapPanel();
		getContentPane().add(map, BorderLayout.CENTER);
		
		//info= new InfoPanel();
		action = new ActionsPanel(t, d);
		getContentPane().add(action, BorderLayout.EAST);
		
		player=new PlayerPanel();
		getContentPane().add(player, BorderLayout.SOUTH);
		
		
	}
	
	
	
}	



