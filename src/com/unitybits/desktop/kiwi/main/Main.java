/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.main;

import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;

import com.unitybits.desktop.kiwi.util.Log;


/**
 * This abstract class is the entry point of the application. It defines
 * the main method to start the program. Also it uses the facade 
 * abstraction design pattern to encapsulate the system.
 * 
 * @author rosc
 */
abstract class Main {
	
	/**
	 * Main method to start the application.
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				
				@Override
				public void run() {
					Log.LOG.info("Start Program!");
					StartMain.getInstance().startMain();
				}
			});
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Get specific content handler.
	 */
	protected abstract void startMain();
}
