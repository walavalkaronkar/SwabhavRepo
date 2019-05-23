package com.techlabs.eventswithbutton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class EmailObserver implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Saved notified to email");
	}
}
