package view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

public class PlayerPanel extends JPanel{
	
	private JLabel civilisation;
	private ImageIcon civilisationimg;
	private JButton attaquer;
	private JButton passerDeclin;
	private JButton redeploiement;
	private JButton finDeTour;
	
	public PlayerPanel()
	{
		civilisationimg = new ImageIcon(new ImageIcon("img/Info.png").getImage().getScaledInstance(200, 120, Image.SCALE_DEFAULT));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		civilisation=new JLabel(civilisationimg);
		this.add(civilisation);
		
		passerDeclin = new JButton("Passer en declin");
		add(passerDeclin);
		
		attaquer = new JButton("Phase de combat");
		add(attaquer);
		
		redeploiement = new JButton("Phase de redeploiement");
		add(redeploiement);
		
		finDeTour = new JButton("Fin du tour");
		add(finDeTour);
	}


}
