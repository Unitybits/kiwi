/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.view.component.field;

import java.awt.Color;

import javax.swing.BorderFactory;

/**
 * 
 * @author rosc
 */
public class AppikOrangeField extends AbstractFieldView{

	public AppikOrangeField() {
		panelField.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
		
		addTextArea();
		setResult();
	}
	
	private void addTextArea() {
		textArea.setBackground(Color.ORANGE);
		textArea.setForeground(Color.WHITE);
	}

	private void setResult() {
		labelField.setBackground(Color.ORANGE);
		labelField.setForeground(Color.WHITE);
	}
	
}
