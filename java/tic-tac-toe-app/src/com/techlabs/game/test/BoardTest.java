package com.techlabs.game.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.techlabs.Exceptions.CannotAddException;
import com.techlabs.game.Board;
import com.techlabs.game.Cell;
import com.techlabs.game.Mark;

public class BoardTest {

	
	@Test
	public void addXToBoardAtIndex1()
	{
		Board boardObj=new Board();
		Mark mark=Mark.X;
		int index=1;
		boardObj.setAtLocation(mark, index);
		
		Cell[] board=boardObj.getCells();
		assertEquals(Mark.X,board[1].getMark());
		
	}
	
	@Test(expected = CannotAddException.class)	
	public void addOToBoardAtSameIndexDoesNotAddAgain()
	{
		Board boardObj=new Board();
		Mark mark=Mark.X;
		int index=1;
		boardObj.setAtLocation(mark, index);
		mark=Mark.O;
		boardObj.setAtLocation(mark, index);
		
	} 
	
	@Test()
	public void checklistIsFullGivesTrue()
	{
		Board boardObj=new Board();
		for(int i=0;i<=8;i++)
		{
			boardObj.setAtLocation(Mark.O, i);
		}
		assertEquals(true,boardObj.isBoardFull());
	}

	@Test()
	public void checkwhenListIsEmptyGivesTrue()
	{
		Board boardObj=new Board();
		assertEquals(true,boardObj.isBoardEmpty());
	}
}
