package com.techlabs.game;

public class GameConsole {
	
	private static Game game;
	private static boolean stop=false;
	public void start()
	{
		game=new Game();
		game.play(0);
		displayBoard(game.getBoard());
		displaystatus();
		
		game.play(3);
		displayBoard(game.getBoard());
		displaystatus();
		
		game.play(1);
		displayBoard(game.getBoard());
		displaystatus();
		
		game.play(4);
		displayBoard(game.getBoard());
		displaystatus();
		
		game.play(2);
		displayBoard(game.getBoard());
		displaystatus();
		
		game.play(5);
		displayBoard(game.getBoard());
		displaystatus();
		
		game.play(6);
		displayBoard(game.getBoard());
		displaystatus();
		
		game.play(7);
		displayBoard(game.getBoard());
		displaystatus();
		
		game.play(8);
		displayBoard(game.getBoard());
		displaystatus();
		
	}
	
	public void displayBoard(Board board)
	{
		if(stop!=true)
		{
			Cell[] cells=board.getCells();
			int index=0;
			for(int i=0;i<=2;i++)
			{
				for(int j=0;j<=2;j++)
				{
					if(cells[index].getMark().equals(Mark.E))
					{
						System.out.print("-\t");
					}
					else
					{
						System.out.print(cells[index].getMark()+"\t");
					}
					index++;
				}	
				System.out.println();
			}
		}
	}
	
	public void displaystatus()
	{
		if(stop!=true)
		{
			Result status=game.getCurrentStatus();
			if(status.equals(Result.WIN))
			{
				stop=true;
				System.out.println("player "+game.getPlayer().getName()+" Wins");
			}
			else if(status.equals(Result.DRAW))
			{
				System.out.println("Game Draw");
			}
			else if(status.equals(Result.INPROGRESS))
			{
				System.out.println("Last turn of player"+game.getPlayer().getName());
			}
			System.out.println();
		}
	}
}
