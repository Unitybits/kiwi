/**
 * Unitybits. All rights reserved.
 * 
 * www.unitybits.com
 */

package com.unitybits.desktop.kiwi.util.math;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 
 * @author rosc
 */
public class MathEngine extends Engine{

	private static final ScriptEngineManager manager = new ScriptEngineManager();
	private static final MathEngine INSTANCE = new MathEngine();
	
	private MathEngine() {
	}
	
	public static MathEngine getInstance() {
		return INSTANCE;
	}
	
	@Override
	public String result(String expression){
		ScriptEngine engine = manager.getEngineByName("js");
	
		try {
			Object result = engine.eval(expression);
			if ("Infinity".equals(result.toString())) {
				throw new IllegalArgumentException();
			}
			return result.toString();
		} catch (ScriptException e) {
			e.printStackTrace();
			return EXPRESSION_UNDEFINED;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			return DIVISION_BY_ZERO;
		}
	}
}
