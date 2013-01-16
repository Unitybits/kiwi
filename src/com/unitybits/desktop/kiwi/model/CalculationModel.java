/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.prefs.Preferences;

import com.unitybits.desktop.kiwi.model.event.LabelEvent;
import com.unitybits.desktop.kiwi.model.event.StyleEvent;
import com.unitybits.desktop.kiwi.util.math.MathEngine;


import static com.unitybits.desktop.kiwi.text.MenuValue.*;

/**
 * 
 * @author rosc
 */
public class CalculationModel extends Observable implements Model {

	private Preferences preference;
	
	private LabelEvent labelEvent;
	private StyleEvent styleEvent;
	
	private final Map<String, Boolean> menus = new HashMap<String, Boolean>();
	
	public CalculationModel() {
		preference = Preferences.userRoot().node("kiwi");
	
		styleEvent = new StyleEvent();
		labelEvent = new LabelEvent();
	}

	@Override
	public void setObserver(Observer observer) {
		addObserver(observer);
	}

	@Override
	public void calculateExpression(String expression) {
		labelEvent.setLabel(MathEngine.getInstance().result(expression));
		setChanged();
		notifyObservers(labelEvent);
	}

	@Override
	public void saveStyle(String mode, String style) {
		Map<String, Boolean> styles = new HashMap<String, Boolean>();
		
		for (String menu : MENUS) {
			styles.put(menu, false);
			
			if(menu.equals(style)){
				styles.put(menu, true);
			}
			if(menu.equals(mode)){
				styleEvent.setMode(menu);
			}
			
			preference.putBoolean(menu, styles.get(menu));
		}
		
		
		if(style != null){
			styleEvent.setStyle(style);
		}
		if(mode != null){
			styleEvent.setMode(mode);
		}
		
		setChanged();
		notifyObservers(styleEvent);
	}
	
	@Override
	public void loadPreference() {
		for(String menu: STYLES){
			boolean checked = false;
			
			if(STYLE_APPIKWHITE.equals(menu)){
				checked = true;
			}
			
			if(preference.getBoolean(menu, checked)){
				styleEvent.setStyle(menu);
			}
		}
		
		for(String menu: MODES){
			boolean checked = false;
			
			if(MODE_CLASSIC.equals(menu)){
				checked = true;
			}
			
			if(preference.getBoolean(menu, checked)){
				styleEvent.setMode(menu);
			}
		}
		
		if(styleEvent.getMode() == null){
			styleEvent.setMode(MODE_CLASSIC);
		}
		
		setChanged();
		notifyObservers(styleEvent);
		
	}
	
	@Override
	public Map<String, Boolean> getMenus() {
		for(String menu: MENUS){
			boolean checked = false;
			
			if(STYLE_APPIKWHITE.equals(menu)){
				checked = true;
			}
		
			menus.put(menu, preference.getBoolean(menu, checked));
		}
		return menus;
	}
}
