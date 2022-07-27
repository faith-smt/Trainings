/**
 * 
 */
package com.faith.trainings.chapter1.socketsv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;


/****************************************************************************
 * <b>Title:</b> Client.java <br>
 * <b>Project:</b> Trainings <br>
 * <b>Description:</b> CHANGE ME!! <br>
 * <b>Copyright:</b> Copyright (c) 2022 <br>
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Faith Johnson
 * @version 3.x
 * @since Jul 26, 2022
 * <b>updates:</b>
 *  
 ****************************************************************************/
public class Client {

	private String hostName = "localhost";
	private int portNumber = 80;
	private File outputPath = new File("/home/faith/Documents/Read/testfile4.txt");

	public static void main(String[] args) throws IOException {
		Client c1 = new Client();
		c1.process();
	}

	/**
	 * Connects to server and retrieves home page.
	 * Then stores data in result variable
	 * and calls the write file method
	 * @throws IOException
	 */
	public void process() throws IOException {
//		connectToServer();
		writeToServer();

	}

	public Socket connectToServer() throws UnknownHostException, IOException {
		Socket socket = new Socket(hostName, portNumber);
		return socket;
	}
	
	public DataOutputStream writeToServer() throws IOException {
		DataOutputStream out = new DataOutputStream(connectToServer().getOutputStream());
		out.writeBytes("GET / HTTP/1.1\r\n");
		out.writeBytes("Host: hostName\r\n");
		out.writeBytes("\r\n");
		out.flush();
		return out;
	}
	
	public String readFromServer(Socket socket) throws IOException {
		StringBuilder html = new StringBuilder();
		BufferedReader buffRead = new BufferedReader(new InputStreamReader(connectToServer().getInputStream()));
		String outputStr;
		while ((outputStr = buffRead.readLine()) != null) {
			html.append(outputStr);
		}
		String result = html.toString();
		System.out.println("Result String: " + result);
		// Write result to file
		writeFile(result);
		return result;
	}
	
	
	
	/**
	 * Writes result to a file
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