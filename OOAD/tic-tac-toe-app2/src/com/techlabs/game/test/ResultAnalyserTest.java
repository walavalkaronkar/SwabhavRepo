package com.techlabs.game.test;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.game.Board;
import com.techlabs.game.Mark;
import com.techlabs.game.Result;
import com.techlabs.game.ResultAnalyser;

public class ResultAnalyserTest {
	
	
	@Test
	public void ifBoardIsFullResultIsDRAW()
	{
		Board board=new Board();
		ResultAnalyser resultAnalyser=new ResultAnalyser(board);
		board.setAtLocation(Mark.O, 3);
		board.setAtLocation(Mark.X, 4);
		board.setAtLocation(Mark.O, 5);
		board.setAtLocation(Mark.X, 0);
		board.setAtLocation(Mark.O, 1);
		board.setAtLocation(Mark.X, 2);
		board.setAtLocation(Mark.O, 6);
		board.setAtLocation(Mark.X, 7);
		board.setAtLocation(Mark.O, 8);
		assertEquals(Result.DRAW,resultAnalyser.analyzeResult());
		
	}
	
	@Test
	public void ifGotThreeSameMArkInHorizontalreturnWIN()
	{
		Board board=new Board();
		ResultAnalyser resultAnalyser=new ResultAnalyser(board);
		board.setAtLocation(Mark.O, 3);
		board.setAtLocation(Mark.O, 4);
		board.setAtLocation(Mark.O, 5);
		assertEquals(Result.WIN,resultAnalyser.analyzeResult());
		
	}
	@Test
	public void ifGotDifferntMArkInHorizontalreturnINPROGRESS()
	{
		Board board=new Board();
		ResultAnalyser resultAnalyser=new ResultAnalyser(board);
		board.setAtLocation(Mark.O, 3);
		board.setAtLocation(Mark.O, 4);
		board.setAtLocation(Mark.X, 5);
		assertEquals(Result.INPROGRESS,resultAnalyser.analyzeResult());
		
	}
	@Test
	public void ifGotAnyMArkEmptyInHorizontalreturnINPROGRESS()
	{
		Board board=new Board();
		ResultAnalyser resultAnalyser=new ResultAnalyser(board);
		board.setAtLocation(Mark.E, 3);
		board.setAtLocation(Mark.E, 4);
		board.setAtLocation(Mark.E, 5);
		assertEquals(Result.INPROGRESS,resultAnalyser.analyzeResult());
		
	}
	
	@Test
	public void ifGotThreeSameMArkInVerticallyreturnWIN()
	{
		Board board=new Board();
		ResultAnalyser resultAnalyser=new ResultAnalyser(board);
		board.setAtLocation(Mark.O, 1);
		board.setAtLocation(Mark.O, 4);
		board.setAtLocation(Mark.O, 7);
		assertEquals(Result.WIN,resultAnalyser.analyzeResult());
		
	}
	@Test
	public void ifGotDifferntMArkInVerticallyreturnINPROGRESS()
	{
		Board board=new Board();
		ResultAnalyser resultAnalyser=new ResultAnalyser(board);
		board.setAtLocation(Mark.O, 0);
		board.setAtLocation(Mark.O, 3);
		board.setAtLocation(Mark.X, 6);
		assertEquals(Result.INPROGRESS,resultAnalyser.analyzeResult());
		
	}
	@Test
	public void ifGotAnyMArkEmptyInVerticallyreturnINPROGRESS()
	{
		Board board=new Board();
		ResultAnalyser resultAnalyser=new ResultAnalyser(board);
		board.setAtLocation(Mark.E, 2);
		board.setAtLocation(Mark.E, 5);
		board.setAtLocation(Mark.E, 8);
		assertEquals(Result.INPROGRESS,resultAnalyser.analyzeResult());
		
	}
	
	@Test
	public void ifGotThreeSameMArkInDiagonallyreturnWIN()
	{
		Board board=new Board();
		ResultAnalyser resultAnalyser=new ResultAnalyser(board);
		board.setAtLocation(Mark.O, 0);
		board.setAtLocation(Mark.O, 4);
		board.setAtLocation(Mark.O, 8);
		assertEquals(Result.WIN,resultAnalyser.analyzeResult());
		
	}
	
	
	@Test
	public void ifGotAnyMArkEmptyInDiagonallyreturnINPROGRESS()
	{
		Board board=new Board();
		ResultAnalyser resultAnalyser=new ResultAnalyser(board);
		board.setAtLocation(Mark.O, 0);
		board.setAtLocation(Mark.E, 4);
		board.setAtLocation(Mark.O, 8);
		assertEquals(Result.INPROGRESS,resultAnalyser.analyzeResult());
		
	}
}
