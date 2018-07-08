/*
 * Building a text based game.
 * Start Date: 7-7-18 
 */

package Start;

import Board.Board;

/**
 * The goal of this class is to start the game.
 * @author Colin
 */
public class Run {

	/**
	 * The method that starts the game.
	 * @param Args String[] Args
	 */
	public static void main (String[] Args) {
		Board mainMenu = new Board();
		mainMenu.makeBoard();
	}

}
