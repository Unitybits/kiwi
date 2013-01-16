/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.text;

/**
 * 
 * @author rosc
 */
public final class MenuValue {

	private MenuValue() {
	}
	
	public static final String UNITYBITS_LOGO = "img/unitybits_logo.png";
	
	public static final String PRINT = "Print";
	public static final String PREFERENCES = "Preferences";
	public static final String WINDOW = "Window";
	public static final String EXIT = "Exit";
	public static final String MODE_CLASSIC = "Classic";
	public static final String MODE_PROF = "Professional";
	public static final String STYLE_APPIKWHITE = "White";
	public static final String STYLE_APPIKBLACK = "Black";
	public static final String STYLE_APPIKORANGE = "Orange";
	public static final String ABOUT = "About";
	
	public static final String[] MODES = new String[] { MODE_CLASSIC, MODE_PROF };

	public static final String[] STYLES = new String[] { STYLE_APPIKWHITE,
		STYLE_APPIKBLACK, STYLE_APPIKORANGE};

	public static final String[] MENUS = new String[] { STYLE_APPIKWHITE,
			STYLE_APPIKBLACK, STYLE_APPIKORANGE, MODE_CLASSIC, MODE_PROF };

}
