/**
 * 
 */
package com.faith.trainings.chapter1.loops;

/****************************************************************************
 * <b>Title:</b> Loops.java <br>
 * <b>Project:</b> Trainings <br>
 * <b>Description:</b> Intro to Programming Exercise 2a
 * Create a class that displays numbers 1 - 10 using a while statement;
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
 * Prints numbers 1-10 using a while loop
 *
 */

public class Loops {
	public static void main(String[] args) {
		int num = 1;
		while (num < 11) {
			System.out.println(num);
			num = num + 1;
		}
	}
}
