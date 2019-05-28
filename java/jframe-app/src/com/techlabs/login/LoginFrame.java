package com.techlabs.login;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {

	JTextField tf1, tf2, tf3;
	JButton b1, b2;

	public LoginFrame() 
	{
		tf1 = new JTextField();
		tf1.setBounds(50, 50, 150, 20);
		
		tf2 = new JTextField();
		tf2.setBounds(50, 100, 150, 20);
		
		tf3 = new JTextField();
		tf3.setBounds(50, 150, 150, 20);
		tf3.setEditable(false);
		
		b1 = new JButton("Login");
		b1.setBounds(50, 200, 100, 50);
		b1.addActionListener(new LoginButtonListner(this));
		
		add(tf1);
		add(tf2);
		add(tf3);
		add(b1);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}
}
