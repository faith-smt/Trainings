/**
 * 
 */
package com.faith.trainings.chapter1.maps;

import java.util.*;
import java.util.HashMap;
import java.util.TreeMap;

/****************************************************************************
 * <b>Title:</b> Maps.java <br>
 * <b>Project:</b> Trainings <br>
 * <b>Description:</b> 
 * Create a Map of states (State code/state name)
   Order and reverse order the data
 <br>
 * <b>Copyright:</b> Copyright (c) 2022 <br>
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Faith Johnson
 * @version 3.x
 * @since Jun 6, 2022
 * <b>updates:</b>
 *  
 ****************************************************************************/

public class Maps {
	public static void main(String[] args) {

		Maps m1 = new Maps();
		m1.process();
	}

	/**
	 * 
	 */
	public void process() {
		TreeMap<Integer, String> states = new TreeMap<>();
		states.put(33, "NH");
		states.put(50, "VT");
		states.put(6, "CA");
		states.put(8, "CO");
		print(states);
		reverse(states);
	}

	/**
	 * Print each entry of the map in order 
	 * @param states
	 */
	public void print(TreeMap<Integer, String> states) {
		for (Map.Entry<Integer, String> entry : states.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}
	
	/**
	 * Print each entry of the map in descending order
	 * @param states
	 */
	public void reverse(TreeMap<Integer, String> states) {
		System.out.println(states.descendingMap());
	}
}
