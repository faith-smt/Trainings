/**
 * 
 */
package com.faith.trainings.guessinggame;

import java.io.InputStreamReader;
import java.util.Scanner;

/****************************************************************************
 * <b>Title:</b> GuessingGame.java <br>
 * <b>Project:</b> Trainings <br>
 * <b>Description:</b> <br>
 * <b>Copyright:</b> Copyright (c) 2022 <br>
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Faith Johnson
 * @version 3.x
 * @since Jun 9, 2022 <b>updates:</b>
 * 
 ****************************************************************************/

public class GuessingGame {

	public static void main(String[] args) {
		GuessingGame g1 = new GuessingGame();
		g1.process();

		Translator t1 = new Translator();
		t1.promptDictionary();

		// create a player object
		Person player = new Person();
//		player.setFirstName("Faith");
//		System.out.println(player.getFirstName());
	}

	// process method/controller
	public void process() {

		// guessCounter
		int guessCounter;
		// start game- triggers ask for language and generate target number
		int targetNum = generateTargetNumber();
		System.out.println(targetNum);

		// get translator

		// ask for guess using scanner
		// command line input
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number between 1-100");
		int playerGuess = in.nextInt();
		System.out.println("You guessed: " + playerGuess);

		boolean isGuessRight = false;

		while (isGuessRight = false)

			// check guess by comparing to target number
			if (playerGuess == targetNum) {
				isGuessRight = true;
				System.out.println("You guessed right");
			} else if (playerGuess > targetNum) {
				isGuessRight = false;
				System.out.println("Too high, guess again");

			} else if (playerGuess < targetNum) {
				isGuessRight = false;
				System.out.println("Too low, guess again");
			}

		// win game conditions

	}

	public void startGame() {

	}

	public void getTranslator() {

	}

	public void checkGuess() {
		// inside of a while loop
		// check guess by comparing to target number

	}

	public void guessScanner() {
		// ask for guess using scanner
	}

	public int generateTargetNumber() {
		// generate targetNum
		return (int) (Math.random() * 10);
	}

	public void winGame() {
		// conditions to win the game
	}
}
