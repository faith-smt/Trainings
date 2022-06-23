/**
 * 
 */
package com.faith.trainings.guessinggame;

import java.util.*;
import java.io.*;

/****************************************************************************
 * <b>Title:</b> Translator.java <br>
 * <b>Project:</b> Trainings <br>
 * <b>Description:</b> Translator Class <br>
 * <b>Copyright:</b> Copyright (c) 2022 <br>
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Faith Johnson
 * @version 3.x
 * @since Jun 13, 2022 <b>updates:</b>
 * 
 ****************************************************************************/

public class Translator {

	// Set default language to English
	String language = "eng";

	// Initialize maps
	HashMap<String, String> english = new HashMap<String, String>();
	HashMap<String, String> spanish = new HashMap<String, String>();

	/**
	 * Constructor
	 */
	public Translator() {
		// Set keys and values for each language
		english.put("welcome", "Welcome to the Guessing Game! Enter a number between 1-100.");
		english.put("winner", "You guessed right! GAME OVER.");
		english.put("numOfTries", "Number of tries: ");
		english.put("tooHigh", "Too high, guess again.");
		english.put("tooLow", "Too low, guess again.");
		english.put("playAgain", "Would you like to play again?");
		english.put("endGame", "Thank you for playing! Goodbye.");

		spanish.put("welcome", "¡Bienvenido al juego de adivinanzas! Introduzca un número entre 1 y 100.");
		spanish.put("winner", "¡Lo adivinaste! JUEGO TERMINADO.");
		spanish.put("numOfTries", "Número de intentos: ");
		spanish.put("tooHigh", "Demasiado alto, adivina de nuevo.");
		spanish.put("tooLow", "Demasiado bajo, adivina de nuevo");
		spanish.put("playAgain", "¿Te gustaría volver a jugar?");
		spanish.put("endGame", "¡Gracias por jugar! Adiós.");
	}

	/**
	 * Get the prompt based on user choice
	 * 
	 * @param promptName
	 * @return promptName
	 */
	public String getPrompt(String promptName) {
		if (this.language.equals("eng")) {
			return english.get(promptName);
		} else if (this.language.equals("span")) {
			return spanish.get(promptName);
		}
		return "Language does not exist: " + this.language;
	}
}
