package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

public class NbPlayersWindow extends JFrame{

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
		JSpinner spin = new JSpinner();
		JButton okbt = new JButton(" OK");
		
		//options on the element
		final JSpinner.NumberEditor spinnerEditor = new JSpinner.NumberEditor(spin);
		spin.setEditor(spinnerEditor);
		spin.setPreferredSize(new Dimension(100, 30));
		okbt.setPreferredSize(new Dimension(150, 40));
		
		// minimal value = 2, max = 5, default = 3 and the step = 1.
		spinnerEditor.getModel().setMinimum(2);
		spinnerEditor.getModel().setMaximum(5);
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
		top.add(spin);
		bot.add(okbt);
		
		this.setVisible(true);
	}
}
