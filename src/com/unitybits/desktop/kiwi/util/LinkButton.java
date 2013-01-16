/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.util;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
 * 
 * @author rosc
 */
public class LinkButton extends JButton implements ActionListener {

	private static final long serialVersionUID = 1L;

	public LinkButton() {

		 Dimension d = getPreferredSize();
		 d.setSize(d.getWidth()*.5, d.getHeight()*.5);
		 setPreferredSize(d);

		setText("www.appik.de");
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		setForeground(Color.BLUE);
		setFocusPainted(false);
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("link");
		
	}
}
