package com.techlabs.player;

public class Player {
	private int id;
	private String name;
	private int age;
	private static int autoid;
	
	static
	{
		autoid=1001;
	}
	
	public Player(String name,int age)
	{
		id=autoid;
		this.name=name;
		this.age=age;
		autoid++;
	}
	
	public Player(String name)
	{
		this(name,18);
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
