/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.view.component.key.style;

import com.unitybits.desktop.kiwi.view.component.key.KeyView;

/**
 * 
 * @author rosc
 */
abstract class StyleKeyView implements KeyView {

	private KeyView keyView;
	
	public StyleKeyView(KeyView keyView) {
		this.keyView = keyView;
	}

	protected KeyView getKeyView() {
		return keyView;
	}

}
