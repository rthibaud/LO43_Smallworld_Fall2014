package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewPlayerWindow extends JFrame {

	JButton okbtNew; 
	JTextField jtf;

	public NewPlayerWindow(int i){
		
		JPanel container = new JPanel();
		jtf = new JTextField();
		JLabel label = new JLabel("Enter the name of player "+i + " : ");
		okbtNew = new JButton("OK");
		
		
		JPanel top = new JPanel();
		JPanel bot = new JPanel();
		this.setTitle("New Player");
	    this.setSize(300, 300);
	    this.setContentPane(container);
	    this.setVisible(true); 
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    
	    this.setLocationRelativeTo(null);
	    container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    Font police = new Font("Arial", Font.BOLD, 14);
	    jtf.setFont(police);
	    jtf.setPreferredSize(new Dimension(150, 50));
	    top.setBackground(Color.white);
	    bot.setBackground(Color.white);
	    
	    top.add(label);
	    top.add(jtf);
	    bot.add(okbtNew);
	    
	    container.add(top, BorderLayout.NORTH);
	    container.add(bot, BorderLayout.SOUTH);
	   
	}
		
	public void okbtAddListener(ActionListener a){
		okbtNew.setName("okbtNew");
		okbtNew.addActionListener(a);
	}
	
	
	public String readJTF(){
		return jtf.getText();
	}
}

