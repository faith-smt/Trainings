/**
 * 
 */
package com.faith.trainings.chapter1;

/****************************************************************************
 * <b>Title:</b> EvenNums.java <br>
 * <b>Project:</b> Trainings <br>
 * <b>Description:</b> Intro to Programming Exercise 2c 
 * Display only the even numbers 1 - 20 using a loop of some kind. <br>
 * <b>Copyright:</b> Copyright (c) 2022 <br>
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Faith Johnson
 * @version 3.x
 * @since Jun 3, 2022
 * <b>updates:</b>
 *  
 ****************************************************************************/
/**
 * Prints even numbers 0-20
 *
 */

public class EvenNums {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				count++;
				System.out.println(i);
			}
		}
	}
}
