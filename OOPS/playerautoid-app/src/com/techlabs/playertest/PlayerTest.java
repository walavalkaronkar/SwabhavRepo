package com.techlabs.playertest;

import com.techlabs.player.Player;

public class PlayerTest {
	public static void main(String[] args) 
	{
	Player p1=new Player("Sachin",50);
	Player p2=new Player("Virat",30);
	printDetails(p1);
	printDetails(p2);
	//Player elder=p1.whoIsElder(p2);
	//System.out.println("Elder is "+elder.getName());
	}
	
	
	public static void printDetails(Player p)
	{
		System.out.println(p.getId()+" "+p.getName()+" "+p.getAge());
	}
}
