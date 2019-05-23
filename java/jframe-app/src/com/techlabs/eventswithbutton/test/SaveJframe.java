package com.techlabs.eventswithbutton.test;

import javax.swing.JButton;
import javax.swing.JFrame;
import com.techlabs.eventswithbutton.DatabaseObserver;
import com.techlabs.eventswithbutton.EmailObserver;

public class SaveJframe extends JFrame{
	
	public SaveJframe(){
		 	setTitle("Save button");
		    JButton button= new JButton("save");
		    button.setBounds(50,50,150,50);

		    button.addActionListener(new DatabaseObserver());
		    button.addActionListener(new EmailObserver());
		    
		    add(button);
		    setSize(300,300);
		    setLayout(null);
		    setVisible(true);
	}
 
}
