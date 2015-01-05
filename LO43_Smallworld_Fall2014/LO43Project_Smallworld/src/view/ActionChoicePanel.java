package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Draw;
import model.Turn;

public class ActionChoicePanel extends JPanel {
	
	//attributes
	public  JButton conquerbt, deploybt, finishbt;
	public JLabel errorlab, lab1, lab2;
	
	//constructor
	public ActionChoicePanel(Turn turn){
		
	    this.setSize(250, 600);
	    this.setVisible(true); 
	    
	    this.setLayout(new GridLayout(6, 1)); 
	    
	    //creates the elements 
	    conquerbt = new JButton("Conquer");
	    deploybt = new JButton("Deploy");
	    errorlab = new JLabel();
	    finishbt = new JButton("Finish turn");
	    lab1 =new JLabel("");
	    lab2 = new JLabel("");
	    
	    //options on the elements
	    errorlab.setForeground(Color.red);
	    
	    //add elements to this
	    this.add(lab1);
	    this.add(lab2);
	    this.add(conquerbt);
	    this.add(deploybt);
	    this.add(errorlab);
	    this.add(finishbt);
	    
	    if (turn.getPlayers().get(turn.getActive()).getPeople()==null){
	    	conquerbt.setVisible(false);
	    	deploybt.setVisible(false);
	    	finishbt.setVisible(false);
	    }	    
	}

	
	//methods
	public void actionAddListeners(ActionListener a){
		conquerbt.setName("bt1");
		deploybt.setName("bt2");
		finishbt.setName("bt3");
		
		conquerbt.addActionListener(a);
		deploybt.addActionListener(a);
		finishbt.addActionListener(a);
	}

	
	public void actualise(Turn turn){
		 if (turn.getPlayers().get(turn.getActive()).getPeople()==null){
		    conquerbt.setVisible(false);
		    deploybt.setVisible(false);
		    finishbt.setVisible(false);
		 }else{
			conquerbt.setVisible(true);
		    deploybt.setVisible(true);
		    finishbt.setVisible(true);
		 } 
		 errorlab.setText("");
	}
	
	
	public void errmsg(String str){
		errorlab.setText(str);
	}
}

