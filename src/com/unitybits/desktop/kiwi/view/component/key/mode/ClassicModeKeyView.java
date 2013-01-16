/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.view.component.key.mode;

import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.unitybits.desktop.kiwi.text.KeyValue;
import com.unitybits.desktop.kiwi.view.component.key.KeyView;


/**
 * 
 * @author rosc
 */
public class ClassicModeKeyView implements KeyView {

	private final JPanel panelKey = new JPanel(new GridLayout(4, 5, 1, 1));
	private final Map<String, JButton> key = new HashMap<String, JButton>();

	public ClassicModeKeyView() {
		createKey();
		addKey();
	}
	
	@Override
	public JPanel getPanel() {
		return panelKey;
	}

	@Override
	public Map<String, JButton> getKey() {
		return key;
	}
	
	private void addKey() {
		for (String button : KeyValue.BUTTONS) {
			panelKey.add(key.get(button));
		}
	}
	
	private void createKey() {
		for (String button : KeyValue.BUTTONS) {
			key.put(button, new JButton(button));
		}
	}
}
