/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.util.math;

/**
 * 
 * @author rosc
 */
abstract class Engine {

	/** Exception if the expression is undefined! */
	protected static final String EXPRESSION_UNDEFINED = "Expression undefined!";

	/** Exception if the expression is divided by zero! */
	protected static final String DIVISION_BY_ZERO = "Division by zero undefined!";

	protected Engine() {
	}

	/**
	 * Define this method as the engine of the extended class.
	 * 
	 * @param expression
	 *            Expression of the content.
	 * @return Calculated result of the expression.
	 */
	public abstract String result(String expression);

	/**
	 * Clear the previous character of an expression.
	 * 
	 * @param content
	 *            Expression of the content.
	 * @param cursor
	 *            Cursor position of the content.
	 * @return Cleared previous character.
	 */
	public static String clearCharacter(String content, int cursor) {
		if (content.length() > 0) {
			final String clear = content.substring(0, cursor - 1)
					+ content.substring(cursor);

			return clear;
		} else {
			System.out.println("Expression is empty!");
			return "";
		}
	}

	/**
	 * Delete the whole string of an expression.
	 * 
	 * @param delete
	 *            Expression to delete.
	 * @return Empty string of the deleted expression.
	 */
	public static String deleteString(String delete) {
		return "";
	}

	public static int roundResult(double number) {
		return (int) Math.round(number);
	}

	public static double roundResult(double d, int decimal) {
		if (decimal < 1) {
			throw new IllegalArgumentException(
					"Decimal must be greater than 0!");
		}

		StringBuilder stringBuilder = new StringBuilder();
		for(int i = 0; i < decimal; i++){
			stringBuilder.append(0);
		}
		
		double part = Double.parseDouble("1" + stringBuilder.toString());
		
		return Math.round(d * (int) part) / part;
	}
}
