package view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class InfoPanel extends JPanel {
	
	private int nbTurn;
	
	private JLabel nbTurnask;
	private JLabel nbTurnprint;
	
	public InfoPanel()
	{
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		nbTurnask = new JLabel("Nombre de tour restant");
		add(nbTurnask);
		
		nbTurnprint = new JLabel(" " +nbTurn);
		add(nbTurnprint);
		
		JLabel lblNewLabel_2 = new JLabel("Possibilite de passer en declin");
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Phase d'expansion");
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Redeploiement des unites");
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Fin du tour");
		add(lblNewLabel_5);
		
	}


}
