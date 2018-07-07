/*
 * Building a text based game.
 * Start Date: 7-7-18 
 */

package Menu;

import Board.Board;

/**
 * The goal of this class is to start the game.
 * @author ColinCasey
 */
public class Run {

	
	public static void main (String[] Args) {
		Board mainMenu = new Board();
		mainMenu.makeBoard();
	}

}
