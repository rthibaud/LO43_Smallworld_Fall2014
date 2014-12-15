package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewPlayerWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NewPlayerWindow(int i){
		
		JPanel container = new JPanel();
		JTextField jtf = new JTextField();
		JLabel label = new JLabel("Enter the name of player "+i + " : ");
		
		this.setTitle("New Player");
	    this.setSize(300, 300);
	    this.setContentPane(container);
	    this.setVisible(true); 
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    this.setLocationRelativeTo(null);
	    container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    JPanel top = new JPanel();
	    Font police = new Font("Arial", Font.BOLD, 14);
	    jtf.setFont(police);
	    jtf.setPreferredSize(new Dimension(150, 30));
	    top.add(label);
	    top.add(jtf);
	    container.add(top, BorderLayout.NORTH);
	   
	}
	    
}
