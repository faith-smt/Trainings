/**
 * 
 */
package com.faith.trainings.guessinggame;

import java.util.*;

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

	private int playerGuess;

	Player player = new Player();

	Translator t1 = new Translator();

	// Launch the app
	public static void main(String[] args) {
		GuessingGame g1 = new GuessingGame();
		g1.process();
	}

	/**
	 * Constructor
	 */
	public void process() {
		String playAgain = "";

		startGame();

		do {
			System.out.println(t1.getPrompt("welcome"));

//			 Generate target number
			int targetNum = generateTargetNumber();
			System.out.println(" Target Number: " + targetNum);

			// Check the players guess
			playRound(player.guessCounter, targetNum);

			// Check if the player wants to play again
			System.out.println(t1.getPrompt("playAgain"));
			playAgain = getStringInput();

		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println(t1.getPrompt("endGame"));

	}

	/**
	 * Start the game by calling methods to enter the players name and choose
	 * language preference
	 */
	public void startGame() {
		enterLanguage();
		enterName();
	}

	/**
	 * Get name from command line
	 */
	public void enterName() {
		System.out.println(t1.getPrompt("enterName"));
		String name = getStringInput();
		player.setFirstName(name);
		System.out.println(name);
	}

	/**
	 * Get language preference from command line
	 */
	public void enterLanguage() {
		System.out.println(t1.getPrompt("chooseLanguage"));
		String language = getStringInput();
		t1.language = language;
	}

	/**
	 * @return string input
	 */
	public String getStringInput() {
		// Initialize scanner class
		Scanner strInput = new Scanner(System.in);
		return strInput.nextLine();

	}

	/**
	 * @return integer input
	 */
	public int getIntInput() {
		Scanner intInput = new Scanner(System.in);
		return intInput.nextInt();
	}

	/**
	 * @param playerGuess
	 * @param guessCounter
	 * @param targetNum
	 * @param input
	 */
	public void playRound(int guessCounter, int targetNum) {

		while (playerGuess != targetNum) {
			playerGuess = getIntInput();
			player.guessCounter++;
			// check guess by comparing to target number
			if (playerGuess == targetNum) {
				System.out.println(t1.getPrompt("winner"));
				System.out.printf(t1.getPrompt("numOfTries") + player.guessCounter);

			} else if (playerGuess > targetNum) {
				System.out.println(t1.getPrompt("tooHigh"));

			} else if (playerGuess < targetNum) {
				System.out.println(t1.getPrompt("tooLow"));
			}
		}
	}

	/**
	 * @return random integer
	 */
	public int generateTargetNumber() {
		Random r = new Random();
		int min = 1;
		int max = 100;
		return r.nextInt(max - min) + min;
	}
}
