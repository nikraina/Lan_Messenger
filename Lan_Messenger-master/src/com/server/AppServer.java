/**
 * 
 */
package com.server;

import java.io.PrintWriter;
import java.net.*;

/**
 * @author Sudhansu
 *
 */
public class AppServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppServer appServer = new AppServer();
		appServer.createServerConnection();

	}
	/**
	 * This method is used to create a server connection
	 */
	void createServerConnection(){
		String data = "Hello World!!";
		try{
			ServerSocket serSocket = new ServerSocket(4322);
			Socket socket = serSocket.accept();
			System.out.println("Server connected");
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			System.out.println("Sending data "+data);
			out.print(data);
			out.close();
			socket.close();
			serSocket.close();
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Holy Crap!");
		}
	}
}
