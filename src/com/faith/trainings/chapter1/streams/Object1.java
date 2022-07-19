/**
 * 
 */
package com.faith.trainings.chapter1.streams;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/****************************************************************************
 * <b>Title:</b> Object1.java <br>
 * <b>Project:</b> Trainings <br>
 * <b>Description:</b> Create 2 classes/objects Object 1 will have a constructor
 * that accepts a file name.
 * 
 * Object 1 will have 2 methods. One to read in a file and 1 to write a file.
 * 
 * Object 2 will instantiate object1. It will read the info from file 1, convert
 * it to upper case and write out a new file. <br>
 * <b>Copyright:</b> Copyright (c) 2022 <br>
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Faith Johnson
 * @version 3.x
 * @since Jul 12, 2022
 * <b>updates:</b>
 *  
 ****************************************************************************/
/**
 * @author faith
 *
 */
public class Object1 {

	public static void main(String[] args) throws IOException {

		Object1 o1 = new Object1();
		o1.process();

		

	}

	public void process() throws IOException {
		readFile();
		writeFile();
		toUppercase();
	}

	public File readFile() {

		File file = new File("/home/faith/Documents/Read/read.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String str;

			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (IOException x) {
			System.err.print(x);
		}
		return file;
	}

	public void writeFile() {
		String text = "Hi, I'm writing to a file";

		try {
			FileWriter fWriter = new FileWriter("/home/faith/Documents/Read/write.txt");
			fWriter.write(text);
			System.out.println(text);
			fWriter.close();
			System.out.println("File is created successfully with the content");
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}

	public void toUppercase() throws IOException {

		try {
			File fileToUpper = new File("/home/faith/Documents/Read/read.txt");

			FileReader in = new FileReader(fileToUpper);

			String result = "";
			int c;
			int d;

			while ((c = in.read()) != -1) {
				d = Character.toUpperCase(c);
				result += (char) d;
			}
			in.close();
			System.out.println(result);
			FileWriter writer = new FileWriter("/home/faith/Documents/Read/touppercase.txt");
			writer.write(result);
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
