package model;

import view.*;

public class Application {
	private Window win;
	
	public Application()
	{
		win=new Window();
		win.setVisible(true);
	}
	public static void main(String [] args)
	{
		Application app=new Application();
	}
}
