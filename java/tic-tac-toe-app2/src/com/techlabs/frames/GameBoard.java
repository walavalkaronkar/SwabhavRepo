package com.techlabs.frames;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.techlabs.game.Game;

public class GameBoard extends JFrame {
	
	JButton button0, button1, button2, button3, button4, button5, button6, button7, button8;
	JTextField turn,status;
	JLabel turnlabel,statuslabel;
	
	public GameBoard(String name,Game game) {
	
		button0=new JButton();
		button0.setBounds(160, 20, 60, 60);
		button0.setFont(new Font("Arial", Font.PLAIN, 30));
		button0.setText("-");
		button0.setActionCommand("0");
		button0.addActionListener(new GameBoardListner(this,game));
		
		button1=new JButton();
		button1.setBounds(240, 20, 60, 60);
		button1.setFont(new Font("Arial", Font.PLAIN, 30));
		button1.setText("-");
		button1.setActionCommand("1");
		button1.addActionListener(new GameBoardListner(this,game));
		
		button2=new JButton();
		button2.setBounds(320, 20, 60, 60);
		button2.setActionCommand("2");
		button2.setText("-");
		button2.setFont(new Font("Arial", Font.PLAIN, 30));
		button2.addActionListener(new GameBoardListner(this,game));
		
		button3=new JButton();
		button3.setBounds(160, 100, 60, 60);
		button3.setActionCommand("3");
		button3.setText("-");
		button3.setFont(new Font("Arial", Font.PLAIN, 30));
		button3.addActionListener(new GameBoardListner(this,game));
		
		button4=new JButton();
		button4.setBounds(240, 100, 60, 60);
		button4.setActionCommand("4");
		button4.setText("-");
		button4.setFont(new Font("Arial", Font.PLAIN, 30));
		button4.addActionListener(new GameBoardListner(this,game));
		
		button5=new JButton();
		button5.setBounds(320, 100, 60, 60);
		button5.setActionCommand("5");
		button5.setText("-");
		button5.setFont(new Font("Arial", Font.PLAIN, 30));
		button5.addActionListener(new GameBoardListner(this,game));
		
		button6=new JButton();
		button6.setBounds(160, 180, 60, 60);
		button6.setActionCommand("6");
		button6.setText("-");
		button6.setFont(new Font("Arial", Font.PLAIN, 30));
		button6.addActionListener(new GameBoardListner(this,game));
		
		button7=new JButton();
		button7.setBounds(240, 180, 60, 60);
		button7.setActionCommand("7");
		button7.setText("-");
		button7.setFont(new Font("Arial", Font.PLAIN, 30));
		button7.addActionListener(new GameBoardListner(this,game));
		
		button8=new JButton();
		button8.setBounds(320, 180, 60, 60);
		button8.setActionCommand("8");
		button8.setText("-");
		button8.setFont(new Font("Arial", Font.PLAIN, 30));
		button8.addActionListener(new GameBoardListner(this,game));
		
		turn=new JTextField("");
		turn.setFont(new Font("Arial", Font.PLAIN, 22));
		turn.setText(name);
		turn.setBounds(50, 300, 250, 50);
		turn.setEditable(false);
		
		
		status=new JTextField("");
		status.setFont(new Font("Arial", Font.PLAIN, 22));
		status.setBounds(350, 300, 250, 50);
		status.setEditable(false);
		
		turnlabel=new JLabel(" Player turn");
		turnlabel.setFont(new Font("Arial", Font.PLAIN, 22));
		turnlabel.setBounds(90, 355, 210, 50);
		
		
		
		statuslabel=new JLabel(" Game Status");
		statuslabel.setFont(new Font("Arial", Font.PLAIN, 22));
		statuslabel.setBounds(390, 355, 200, 50);
		
		
		
		
		add(button0);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);
		add(button8);
		add(turn);
		add(status);
		add(turnlabel);
		add(statuslabel);
		
		setSize(720,480); 
		setLayout(null);
		setVisible(true);
		
	}

}
