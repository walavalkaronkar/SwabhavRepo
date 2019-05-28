package com.techlabs.game;


public class ResultAnalyser {
	
	private Board board;
	
	public ResultAnalyser(Board board) {
		this.board= board;
	}

	public Result analyzeResult()
	{
		Result result=Result.INPROGRESS;
		
		if(checkDiagonally().equals(Result.WIN) || checkHorizontally().equals(Result.WIN) || checkVertically().equals(Result.WIN))
		{
			return Result.WIN;
		}
		if(board.isBoardFull())
		{
			return Result.DRAW;
		}
		else
		{
			return result;
		}
	}
	
	private Result checkDiagonally()
	{
		
		Cell[] marks=board.getCells();
		if( !(marks[0].getMark().equals(Mark.E)) && !(marks[4].getMark().equals(Mark.E)) && !(marks[8].getMark().equals(Mark.E)))
		{
			if( marks[0].getMark().equals(marks[4].getMark()) && marks[4].getMark().equals(marks[8].getMark())) 
			{
				return Result.WIN;
			}
		}
		else if( !(marks[2].getMark().equals(Mark.E)) && !(marks[4].getMark().equals(Mark.E)) && !(marks[6].getMark().equals(Mark.E)))
		{
			if( marks[2].getMark().equals(marks[4].getMark()) && marks[4].getMark().equals(marks[6].getMark())) 
			{
				return Result.WIN;
			}
		}
		return Result.INPROGRESS;
	}
	
	private Result checkHorizontally()
	{
		Cell[] marks=board.getCells();
		if( !(marks[0].getMark().equals(Mark.E)) && !(marks[1].getMark().equals(Mark.E)) && !(marks[2].getMark().equals(Mark.E)))
		{
			if( marks[0].getMark().equals(marks[1].getMark()) && marks[1].getMark().equals(marks[2].getMark())) 
			{
				return Result.WIN;
			}
		}
		else if( !(marks[3].getMark().equals(Mark.E)) && !(marks[4].getMark().equals(Mark.E)) && !(marks[5].getMark().equals(Mark.E)))
		{
			if( marks[3].getMark().equals(marks[4].getMark()) && marks[4].getMark().equals(marks[5].getMark())) 
			{
				return Result.WIN;
			}
		}
		else if( !(marks[6].getMark().equals(Mark.E)) && !(marks[7].getMark().equals(Mark.E)) && !(marks[8].getMark().equals(Mark.E)))
		{
			if( marks[6].getMark().equals(marks[7].getMark()) && marks[7].getMark().equals(marks[8].getMark())) 
			{
				return Result.WIN;
			}
		}
		return Result.INPROGRESS;
	}
	
	private Result checkVertically()
	{
		Cell[] marks=board.getCells();
		if( !(marks[0].getMark().equals(Mark.E)) && !(marks[3].getMark().equals(Mark.E)) && !(marks[6].getMark().equals(Mark.E)))
		{
			if( marks[0].getMark().equals(marks[3].getMark()) && marks[3].getMark().equals(marks[6].getMark())) 
			{
				return Result.WIN;
			}
		}
		else if( !(marks[1].getMark().equals(Mark.E)) && !(marks[4].getMark().equals(Mark.E)) && !(marks[7].getMark().equals(Mark.E)))
		{
			if( marks[1].getMark().equals(marks[4].getMark()) && marks[4].getMark().equals(marks[7].getMark())) 
			{
				return Result.WIN;
			}
		}
		else if( !(marks[2].getMark().equals(Mark.E)) && !(marks[5].getMark().equals(Mark.E)) && !(marks[8].getMark().equals(Mark.E)))
		{
			if( marks[2].getMark().equals(marks[5].getMark()) && marks[5].getMark().equals(marks[8].getMark())) 
			{
				return Result.WIN;
			}
		}
		return Result.INPROGRESS;
	}
	
}
