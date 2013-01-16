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
public final class StyleEvent {

	private String style;
	private String mode;
	
	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getMode() {
		return mode;
	}
	
	public void setMode(String mode) {
		this.mode = mode;
	}
	
	@Override
	public String toString() {
		return "StyleEvent [style=" + style + "]";
	}
}
