/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;

import com.unitybits.desktop.kiwi.model.Model;
import com.unitybits.desktop.kiwi.util.enums.Mode;
import com.unitybits.desktop.kiwi.util.math.MathEngine;
import com.unitybits.desktop.kiwi.view.View;


import static com.unitybits.desktop.kiwi.text.KeyValue.*;

/**
 * 
 * @author rosc
 */
public class CalculationController implements ActionListener {

	private View view;
	private Model model;

	public CalculationController(Business business) {
		view = business.getView();
		model = business.getData().getModel(Mode.CLASSIC, business.getView());
	}

	public void setButton() {
		for (JButton button : view.getKey().values()) {
			button.addActionListener(this);
		}
	}

	public void setView(View view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		checkEqual(e.getActionCommand());
		deleteField(e.getActionCommand());
		clearField(e.getActionCommand());
	}

	public void checkEqual(String expression) {
		final JTextArea textArea = view.getTextArea();

		if (EQUAL.equals(expression)) {
			if (textArea.getText().length() > 0) {
				model.calculateExpression(textArea.getText());
			}
		} else {
			if (!(CLEAR.equals(expression)) || (DELETE.equals(expression))) {
				textArea.insert(expression, textArea.getCaretPosition());
			}
		}

	}

	public void deleteField(String expression) {
		if (DELETE.equals(expression)) {
			view.getTextArea().setText(MathEngine.deleteString(expression));
			view.getLabel().setText(MathEngine.deleteString(expression));
		}
	}

	public void clearField(String expression) {
		final String number = view.getTextArea().getText();

		if (CLEAR.equals(expression)) {
			view.getTextArea().setText(
					MathEngine.clearCharacter(number, view.getTextArea()
							.getCaretPosition()));
		}
	}

	@Override
	public String toString() {
		return "CalculationController [view=" + view + ", model=" + model + "]";
	}
}
