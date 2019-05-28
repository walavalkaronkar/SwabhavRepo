package com.techlabs.frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.techlabs.game.Game;


public class StartFrameListner implements ActionListener {

	StartFrame frame;
	GameBoard frame2;
	Game game;
	public StartFrameListner(StartFrame frame) {
		this.frame=frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name1="Player1";
		 String name2="Player2";
		if(e.getActionCommand().equals("ok")){ 
			if(frame.text1.getText()!=null && !(frame.text1.getText().equals("")))
			{
				name1=frame.text1.getText();
			}
			if(frame.text2.getText()!=null && !(frame.text2.getText().equals("")))
			{
				name2=frame.text2.getText();
			}
           
           Game game=new Game(name1,name2);
           frame.dispose();
           frame2=new GameBoard(name2,game);
        }
		
	}

}
