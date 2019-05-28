package com.techlabs.game;

public class Game {
	
	private Board board;
	private ResultAnalyser resultAnalyser;
	private Player player;
	private Player player1;
	private Player player2;
	private static int turn=0;
	private Result status;

	public Game(String name1,String name2) {
		board=new Board();
		player1=new Player(name1,Mark.O);
		player2=new Player(name2,Mark.X);
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
	
	public Player getPlayer1()
	{
		return player1;
	}
	
	public Player getPlayer2()
	{
		return player2;
	}
	
	public String getCurrentStatus()
	{
		String result;
		if(status.equals(Result.DRAW))
		{
			result="DRAW";
		}
		else if(status.equals(Result.WIN))
		{
			result="WIN";
		}
		else
		{
			result="INPROGRESS";
		}
		return result;
		
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
			return player1;
		}
		else
		{
			return player2;
		}
	}
	

}

