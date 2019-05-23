package com.techlabs.commonlistner;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommonListner implements ActionListener{

	SaveExitFrame frame=null;
	public CommonListner(SaveExitFrame frame) {
		this.frame=frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("save"))
		{
			System.out.println("save");
		}
		else if(e.getActionCommand().equals("exit"))
		{
			System.out.println("exit");
			frame.dispose();
		}
		else if(e.getActionCommand().equals("color"))
		{
			frame.getContentPane().setBackground(Color.RED);
		}
		
	}

}
