package com.techlabs.login;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ResultFrame extends JFrame {

	JLabel label;
	JTextField text;
	String name;
	public ResultFrame(String name) {
		this.name=name;
		text=new JTextField();
		text.setText(name);
		
		text.setBounds(50, 50, 100, 50);
		text.setEditable(false);
		add(text);
		
		setSize(300,300);
		setLayout(getLayout());
		setVisible(true);
		
	}
}
