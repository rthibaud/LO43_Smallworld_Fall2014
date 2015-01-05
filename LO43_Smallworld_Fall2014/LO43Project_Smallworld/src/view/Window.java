package view;

import javax.swing.JFrame;
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
	private MapPanel map;
	private PlayerPanel player;
	private StackPanel stack;
	private InfoPanel info;
	
	
	public Window()
	{
		this.setSize(1080, 720);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		stack=new StackPanel();
		getContentPane().add(stack, BorderLayout.WEST);
		
		map=new MapPanel();
		getContentPane().add(map, BorderLayout.CENTER);
		
		info= new InfoPanel();
		getContentPane().add(info, BorderLayout.EAST);
		
		player=new PlayerPanel();
		getContentPane().add(player, BorderLayout.SOUTH);
		
		
	}
	
	
	
}	



