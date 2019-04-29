package com.techlabs.player;

public class Player {
	private int id;
	private String name;
	private int age;
	
	public Player(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public Player(int id,String name)
	{
		this(id,name,18);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public Player whoIsElder(Player playerTwo)
	{
		if(this.age>playerTwo.age)
		{
			return this;
		}
		return playerTwo;
		
	}
	
}
