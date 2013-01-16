/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.view.component.field;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * 
 * @author rosc
 */
public interface FieldView {

	public JPanel getPanelField();
	
	public JTextArea getTextArea();

	public JLabel getLabel();
	
}
