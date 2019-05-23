package com.techlabs.commonlistner;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.techlabs.eventswithbutton.DatabaseObserver;
import com.techlabs.eventswithbutton.EmailObserver;

public class SaveExitFrame extends JFrame{

	public SaveExitFrame() {
		setTitle("Save button");
	    JButton button1= new JButton("save");
	    button1.setBounds(50,50,150,50);
	    button1.setActionCommand("save");
	    button1.addActionListener(new CommonListner(this));
	    

	    JButton button2= new JButton("exit");
	    button2.setBounds(250,50,150,50);
	    button2.setActionCommand("exit");
	    button2.addActionListener(new CommonListner(this));
	    
	    JButton button3= new JButton("Change color");
	    button3.setBounds(150,150,150,50);	
	    button3.setActionCommand("color");
	    button3.addActionListener(new CommonListner(this));
	    
	    add(button1);
	    add(button2);
	    add(button3);
	    setSize(600,300);
	    setLayout(null);
	    setVisible(true);
	}
}
