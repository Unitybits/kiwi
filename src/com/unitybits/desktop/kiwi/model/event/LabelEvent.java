/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.model.event;

/**
 * 
 * @author rosc
 */
public final class LabelEvent {
	
	private String label;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "LabelEvent [label=" + label + "]";
	}
}
