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
public class WindowFieldView extends AbstractFieldView{

	public WindowFieldView() {
		panelField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		
		addTextArea();
		setResult();
	}

	private void addTextArea() {
		textArea.setBackground(Color.WHITE);
	}

	private void setResult() {
		labelField.setBackground(Color.WHITE);
	
	}
	
}
