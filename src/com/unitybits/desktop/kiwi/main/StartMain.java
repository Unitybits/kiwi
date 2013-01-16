/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.main;

import com.unitybits.desktop.kiwi.controller.Business;
import com.unitybits.desktop.kiwi.text.MenuValue;
import com.unitybits.desktop.kiwi.view.StoreView;

/**
 * Specific start main singleton to set particular content.
 * @author rosc
 */
final class StartMain extends Main {

	/** Get StartMain instance. */
	private static final StartMain instance = new StartMain();
	
	/**
	 * Private constructor.
	 */
	private StartMain() {
	}
	
	/**
	 * Class instance of StartMain.
	 * @return Object of StartMain.
	 */
	public static StartMain getInstance() {
		return instance;
	}

	@Override
	protected void startMain() {
		if (MenuValue.MENUS.length != (MenuValue.MODES.length + MenuValue.STYLES.length)) {
			throw new IllegalArgumentException(
					"Menus length is not equal to Modes and Styles");
		}
		Business.getInstance().startBusiness(new StoreView());

	}
}
