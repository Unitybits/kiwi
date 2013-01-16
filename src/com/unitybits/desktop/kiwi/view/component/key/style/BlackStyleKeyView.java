/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.view.component.key.style;

import java.awt.Color;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import com.unitybits.desktop.kiwi.view.component.key.KeyView;


/**
 * 
 * @author rosc
 */
public class BlackStyleKeyView extends StyleKeyView{

	private JPanel panelKey = getKeyView().getPanel();
	private Map<String, JButton> key = getKeyView().getKey();
	
	public BlackStyleKeyView(KeyView keyView) {
		super(keyView);
	
		panelKey.setName("key");
		panelKey.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		style();

	}

	private void style() {
		for(JButton button: key.values()){
			button.setBackground(Color.BLACK);
			button.setForeground(Color.WHITE);
		}
		panelKey.setBackground(Color.WHITE);
	}

	@Override
	public JPanel getPanel() {
		return panelKey;
	}

	@Override
	public Map<String, JButton> getKey() {
		return key;
	}
}
