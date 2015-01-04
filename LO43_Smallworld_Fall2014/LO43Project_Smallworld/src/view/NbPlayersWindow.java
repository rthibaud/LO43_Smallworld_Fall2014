package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JSpinner.NumberEditor;

public class NbPlayersWindow extends JFrame{
	private JSpinner spinNbPlayer;
	private JButton okbtNbPlayer;

	public NbPlayersWindow(){
		this.setTitle("Number of players");		
		Toolkit toolkit = getToolkit();
		Dimension screenDim = toolkit.getScreenSize(); //gets the screen's resolution
		this.setBounds(screenDim.width/2-175,screenDim.height/2-125,350,250); //creates the window in the middle of the screen
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		
		//creates the container
		final JPanel container = new JPanel();
		this.setContentPane(container);
		
		//creates the elements 
		JLabel label = new JLabel ("Enter the number of players : ");
		spinNbPlayer = new JSpinner();
		okbtNbPlayer = new JButton(" OK");
		
		//options on the element
		final JSpinner.NumberEditor spinnerEditor = new JSpinner.NumberEditor(spinNbPlayer);
		spinNbPlayer.setEditor(spinnerEditor);
		spinNbPlayer.setPreferredSize(new Dimension(100, 30));
		okbtNbPlayer.setPreferredSize(new Dimension(150, 40));
		
		// minimal value = 2, max = 5, default = 3 and the step = 1.
		spinnerEditor.getModel().setMinimum(2);
		spinnerEditor.getModel().setMaximum(4);
		spinnerEditor.getModel().setStepSize(1);
		spinnerEditor.getModel().setValue(3);
				
		// no decimal :
		spinnerEditor.getFormat().applyPattern("###,##0");	
		
		//creates layout
		container.setLayout(new BorderLayout());
		JPanel top = new JPanel();
		container.add(top, BorderLayout.NORTH);
		JPanel bot = new JPanel();
		container.add(bot, BorderLayout.SOUTH); 
		

		//puts the elements in the window
		top.add(label);
		top.add(spinNbPlayer);
		bot.add(okbtNbPlayer);
		
		this.setVisible(true);
	}
	
	
	public void okbtAddListener(ActionListener a){
		okbtNbPlayer.setName("okbtNbPlayer");
		okbtNbPlayer.addActionListener(a);
	}
	
	
	public int getNbPlayer(){
		final JSpinner.NumberEditor spinnerEditor;
		spinnerEditor = (NumberEditor) spinNbPlayer.getEditor();
		int x = (Integer)spinnerEditor.getModel().getNumber();
		return x;
	}
}
