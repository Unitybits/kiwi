/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.model.factory;

import com.unitybits.desktop.kiwi.model.CalculationModel;
import com.unitybits.desktop.kiwi.model.Model;
import com.unitybits.desktop.kiwi.util.Log;
import com.unitybits.desktop.kiwi.util.enums.Mode;

/**
 * 
 * @author rosc
 */
public final class WindowModelFactory extends ModelFactory{
	
	/** Eager Load of the Singleton to stay atomic. */
	private static final WindowModelFactory instance = new WindowModelFactory();
	
	private WindowModelFactory() {
	}
	
	public static WindowModelFactory getInstance() {
		return instance;
	}
	
	@Override
	protected Model createModel(Mode mode) {
		if(mode == Mode.CLASSIC){
			return new CalculationModel();
		}else{
			Log.LOG.warn("Model is not responsible!");
		}
		
		return null;
	}

}
