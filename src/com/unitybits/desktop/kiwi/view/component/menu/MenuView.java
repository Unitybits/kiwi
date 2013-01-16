/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.view.component.menu;

import java.util.Map;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * 
 * @author rosc
 */
public interface MenuView {

	public JMenuBar getMenuBar();
	
	public Map<String, JMenuItem> getMenuItem();
}
