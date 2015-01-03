package view;

import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

public class StackPanel extends JPanel {
	
	private CardPanel card1;
	private CardPanel card2;
	private CardPanel card3;
	private CardPanel card4;
	private CardPanel card5;
	
	public StackPanel()
	{
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		card1=new CardPanel();		
		this.add(card1);
		
		card2=new CardPanel();		
		this.add(card2);
		
		card3=new CardPanel();		
		this.add(card3);
		
		card4=new CardPanel();		
		this.add(card4);
		
		card5=new CardPanel();		
		this.add(card5);
		
		
	}
	
	


}
