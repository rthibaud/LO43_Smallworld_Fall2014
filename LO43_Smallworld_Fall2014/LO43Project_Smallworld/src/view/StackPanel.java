package view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

public class StackPanel extends JPanel {
	
	private CardPanel cards;
	
	public StackPanel()
	{
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		cards=new CardPanel();		
		this.add(cards);
		
		
	}


}
