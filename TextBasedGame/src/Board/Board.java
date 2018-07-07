/*
 * Building a text based game.
 * Start Date: 7-7-18 
 */

package Board;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This class makes the starting menu for the game. I want this menu to have
 * four buttons(Play, Help, Exit, Setting).
 * @author Colin
 */
public class Board {
	
	private JFrame frame= new JFrame();	
	
	
	public void makeBoard() {	
		frame.setVisible(true);
		frame.setSize(500, 500);
		makeButtons();
	}
	
	
	public void makeButtons() {
		JPanel ButtonHolderPanel = new JPanel();
		JButton Play = new JButton("Play");
		JButton Setting = new JButton("Setting");
		JButton Help = new JButton("Help");
		JButton Exit = new JButton("Exit");
		ButtonHolderPanel.add(Play);
		ButtonHolderPanel.add(Setting);
		ButtonHolderPanel.add(Help);
		ButtonHolderPanel.add(Exit);
		frame.add(ButtonHolderPanel, BorderLayout.CENTER);
	}
	
}
