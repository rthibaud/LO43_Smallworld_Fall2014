package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MapPanel extends JPanel{
	
	private JButton test;
	private JLabel fond;
	
	public MapPanel()
	{
		test=new JButton();
		fond=new JLabel(new ImageIcon("./img/UTBM.jpg"));
		this.add(test);
		this.add(fond);
		
		 
	}

}
