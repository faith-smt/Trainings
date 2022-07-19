/**
 * 
 */
package com.faith.trainings.guessinggame;

import java.util.Scanner;

/****************************************************************************
 * <b>Title:</b> Player.java <br>
 * <b>Project:</b> Trainings <br>
 * <b>Description:</b> Player Class <br>
 * <b>Copyright:</b> Copyright (c) 2022 <br>
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Faith Johnson
 * @version 3.x
 * @since Jun 16, 2022
 * <b>updates:</b>
 *  
 ****************************************************************************/

public class Player extends Person {

	int guessCounter = 0;
	
	/**
	 * @return the guessCounter
	 */
	public int getGuessCounter() {
		return guessCounter;
	}

	/**
	 * @param guessCounter the guessCounter to set
	 */
	public void setGuessCounter(int guessCounter) {
		this.guessCounter = guessCounter;
	}

	public Player() {
	}
	
	// constructor
	public Player(String firstName) {
		super(firstName);
	}
}
