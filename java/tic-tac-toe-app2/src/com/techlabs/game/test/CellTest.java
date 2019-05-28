package com.techlabs.game.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.Exceptions.CannotAddException;
import com.techlabs.game.Cell;
import com.techlabs.game.Mark;

public class CellTest {

	@Test
	public void storeOInCell()
	{
		Cell cell=new Cell();
		cell.setMark(Mark.O);
		Mark mark=cell.getMark();
		assertEquals(Mark.O,mark);
	}
	
	@Test
	public void storeXInCell()
	{
		Cell cell=new Cell();
		cell.setMark(Mark.X);
		Mark mark=cell.getMark();
		assertEquals(Mark.X,mark);
	}
	
	@Test(expected = CannotAddException.class)	
	public void markInAlreadyMarkedCellGivesException()
	{
		Cell cell=new Cell();
		cell.setMark(Mark.X);
		Mark mark=cell.getMark();
		
		cell.setMark(Mark.O);
	}
}
