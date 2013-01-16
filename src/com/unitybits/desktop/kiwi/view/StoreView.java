/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.view;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Map;
import java.util.Observable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.unitybits.desktop.kiwi.controller.Business;
import com.unitybits.desktop.kiwi.controller.CalculationController;
import com.unitybits.desktop.kiwi.model.event.LabelEvent;
import com.unitybits.desktop.kiwi.model.event.StyleEvent;
import com.unitybits.desktop.kiwi.text.MenuValue;
import com.unitybits.desktop.kiwi.util.enums.Mode;
import com.unitybits.desktop.kiwi.view.component.StyleFactory;
import com.unitybits.desktop.kiwi.view.component.Window;
import com.unitybits.desktop.kiwi.view.component.field.FieldView;
import com.unitybits.desktop.kiwi.view.component.key.KeyView;
import com.unitybits.desktop.kiwi.view.component.menu.MenuView;
import com.unitybits.desktop.kiwi.view.component.menu.WindowMenuView;

import static com.unitybits.desktop.kiwi.text.Size.*;

/**
 * 
 * @author rosc
 */
public class StoreView extends JFrame implements View {

	private static final long serialVersionUID = 1L;

	private final MenuView menuView;
	private KeyView keyView;
	private FieldView fieldView;

	private Window factory;
	private JPanel panel;

	public StoreView() {
		menuView = new WindowMenuView();

		panel = new JPanel(new GridLayout(2, 1));

		setJMenuBar(menuView.getMenuBar());

		getContentPane().setLayout(new GridLayout());
		getContentPane().add(panel);

		setResizable(false);
		setTitle("Kiwi - www.unitybits.com");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		Image image = Toolkit.getDefaultToolkit().getImage(
				MenuValue.UNITYBITS_LOGO);
		setIconImage(image);

	}

	private void setStyle(String mode, String style) {
		factory = StyleFactory.getInstance().getWindowFactory(mode, style);

		keyView = factory.createKeyView();
		fieldView = factory.createFieldView();

		panel.removeAll();
		panel.revalidate();
		panel.add(fieldView.getPanelField());
		panel.add(keyView.getPanel());

		CalculationController calculationController = Business.getInstance()
				.getController();

		if (calculationController != null) {
			calculationController.setButton();
		}
	}

	@Override
	public JTextArea getTextArea() {
		return fieldView.getTextArea();
	}

	@Override
	public JLabel getLabel() {
		return fieldView.getLabel();
	}

	@Override
	public Map<String, JButton> getKey() {
		return keyView.getKey();
	}

	@Override
	public Map<String, JMenuItem> getMenuItem() {
		return menuView.getMenuItem();
	}

	@Override
	public void update(Observable o, Object model) {
		if (model instanceof StyleEvent) {
			setStyle(((StyleEvent) model).getMode(),
					((StyleEvent) model).getStyle());
		}

		if (model instanceof LabelEvent) {
			getLabel().setText(((LabelEvent) model).getLabel());
		}
	}

	@Override
	public JFrame getFrame() {
		return this;
	}
}
