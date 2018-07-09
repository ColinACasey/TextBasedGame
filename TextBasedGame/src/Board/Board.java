/*
 * Building a text based game.
 * Start Date: 7-7-18 
 */

package Board;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This class makes the starting menu for the game. I want this menu to have
 * four buttons(Play, Help, Exit, Setting).
 * @author Colin
 */
public class Board extends JFrame {
	public Board() {
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * This JPanel Holds all of the buttons and is placed into myFrame.
	 */
	private JPanel myButtonHolderPanel = new JPanel();
	
	/**
	 * Sets up myFrame with all needed values and calls a class to deal
	 * with buttons.
	 */
	public void makeBoard() {	
		setVisible(true);
		setSize(500, 500);
		makeButtons();
	}
	
	/**
	 * This class calls four other classes to set up buttons put
	 * into a JPanel.
	 */
	public void makeButtons() {
		JButton Play = new JButton("Play");
		JButton Setting = new JButton("Setting");
		JButton Help = new JButton("Help");
		myButtonHolderPanel.add(Play);
		myButtonHolderPanel.add(Setting);
		myButtonHolderPanel.add(Help);
		exitButton();
		
		getContentPane().add(myButtonHolderPanel, BorderLayout.CENTER);
	}
	
	/**
	 * The Goal of this method is to add the functional
	 * exit button to the frame. 
	 */
	public void exitButton() {
		JButton Exit = new JButton("Exit");
		Exit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	System.exit(0);
            }
        });
		myButtonHolderPanel.add(Exit);
	}
	
}
