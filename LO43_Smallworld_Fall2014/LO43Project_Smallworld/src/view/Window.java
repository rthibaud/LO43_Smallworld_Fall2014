package view;

import javax.swing.JFrame;

import controller.ActionChoiceListener;
import controller.ChoicePplListener;
import model.Draw;
import model.Player;
import model.Turn;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

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
		this.setTitle("Game");
		Toolkit toolkit = getToolkit();
		Dimension screenDim = toolkit.getScreenSize(); //gets the screen's resolution
		this.setBounds(screenDim.width/2-850,screenDim.height/2-400,1700,800); //creates the window in the middle of the screen
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
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


	public void lockbt(boolean bool) {
		action.lockbt(bool);	
	}


	public void choiceErrMsg(int i) {
		action.choiceErrMsg(i);
		
	}


	public void actualise(Draw draw, Turn turn) {
		action.actualise(draw, turn);
		
	}


	public void addListeners(ActionChoiceListener a,ChoicePplListener b) {
		action.addListeners(a, b);
	}
	
	
	
}	



