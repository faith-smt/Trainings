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

	// Close streams

	private String hostName = "localhost";
	private int portNumber = 80;
	private File outputPath = new File("/home/faith/Documents/Read/testfile3.txt");

	public static void main(String[] args) throws IOException {
		Client c1 = new Client();
		c1.getWebPage();
	}

	/**
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	public void getWebPage() throws UnknownHostException, IOException {

		StringBuilder html = new StringBuilder();

		// Create socket and connect to server
		try (Socket socket = new Socket(hostName, portNumber)) {
			System.out.println("Socket Created");

			// Create input and output streams to read and write to the server
			try (DataOutputStream out = new DataOutputStream(socket.getOutputStream())) {

				// Follow the HTTP protocol of GET path
				out.writeBytes("GET / HTTP/1.1\r\n");
				out.writeBytes("Host: hostName\r\n");
				out.writeBytes("\r\n");
				out.flush();
				socket.shutdownOutput();

				String outputStr;

				// Open socket input stream and use reader to translate bytes to characters
				try (BufferedReader buffRead = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

					// Read data from the server until finished reading the document
					while ((outputStr = buffRead.readLine()) != null) {
						html.append(outputStr);
						System.out.println(outputStr);
					}
					String result = html.toString();
					System.out.println(result);
					// Write result to file
					writeFile(result);
					socket.shutdownInput();
				} catch (IOException e) {
					System.out.println("Error" + e);

				}

			}
		}
	}

	/**
	 * @param result 
	 * Creates new file to store result in
	 */
	public void writeFile(String result) {

		try {
			FileWriter fWriter = new FileWriter(outputPath);
			fWriter.write(result);
			fWriter.close();
			System.out.println("File is created successfully with the content");
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}
}
