package com.techlabs.frames;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class StartFrame extends JFrame
{
	JLabel label1,label2;
	JTextField text1,text2;
	JButton button1;
	public StartFrame(){
		
		label1=new JLabel("Enter the name of player 1");
		label2= new JLabel("Enter the name of player 2");
		text1=new JTextField();
		text2=new JTextField();
		
		label1.setBounds(50, 50, 200, 50);
		text1.setBounds(300, 50, 100, 50);
		label2.setBounds(50, 150, 200, 50);
		text2.setBounds(300, 150, 100, 50);
		
		button1=new JButton("ok"); 
		button1.setBounds(200, 250, 100, 50);
		button1.setActionCommand("ok");
		button1.addActionListener(new StartFrameListner(this));
		
		add(label1);
		add(text1);
		add(label2);
		add(text2);
		add(button1);
		
		setSize(500,500); 
		setLayout(null);
		setVisible(true);
	}
}
