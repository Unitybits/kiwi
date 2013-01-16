/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.util;

import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.JPanel;

/**
 * 
 * @author rosc
 */
public class PrintDialog{

	private static final long serialVersionUID = 1L;
	
	private static PrintDialog instance = null;
	
	private PrintDialog() {
		
	}
	
	public static synchronized PrintDialog getInstance() {
		if(instance == null){
			instance = new PrintDialog();
		}
		return instance;
	}
	
	public void print(final String text){
		PrinterJob printJob = PrinterJob.getPrinterJob();
		printJob.setJobName("Print expression!");
		printJob.setCopies(1);
		printJob.setPrintable(new Printable() {
			
			@Override
			public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)
					throws PrinterException {
				if(pageIndex > 0){
					return Printable.NO_SUCH_PAGE;
				}
				graphics.drawString(text, 70, 70);
				
				return Printable.PAGE_EXISTS;
			}
		});
		
		if(printJob.printDialog() == false){
			return;
		}
		
		try {
			printJob.print();
			Log.LOG.info("Print page!");
		} catch (PrinterException e) {
			e.printStackTrace();
		}
	}
}
