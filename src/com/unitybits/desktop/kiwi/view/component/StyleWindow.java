/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.view.component;

import com.unitybits.desktop.kiwi.view.component.field.FieldView;
import com.unitybits.desktop.kiwi.view.component.key.KeyView;

/**
 * 
 * @author rosc
 */
public class StyleWindow implements Window {
	
	private KeyView keyView;
	private FieldView fieldView;
	
	public StyleWindow(KeyView keyView, FieldView fieldView) {
		this.keyView = keyView;
		this.fieldView = fieldView;
	}
	@Override
	public FieldView createFieldView() {
		return fieldView;
	}

	@Override
	public KeyView createKeyView() {
		return keyView;
	}
}
