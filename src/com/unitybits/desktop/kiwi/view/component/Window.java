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
public interface Window {

	public FieldView createFieldView();
	
	public KeyView createKeyView();
	
}
