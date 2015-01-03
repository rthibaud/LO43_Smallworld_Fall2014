package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Draw;
import model.Turn;


public class ChoicePpl extends JPanel{
	
	JLabel lab1, lab2;
	JButton choicebt1, choicebt2, choicebt3, choicebt4, choicebt5, choicebt6, declinebt;
	
	public ChoicePpl(Turn turn, Draw draw){
		
	    this.setSize(350, 600);
	    this.setVisible(true); 
	   // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	    //this.setLocationRelativeTo(null);
	    
	    this.setLayout(new GridLayout(9,1));
	    Font police = new Font("Arial", Font.BOLD, 14);
	    
	    //creates the elements
	    choicebt1 = new JButton(draw.getAvailable().get(0).getName() + " with power " + draw.getAvailable().get(0).getPower().getName() + " and " + draw.getAvailable().get(0).getGold() + " gold on it" );
	    choicebt2 = new JButton(draw.getAvailable().get(1).getName() + " with power " + draw.getAvailable().get(1).getPower().getName() + " and " + draw.getAvailable().get(1).getGold() + " gold on it" );
	    choicebt3 = new JButton(draw.getAvailable().get(2).getName() + " with power " + draw.getAvailable().get(2).getPower().getName() + " and " + draw.getAvailable().get(2).getGold() + " gold on it" );
	    choicebt4 = new JButton(draw.getAvailable().get(3).getName() + " with power " + draw.getAvailable().get(3).getPower().getName() + " and " + draw.getAvailable().get(3).getGold() + " gold on it" );
	    choicebt5 = new JButton(draw.getAvailable().get(4).getName() + " with power " + draw.getAvailable().get(4).getPower().getName() + " and " + draw.getAvailable().get(4).getGold() + " gold on it" );
	    choicebt6 = new JButton(draw.getAvailable().get(5).getName() + " with power " + draw.getAvailable().get(5).getPower().getName() + " and " + draw.getAvailable().get(5).getGold() + " gold on it" );
	    lab1= new JLabel("     " +turn.getPlayers().get(turn.getActive()).getName()+ " ("+turn.getPlayers().get(turn.getActive()).getGold()+" gold) choose a new People if you want : ");	
	    lab2 = new JLabel();
	    declinebt = new JButton("    Put your active people in decline ");
	    
	    
	    //options on the elements
	    lab2.setForeground(Color.red);
	    lab2.setFont(police);
	    
	    
	    //add elements to the this
	    this.add(lab1);
	    this.add(choicebt1);
	    this.add(choicebt2);
	    this.add(choicebt3);
	    this.add(choicebt4);
	    this.add(choicebt5);
	    this.add(choicebt6);
	    this.add(lab2);
	    this.add(declinebt);    

	  
	} 
	
	public void choiceAddListeners(ActionListener a){
		choicebt1.setName("bt1");
		choicebt1.addActionListener(a);
		choicebt2.setName("bt2");
		choicebt2.addActionListener(a);
		choicebt3.setName("bt3");
		choicebt3.addActionListener(a);
		choicebt4.setName("bt4");
		choicebt4.addActionListener(a);
		choicebt5.setName("bt5");
		choicebt5.addActionListener(a);
		choicebt6.setName("bt6");
		choicebt6.addActionListener(a);
		declinebt.setName("btdec");
		declinebt.addActionListener(a);
	}

	public void replaceButtons(Draw draw, Turn turn) {
		choicebt1.setText(draw.getAvailable().get(0).getName() + " with power " + draw.getAvailable().get(0).getPower().getName() + " and " + draw.getAvailable().get(0).getGold() + " gold on it" );
	    choicebt2.setText(draw.getAvailable().get(1).getName() + " with power " + draw.getAvailable().get(1).getPower().getName() + " and " + draw.getAvailable().get(1).getGold() + " gold on it" );
	    choicebt3.setText(draw.getAvailable().get(2).getName() + " with power " + draw.getAvailable().get(2).getPower().getName() + " and " + draw.getAvailable().get(2).getGold() + " gold on it" );
	    choicebt4.setText(draw.getAvailable().get(3).getName() + " with power " + draw.getAvailable().get(3).getPower().getName() + " and " + draw.getAvailable().get(3).getGold() + " gold on it" );
	    choicebt5.setText(draw.getAvailable().get(4).getName() + " with power " + draw.getAvailable().get(4).getPower().getName() + " and " + draw.getAvailable().get(4).getGold() + " gold on it" );
	    choicebt6.setText(draw.getAvailable().get(5).getName() + " with power " + draw.getAvailable().get(5).getPower().getName() + " and " + draw.getAvailable().get(5).getGold() + " gold on it" );
	    lab1.setText("     " +turn.getPlayers().get(turn.getActive()).getName()+ " ("+turn.getPlayers().get(turn.getActive()).getGold()+" gold) choose a new People if you want : ");	
	    lab2.setText("");
	}

	public void mess1() {
		lab2.setText("You don't have enough money");
	}
	public void mess2(){
		lab2.setText("You don't have an active people");
	}
	public void mess3(){
		lab2.setText("You already have an active people");
	}
	public void mess4(){
		lab2.setText("You don't have any active people");
	}
}


