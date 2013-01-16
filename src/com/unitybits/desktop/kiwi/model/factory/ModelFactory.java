/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.model.factory;

import com.unitybits.desktop.kiwi.model.Model;
import com.unitybits.desktop.kiwi.util.enums.Mode;

/**
 * 
 * @author rosc
 */
abstract class ModelFactory {

	public Model getModel(Mode mode){
		return createModel(mode);
	}
	
	protected abstract Model createModel(Mode mode);
	
}
