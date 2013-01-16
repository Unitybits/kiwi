/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.view;

import java.util.Map;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

/**
 * 
 * @author rosc
 */
public interface View extends Observer {

	public JTextArea getTextArea();
	
	public JLabel getLabel();
	
	public JFrame getFrame();
	
	public Map<String, JButton> getKey();

	public Map<String, JMenuItem> getMenuItem();
}
