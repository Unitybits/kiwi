/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import com.unitybits.desktop.kiwi.model.Data;
import com.unitybits.desktop.kiwi.model.Model;
import com.unitybits.desktop.kiwi.util.AboutDialog;
import com.unitybits.desktop.kiwi.util.PrintDialog;
import com.unitybits.desktop.kiwi.view.View;


import static com.unitybits.desktop.kiwi.text.MenuValue.*;

/**
 * 
 * @author rosc
 */
class MenuController implements ActionListener {

	private Model model;
	private View view;

	public MenuController(Business business) {
		model = business.getModel();
		view = business.getView();

		for (JMenuItem item : view.getMenuItem().values()) {
			item.addActionListener(this);
		}

		for (String menu : view.getMenuItem().keySet()) {
			if (model.getMenus().get(menu) != null) {
				view.getMenuItem().get(menu)
						.setSelected(model.getMenus().get(menu));
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String menu = e.getActionCommand();

		menuPrint(menu);
		menuPreferences(menu);
		menuExit(menu);
		menuStyle(menu);
		menuMode(menu);
		menuAbout(menu);
	}

	private void menuPreferences(String menu) {
		if (PREFERENCES.equals(menu)) {
			System.out.println("preferences");
		}
	}

	private void menuPrint(String menu) {
		if (PRINT.equals(menu)) {
			if (view.getTextArea().getText().length() < 1) {
				JOptionPane
						.showMessageDialog(view.getFrame(), "Text is empty!");
			} else {
				 PrintDialog.getInstance().print(view.getTextArea().getText());
			}

		}
	}

	private void menuExit(String menu) {
		if (EXIT.equals(menu)) {
			System.exit(0);
		}
	}

	private void menuAbout(String menu) {
		if (ABOUT.equals(menu)) {
			AboutDialog.getInstance().customDialog();
			AboutDialog.getInstance().setLocationRelativeTo(view.getFrame());
		}
	}

	private void menuStyle(String menu) {
		for (String style : STYLES) {
			if (style.equals(menu)) {
				Data.getInstance().saveStyle(null, menu);
			}
		}
	}

	private void menuMode(String menu) {
		for (String mode : MODES) {
			if (mode.equals(menu)) {
				Data.getInstance().saveStyle(menu, null);
			}
		}
	}

	@Override
	public String toString() {
		return "MenuController [model=" + model + ", view=" + view + "]";
	}
}
