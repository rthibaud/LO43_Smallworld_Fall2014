package view;

import java.awt.Image;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

public class CardPanel extends JPanel{
	
	private JLabel price;
	private JLabel civilisation;
	private ImageIcon priceimg;
	private ImageIcon civilisationimg;
	
	public CardPanel()
	{
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		priceimg = new ImageIcon(new ImageIcon("img/piece_1.png").getImage().getScaledInstance(100, 120, Image.SCALE_DEFAULT));
		price=new JLabel(priceimg);		
		this.add(price);
		
		civilisationimg = new ImageIcon(new ImageIcon("img/Info.png").getImage().getScaledInstance(200, 120, Image.SCALE_DEFAULT));
		civilisation=new JLabel(civilisationimg);
		this.add(civilisation);
		
	}
	
	public void addCardListener(MouseListener click)
	{
		this.addMouseListener(click);
	}

}
