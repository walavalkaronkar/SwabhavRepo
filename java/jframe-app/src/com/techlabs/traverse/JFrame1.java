package com.techlabs.traverse;



import java.awt.Button;

import javax.swing.JFrame;

public class JFrame1 extends JFrame
{
	JFrame1(){
		Button b=new Button("Button click me"); 
		b.setActionCommand("click");
		b.setBounds(30, 100, 80, 30);
		b.addActionListener(new ButtonActionListner(this));
		add(b);
		setSize(300,300); 
		setLayout(null);
		setVisible(true);
	}
}
