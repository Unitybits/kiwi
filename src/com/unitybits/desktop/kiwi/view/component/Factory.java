/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.view.component;

/**
 * 
 * @author rosc
 */
public abstract class Factory {

	public Window getWindowFactory(String mode, String style) {
		return createWindowFactory(mode, style);
	}

	protected abstract Window createWindowFactory(String mode, String style);

}
