package com.techlabs.game;

public class Player {

	private String name;
	private Mark mark;
	
	public Player(String name,Mark mark) {
		this.name=name;
		this.mark=mark;
	}

	public Mark getMark() {
		return mark;
	}

	public void setMark(Mark mark) {
		this.mark = mark;
	}

	public String getName() {
		return name;
	}
	
	
}
