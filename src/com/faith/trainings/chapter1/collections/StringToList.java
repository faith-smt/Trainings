/**
 * 
 */
package com.faith.trainings.chapter1.collections;

import java.util.ArrayList;
import java.util.Arrays;

/****************************************************************************
 * <b>Title:</b> StringToList.java <br>
 * <b>Project:</b> Trainings <br>
 * <b>Description:</b> Convert String[] to list String s = {"one","two"}<br>
 * <b>Copyright:</b> Copyright (c) 2022 <br>
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Faith Johnson
 * @version 3.x
 * @since Jun 10, 2022 <b>updates:</b>
 * 
 ****************************************************************************/

public class StringToList {

	public static void main(String[] args) {
		StringToList sl1 = new StringToList();
		sl1.process();
	}
	public void process() {
		String str = "one, two";
		System.out.println("String: " + str);
		splitString(str);
		convertToList(str);
	}
	/**
	 * Split string
	 * @param str
	 */
	public void splitString(String str) {
		String[] spltStr = str.split(",");
	}

	/**
	 * Convert to ArrayList
	 * @param spltStr
	 */
	public void convertToList(String spltStr) {
		// convert to ArrayList
		ArrayList<String> strList = new ArrayList<String>(Arrays.asList(spltStr));
		System.out.println("List: " + strList);
	}
}
