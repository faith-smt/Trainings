/**
 * 
 */
package com.faith.trainings.chapter1.streams2;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/****************************************************************************
 * <b>Title:</b> ImageManager.java <br>
 * <b>Project:</b> Trainings <br>
 * <b>Description:</b> Take an image and store it into memory. Write it back out
 * to a file<br>
 * <b>Copyright:</b> Copyright (c) 2022 <br>
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Faith Johnson
 * @version 3.x
 * @since Jul 18, 2022 <b>updates:</b>
 * 
 ****************************************************************************/

public class ImageManager {

	private File image = new File("/home/faith/Pictures/Screenshots/test.png");
	private File outputPath = new File("/home/faith/Pictures/outputTest.png");
	private BufferedImage newImage;

	public static void main(String[] args) throws IOException {
		ImageManager im1 = new ImageManager();
		im1.process();
	}

	public void process() throws IOException {
		readImage();
		writeImage();
	}

	/**
	 * @throws IOException Reads image file and converts to byte array
	 */
	public void readImage() throws IOException {

		try {
			// Reads image file
			BufferedImage buffImage = ImageIO.read(image);
			System.out.println("Reading complete");

			// Holds copy of data in outputStream class and writes image
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			ImageIO.write(buffImage, "png", outputStream);

			// Converts image into the byte array
			byte[] byteArray = outputStream.toByteArray();

			// Creates the object of ByteArrayInput Stream class to read the byte array
			ByteArrayInputStream inputStream = new ByteArrayInputStream(byteArray);

			// Reads the image from the object inputStream
			newImage = ImageIO.read(inputStream);
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}

	}

	/**
	 * @throws IOException Writes image from byteArray to a new file
	 */
	public void writeImage() throws IOException {
		try {
			// Creates new file and writes image from what is read from byteArray
			ImageIO.write(newImage, "png", outputPath);
			System.out.println("Write successful");
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
	}
}
