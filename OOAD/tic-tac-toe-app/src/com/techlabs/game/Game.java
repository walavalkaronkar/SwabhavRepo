package com.techlabs.game;

public class Game {
	
	private Board board;
	private ResultAnalyser resultAnalyser;
	private Player player;
	private static int turn=0;
	private Result status;

	public Game() {
		board=new Board();
		resultAnalyser=new ResultAnalyser(board);
		status=Result.INPROGRESS;
	}
	
	public Board getBoard()
	{
		return board;
	}
	public Player getPlayer()
	{
		return player;
	}
	
	public Result getCurrentStatus()
	{
		return status;
	}
	
	public void play(int index)
	{
		if(status.equals(Result.INPROGRESS))
		{
			player=getPlayerByTurn();
			board.setAtLocation(player.getMark(), index);
			status=resultAnalyser.analyzeResult();
		}
	}
	
	
	public Player getPlayerByTurn()
	{
		turn++;
		if(turn % 2==0)
		{
			return new Player("Onkar",Mark.O);
		}
		else
		{
			return new Player("Ram",Mark.X);
		}
	}
	

}

