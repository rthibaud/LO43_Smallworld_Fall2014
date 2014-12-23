package view;



import org.eclipse.swt.widgets.Shell;
import swing2swt.layout.BorderLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;




public class Window extends Shell
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ConnectionPanel connection;
	private MapPanel map;
	private StackPanel stack;
	private PlayerPanel player;
	private InfoPanel info;
	
	private int windowWidth;
	private int windowHeight;
	
	public Window()
	{
		setLayout(new BorderLayout(0, 0));		
		
		
		connection=new ConnectionPanel(this, SWT.NONE);
		map=new MapPanel(this, windowHeight);
		info=new InfoPanel(this, windowHeight);
		player=new PlayerPanel(this, windowHeight);
		stack=new StackPanel(this, windowHeight);
		
		
		
	}
	
	
}	





