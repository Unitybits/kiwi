/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.controller;

import com.unitybits.desktop.kiwi.model.Data;
import com.unitybits.desktop.kiwi.model.Model;
import com.unitybits.desktop.kiwi.util.enums.Mode;
import com.unitybits.desktop.kiwi.view.View;

/**
 * 
 * @author rosc
 */
public final class Business {

	private static final Business instance = new Business();
	
	private View view;
	private Model model;
	private CalculationController controller;
	
	private Data data;
	
	private Business() {
		
	}
	
	public static Business getInstance() {
		return instance;
	}
	
	public Data getData() {
		return data;
	}
	
	public View getView() {
		return view;
	}
	
	public Model getModel() {
		return model;
	}
	
	public CalculationController getController() {
		return controller;
	}
	
	public void startBusiness(View view){
		this.view = view;
		
		data = Data.getInstance();
		
		controller = new CalculationController(this);
		model = data.getModel(Mode.CLASSIC, view);
		new MenuController(this);
		//controller.setButton();
		
	}
	
	@Override
	public String toString() {
		return "Business [view=" + view + "]";
	}
}
