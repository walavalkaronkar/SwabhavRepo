package com.techlabs.game;

import com.techlabs.Exceptions.CannotAddException;

public class Cell {

	private Mark mark;
	
	public Cell() {
		mark=Mark.E;
	}

	public void setMark(Mark mark) {
		if(this.mark==Mark.E)
		{
			this.mark = mark;
		}
		else
		{
			throw new CannotAddException("Already Marked");
		}
	}


	public Mark getMark() {
		return mark;
	}
	
}
