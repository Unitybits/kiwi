/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.util;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

import com.unitybits.desktop.kiwi.text.MenuValue;


/**
 * 
 * @author rosc
 */
public class AboutDialog extends JDialog implements ActionListener, HyperlinkListener {

	private static final long serialVersionUID = 1L;

	private static AboutDialog instance = null;
	
	private AboutDialog(){
		
	}
	
	public static synchronized AboutDialog getInstance() {
		if(instance == null){
			instance = new AboutDialog();
		}
		return instance;
	}
	
	public void customDialog(){
		JPanel panelBasic = new JPanel();
		panelBasic.setLayout(new BoxLayout(panelBasic, BoxLayout.Y_AXIS));
		add(panelBasic);

		JPanel panelTop = new JPanel(new BorderLayout(0, 0));
		panelTop.setMaximumSize(new Dimension(400, 60));

		JLabel label = new JLabel("Unitybits represents Kiwi!");
		label.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
		panelTop.add(label);

		ImageIcon imageIcon = new ImageIcon(MenuValue.UNITYBITS_LOGO);
		JLabel imageLabel = new JLabel(imageIcon);
		imageLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 20));
		panelTop.add(imageLabel, BorderLayout.EAST);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.LIGHT_GRAY);

		panelTop.add(separator, BorderLayout.SOUTH);

		JPanel panelText = new JPanel(new BorderLayout());
		panelText.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		final JEditorPane editorPane = new JEditorPane(
				"text/html",
				"<h2>Kiwi</h2><small>Version 1.0.0</small><br/><br/>Kiwi is designed by Unitybits to make a free calculator.<br/>(c) All rights reserved. Visit <a href='http://unitybits.com'>www.unitybits.com</a>");

		editorPane.setEditable(false);
		editorPane.addHyperlinkListener(this);

		panelText.add(editorPane);

		JPanel panelBottom = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton buttonOk = new JButton("Close");
		buttonOk.setMnemonic('C');
		buttonOk.addActionListener(this);
		panelBottom.add(buttonOk);
		
		panelBasic.add(panelTop);
		panelBasic.add(panelText);
		panelBasic.add(panelBottom);

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("Kiwi by Unitybits");
		setAlwaysOnTop(true);
		setSize(400, 300);
		setResizable(false);
		setVisible(true);

		Image image = Toolkit.getDefaultToolkit().getImage(MenuValue.UNITYBITS_LOGO);
		setIconImage(image);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if ("Close".equals(e.getActionCommand())) {
			dispose();
		}

	}

	@Override
	public void hyperlinkUpdate(HyperlinkEvent e) {
		HyperlinkEvent.EventType event = e.getEventType();
		if (event == HyperlinkEvent.EventType.ACTIVATED) {
			try {
				URI uri = new URI(e.getURL().toString());
				Desktop desktop = Desktop.getDesktop();
				desktop.browse(uri);
			} catch (IOException e1) {
				e1.printStackTrace();
			} catch (URISyntaxException e1) {
				e1.printStackTrace();
			}
		}
	}
}
