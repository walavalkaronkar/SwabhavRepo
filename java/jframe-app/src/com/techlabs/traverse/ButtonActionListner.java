package com.techlabs.traverse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.techlabs.commonlistner.SaveExitFrame;

public class ButtonActionListner implements ActionListener{

	JFrame1 frame;
	public ButtonActionListner(JFrame1 frame) {
		this.frame=frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("click"))
		{
			System.out.println("click");
			frame.dispose();
			SaveExitFrame save=new SaveExitFrame();
		}
		
	}

}
