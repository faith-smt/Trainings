/**
 * 
 */
package com.faith.trainings.chapter1;

/****************************************************************************
 * <b>Title:</b> IntroToProgramming.java <br>
 * <b>Project:</b> Trainings <br>
 * <b>Description:</b> Intro to Programming Exercise 1
 * Write a class that creates and stores a value for each of the following data types:
int, double, float, char, boolean
Output these values to the display
BONUS: Create a method for the display of information using class and method variables
<br>
 * <b>Copyright:</b> Copyright (c) 2022 <br>
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Faith Johnson
 * @version 3.x
 * @since Jun 1, 2022
 * <b>updates:</b>
 *  
 ****************************************************************************/
/**
 *  Creates a class and stores values for data types: int, double, float, char,
 * boolean
 *
 */

public class IntroToProgramming {
	public static void main(String[] args) {
		int i = 5;
		double d = 754.22;
		float f = 90.563F;
		char c = 'f';
		boolean isTrue = true;
		System.out.println(
				"Int:" + i + " " + "Double:" + d + " " + "Float:" + f + " " + "Char:" + c + " " + "Boolean:" + isTrue);
	}
}
