/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.util;


import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 * 
 * @author rosc
 */
public class Dialog {

	private static Dialog instance = null;
	
	private Dialog() {
	}
	
	public static Dialog getInstance() {
		if(instance == null){
			instance = new Dialog();
		}
		return instance;
	}
	
	public static void messageDialog(String message, String title){
		JOptionPane optionPane = new JOptionPane(message);
		
		JDialog dialog = optionPane.createDialog(title);
		dialog.setVisible(true);
	}
}
