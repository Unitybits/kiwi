/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.model;

import com.unitybits.desktop.kiwi.model.factory.WindowModelFactory;
import com.unitybits.desktop.kiwi.util.enums.Mode;
import com.unitybits.desktop.kiwi.view.View;

/**
 * 
 * @author rosc
 */
public final class Data {

	private static final Data INSTANCE = new Data();
	
	private Model model;
	
	private Data() {
	}
	
	public static Data getInstance() {
		return INSTANCE;
	}
	
	public Model getModel(Mode mode, View view){
		model = WindowModelFactory.getInstance().getModel(mode); 
		model.setObserver(view);
		model.loadPreference();
		
		return model;
	}
	
	public void saveStyle(String mode, String style){
		model.saveStyle(mode, style);
	}

}
