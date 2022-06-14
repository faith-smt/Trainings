/**
 * 
 */
package com.faith.trainings.chapter1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/****************************************************************************
 * <b>Title:</b> Lists.java <br>
 * <b>Project:</b> Trainings <br>
 * <b>Description:</b> 
  Create a list of people (Person id, First Name, Last Name.
  Shuffle people into a random order.
  Convert String[] to list String s = {"one", "two"}<br>
 * <b>Copyright:</b> Copyright (c) 2022 <br>
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Faith Johnson
 * @version 3.x
 * @since Jun 8, 2022
 * <b>updates:</b>
 *  
 ****************************************************************************/

public class Lists {
	public static void main(String[] args) {
		
		Lists l1 = new Lists();
		l1.process();
	}

	/**
	 * Creates list and adds people to the list
	 */
	public void process() {
		List<String> people = new ArrayList<String>();
		people.add("01 " + "Faith " + "Johnson");
		people.add("02 " +"Olin " + "Davis");
		people.add("03 " + "Brendan " + "Schmitt");
		people.add("04 " + "Kelsey " + "Bowers");
		
		shuffle(people);
		print(people);
	}

	/**
	 * Shuffles list of people
	 * @param people
	 */
	public void shuffle(List<String> people) {
		Collections.shuffle(people);
	}
	
	/**
	 * Prints list of people
	 * @param people
	 */
	public void print(List<String> people) {
		System.out.println(people);
	}
}
