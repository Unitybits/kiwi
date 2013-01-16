/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.view.component.key;

import java.util.Map;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * 
 * @author rosc
 */
public interface KeyView {

	public JPanel getPanel();

	public Map<String, JButton> getKey();
	
}
