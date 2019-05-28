package com.techlabs.game;

import com.techlabs.Exceptions.CannotAddException;

public class Board {
	private Cell[] cells=new Cell[9];
	private static final int MAXINDEX=8;
	
	public Board() {
		initiaseCells();
	}
	
	public void setAtLocation(Mark mark,int index)
	{
		cells[index].setMark(mark);
	}
	
	public void initiaseCells()
	{
		for(int index=0;index<=MAXINDEX;index++)
		{
			cells[index]=new Cell();
		}
	}
	
	public Cell[] getCells()
	{
		return cells;
	}
	
	public boolean isBoardFull()
	{
		for(int index=0;index<=MAXINDEX;index++)
		{
			if((cells[index].getMark().equals(Mark.E)))
				return false;
		}
		return true;
	}
	
	public boolean isBoardEmpty()
	{
		for(int index=0;index<=MAXINDEX;index++)
		{
			if(!(cells[index].getMark().equals(Mark.E)))
				return false;
		}
		return true;
	}
	
}
