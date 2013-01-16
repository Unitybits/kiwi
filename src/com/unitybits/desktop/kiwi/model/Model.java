/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.model;

import java.util.Map;
import java.util.Observer;

/**
 * 
 * @author rosc
 */
public interface Model {

	public void setObserver(Observer observer);
	
	public void calculateExpression(String expression);
	
	public void saveStyle(String mode, String style);
	
	public void loadPreference();
	
	public Map<String, Boolean> getMenus();
	
}
