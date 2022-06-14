/**
 * 
 */
package com.faith.trainings.guessinggame;

import java.util.*;
import java.io.*;

/****************************************************************************
 * <b>Title:</b> Translator.java <br>
 * <b>Project:</b> Trainings <br>
 * <b>Description:</b> CHANGE ME!! <br>
 * <b>Copyright:</b> Copyright (c) 2022 <br>
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Faith Johnson
 * @version 3.x
 * @since Jun 13, 2022 <b>updates:</b>
 * 
 ****************************************************************************/

public class Translator {
	// promptDictionary map
	public void promptDictionary() {
		// create linked hashmap
		LinkedHashMap<String, String> english = new LinkedHashMap<String, String>();
		// set values
		english.put("welcomeMsg", "Welcome to the game");
		english.put("startGame", "Guess a number between 1-100");
		// convert values to a collection
		// print out the values
		Collection<String> englishValues = english.values();
//		System.out.println("english prompts : " + englishValues);
		
		LinkedHashMap<String, String> spanish = new LinkedHashMap<String, String>();

		spanish.put("welcomeMsg", "something in spanish");
		spanish.put("startGame", "spanish");

		Collection<String> spanishValues = spanish.values();
//		System.out.println("english prompts : " + spanishValues);

//		Scanner langObj = new Scanner(System.in);
//		System.out.println("Enter eng or span to choose a language");
//		String language = langObj.nextLine();
//		System.out.println("You choose: " + language);
		
	}
	// lookUpPrompt()
	// if language entered == eng,
	// return englishValues
	// if language entered == span
	// return spanishValues
}
