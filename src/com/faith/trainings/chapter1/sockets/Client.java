/**
 * 
 */
package com.faith.trainings.chapter1.sockets;

import java.io.*;
import java.net.*;

/****************************************************************************
 * <b>Title:</b> Client.java <br>
 * <b>Project:</b> Trainings <br>
 * <b>Description:</b> Call web server Request a file Write html file to file
 * system <br>
 * <b>Copyright:</b> Copyright (c) 2022 <br>
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Faith Johnson
 * @version 3.x
 * @since Jul 24, 2022 <b>updates:</b>
 * 
 ****************************************************************************/

public class Client {
	private File outputPath = new File("/home/faith/Documents/Read/testfile5.txt");

	public static void main(String[] args) throws IOException {
		Client c1 = new Client();
		c1.process();
	}

	public void process() throws IOException {
		String result = getWebPage();
		writeFile(result);
	}

	/**
	 * Connects to server and retrieves home page. Then stores and returns data in
	 * result variable
	 * 
	 * @throws IOException
	 */
	public String getWebPage() throws IOException {
		String hostName = "localhost";
		int portNumber = 80;
		StringBuilder html = new StringBuilder();

		// Create socket and connect to server
		try {
			Socket socket = new Socket(hostName, portNumber);

			// Create input and output streams to read and write to the server
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			BufferedReader buffRead = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// Follow the HTTP protocol of GET path
			// Retrieve home page of specified web page
			out.writeBytes("GET / HTTP/1.1\r\n");
			out.writeBytes("Host: hostName\r\n");
			out.writeBytes("\r\n");
			out.flush();

			String outputStr;
			// Read data from the server until finished reading the document
			while ((outputStr = buffRead.readLine()) != null) {
				html.append(outputStr);
			}
			System.out.println("Result String: " + html.toString());
			socket.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return html.toString();
	}

	/**
	 * Writes result to a file
	 * 
	 * @param result
	 */
	public void writeFile(String result) {
		try {
			BufferedWriter fWriter = new BufferedWriter(new FileWriter(outputPath));
			fWriter.write(result);
			fWriter.close();
			System.out.println("File is created successfully with the content");
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}
}
