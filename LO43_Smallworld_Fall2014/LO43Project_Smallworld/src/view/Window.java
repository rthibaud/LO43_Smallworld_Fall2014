package view;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;

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
	private int windowWidth;
	private int windowHeight;
	
	public Window()
	{
		windowHeight=(int)getToolkit().getScreenSize().getHeight();
		windowWidth=(int)getToolkit().getScreenSize().getWidth();
		this.setSize(windowWidth,windowHeight);
		
		MigLayout layout = new MigLayout("fill, gap 10px 10px");
		this.setLayout(layout);
		
		connection=new ConnectionPanel();
		map=new MapPanel();
		stack=new StackPanel();
		info= new InfoPanel();
		player=new PlayerPanel();
		
		this.add(map,"grow, span 6 5, top");
		this.add(stack,"grow, span 2 5, top, wrap");
		this.add(player,"grow, span 6 3, top");
		this.add(info,"grow, span 2 3, top");
		
		
	}
	
}	



