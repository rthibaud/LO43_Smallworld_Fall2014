package view;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;

public class Window extends JFrame
{

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
		
		MigLayout layout = new MigLayout("fillx", "[right]rel[grow,fill]", "[]10[]");
		this.setLayout(layout);
		
		connection=new ConnectionPanel();
		map=new MapPanel();
		stack=new StackPanel();
		info= new InfoPanel();
		player=new PlayerPanel();
		
		this.add("span 6 5",map);
		this.add("span 2 5 wrap",stack);
		this.add("span 6 3",player);
		this.add("span 2 3",info);
		
		
	}
	
	
}
