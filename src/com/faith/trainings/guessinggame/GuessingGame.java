/**
 * 
 */
package com.faith.trainings.guessinggame;

import java.io.InputStreamReader;
import java.util.Scanner;

/****************************************************************************
 * <b>Title:</b> GuessingGame.java <br>
 * <b>Project:</b> Trainings <br>
 * <b>Description:</b>  <br>
 * <b>Copyright:</b> Copyright (c) 2022 <br>
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Faith Johnson
 * @version 3.x
 * @since Jun 9, 2022
 * <b>updates:</b>
 *  
 ****************************************************************************/

public class GuessingGame {
	
	public static void main(String[] args) {
		GuessingGame g1 = new GuessingGame();
		g1.process();
	}

	// process method/controller
	public void process() {
		
		// guessCounter
		
		
		// start game- triggers ask for language 
		
		
		// ask for language- use scanner to grab input from command line

		
		// get translator 
		
		
		// generate targetNum
		int targetNum = (int) (Math.random() * 10);
		System.out.println(targetNum);
		
		
		// ask for guess using scanner
		// command line input
		Scanner in = new Scanner(System.in);
		int playerGuess = in.nextInt();
		System.out.println("You guessed: " + playerGuess);
		
		
		
		// check guess by comparing to target number 
		if(playerGuess == targetNum) {
			System.out.println("You guessed right");
		} else if (playerGuess > targetNum) {
			System.out.println("Too high, guess again");
		
		} else if (playerGuess < targetNum) {
			System.out.println("Too low, guess again");
		
		}
		
		// win game conditions	
	
	}
	
//	public void startGame() {
//		
//	}
	

//	 generate target number to compare to player guess
	public int generateTargetNum() {
		return (int) (Math.random() * 10);
	}	
}


