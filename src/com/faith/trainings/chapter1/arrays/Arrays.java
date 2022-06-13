/**
 * 
 */
package com.faith.trainings.chapter1.arrays;
/****************************************************************************
 * <b>Title:</b> Arrays.java <br>
 * <b>Project:</b> Trainings <br>
 * <b>Description:</b> Create an array of 10 elements and store a random number into the array.
 * Display the numbers of the array and their corresponding row.
 * random number: int randVal = (int) Math.random() * 100 <br>
 * <b>Copyright:</b> Copyright (c) 2022 <br>
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Faith Johnson
 * @version 3.x
 * @since Jun 6, 2022
 * <b>updates:</b>
 *  
 ****************************************************************************/



public class Arrays {
	public static void main(String[] args) {
		Arrays a1 = new Arrays();
		a1.process();
	}

	/**
	 * 
	 */
	public void process() {
		int randVal = generateInt();
		int[] anArray = { 12, randVal, 1, 1567, 2000, 5432, 67, 93, 20, 98 };
		printArray(anArray);
	}

	/**
	 * @return random integer
	 */
	public int generateInt() {
		return (int) (Math.random() * 100);
	}

	/**
	 * Print each item of array
	 * @param anArray 
	 */
	public void printArray(int[] anArray) {
		for (int i = 0; i < anArray.length; i++) {
			System.out.println(anArray[i]);
		}
	}
}
