/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.view.component;

import static com.unitybits.desktop.kiwi.text.MenuValue.*;

import com.unitybits.desktop.kiwi.util.Log;
import com.unitybits.desktop.kiwi.view.component.field.AppikOrangeField;
import com.unitybits.desktop.kiwi.view.component.field.WindowFieldView;
import com.unitybits.desktop.kiwi.view.component.key.KeyView;
import com.unitybits.desktop.kiwi.view.component.key.mode.ClassicModeKeyView;
import com.unitybits.desktop.kiwi.view.component.key.mode.ProfModeKeyView;
import com.unitybits.desktop.kiwi.view.component.key.style.BlackStyleKeyView;
import com.unitybits.desktop.kiwi.view.component.key.style.OrangeStyleKeyView;
import com.unitybits.desktop.kiwi.view.component.key.style.WhiteStyleKeyView;

/**
 * 
 * @author rosc
 */
public class StyleFactory extends Factory {

	private static final StyleFactory INSTANCE = new StyleFactory();

	private StyleFactory() {
	}

	public static StyleFactory getInstance() {
		return INSTANCE;
	}

	@Override
	protected Window createWindowFactory(String mode, String style) {
		KeyView keyView = null;

		if (MODE_CLASSIC.equals(mode)) {
			keyView = new ClassicModeKeyView();
		} else if (MODE_PROF.equals(mode)) {
			keyView = new ProfModeKeyView();
		}

		if (STYLE_APPIKWHITE.equals(style)) {
			return new StyleWindow(new WhiteStyleKeyView(keyView),
					new WindowFieldView());
		} else if (STYLE_APPIKBLACK.equals(style)) {
			return new StyleWindow(new BlackStyleKeyView(keyView),
					new WindowFieldView());
		} else if (STYLE_APPIKORANGE.equals(style)) {
			return new StyleWindow(new OrangeStyleKeyView(keyView),
					new AppikOrangeField());
		} else {
			Log.LOG.warn("No WindowFactory created. ModeStyle is false!");
		}

		return null;
	}

}
