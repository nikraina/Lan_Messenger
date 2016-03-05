/**
 * 
 */
package com.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author Sudhansu
 *
 */
public class AppClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppClient appCLient = new AppClient();
		appCLient.receiveData();

	}
	/**
	 * Receive data sent by the server
	 */
	void receiveData(){
		try{
			Socket socket = new Socket("localhost",4322);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("Receiving message");
			while(!in.ready()){
			//	System.out.println("??");
			}
			System.out.println(in.readLine());
			in.close();
			// close socket connection at end
			socket.close();
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Crap!");
		}
	}
}
