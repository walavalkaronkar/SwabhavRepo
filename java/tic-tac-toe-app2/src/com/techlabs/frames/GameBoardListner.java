package com.techlabs.frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.techlabs.game.Board;
import com.techlabs.game.Cell;
import com.techlabs.game.Game;
import com.techlabs.game.Mark;

public class GameBoardListner implements ActionListener{

	Game game;
	GameBoard gameBoard;
	Board board;
	Cell[] cells;
	String name1, name2;
	public GameBoardListner(GameBoard gameBoard,Game game) {
		this.game=game;
		this.gameBoard=gameBoard;
		name1=game.getPlayer1().getName();
		name2=game.getPlayer2().getName();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//JButton b=(JButton)e.getSource();
		int index=Integer.parseInt(e.getActionCommand());
		game.play(index);
		board=game.getBoard();
		cells=board.getCells();
		
		
		gameBoard.button0.setText(markToString(cells[0].getMark()));
		gameBoard.button1.setText(markToString(cells[1].getMark()));
		gameBoard.button2.setText(markToString(cells[2].getMark()));
		gameBoard.button3.setText(markToString(cells[3].getMark()));
		gameBoard.button4.setText(markToString(cells[4].getMark()));
		gameBoard.button5.setText(markToString(cells[5].getMark()));
		gameBoard.button6.setText(markToString(cells[6].getMark()));
		gameBoard.button7.setText(markToString(cells[7].getMark()));
		gameBoard.button8.setText(markToString(cells[8].getMark()));
		
		if(game.getPlayer().getName()==name1)
		{
			gameBoard.turn.setText(name2);
		}
		else
		{
			gameBoard.turn.setText(name1);
		}
		
		gameBoard.status.setText(game.getCurrentStatus());
		
	}
	
	public String markToString(Mark mark)
	{
		String markString;
		if(mark.equals(Mark.E))
		{
			markString="-";
		}
		else if(mark.equals(Mark.X))
		{
			markString="X";
		}
		else
		{
			markString="O";
		}
		return markString;
	}

}
