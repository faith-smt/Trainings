/**
 * 
 */
package com.faith.trainings.chapter1;

/****************************************************************************
 * <b>Title:</b> CodeMagnets.java <br>
 * <b>Project:</b> Trainings <br>
 * <b>Description:</b> CHANGE ME!! <br>
 * <b>Copyright:</b> Copyright (c) 2022 <br>
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Faith Johnson
 * @version 3.x
 * @since Jun 2, 2022
 * <b>updates:</b>
 *  
 ****************************************************************************/

public class CodeMagnets {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int x = 3;

		while (x > 0) {

			if (x > 2) {
				System.out.print("a");
			}
			x = x - 1;
			System.out.print("-");

			if (x == 2) {
				System.out.print("b c");
			}

			if (x == 1) {
				System.out.print("d");
				x = x - 1;
			}
		}

	}
}