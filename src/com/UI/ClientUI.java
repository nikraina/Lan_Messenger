/**
 * 
 */
package com.UI;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author nikhil
 *
 */
public class ClientUI {
	
	public static void main(String args[]){
		JFrame myframe = new JFrame("Messenger");
		JPanel mypanel = new JPanel();
		mypanel.setLayout(new BoxLayout(mypanel,BoxLayout.Y_AXIS));
		JPanel uppanel = new JPanel();
		JPanel downpanel = new JPanel();
		JTextArea mytextbox = new JTextArea(15, 25);
		mytextbox.setEditable(false);
		JTextField mytextfield = new JTextField(20);
		JButton mybutton = new JButton("Send");
		
		uppanel.add(mytextbox);
		downpanel.add(mytextfield);
		downpanel.add(mybutton);
		
		mypanel.add(uppanel);
		mypanel.add(downpanel);
		
		myframe.setContentPane(mypanel);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setResizable(false);
		myframe.pack();
		myframe.setVisible(true);
		
	}
	
		

}
