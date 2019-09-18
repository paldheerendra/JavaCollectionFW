/**
 * 
 */
package com.qa.library;

import java.lang.reflect.Method;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class POJO {
	
	Method method;
	Class<?> cls;
	
	public Method getMethod() {
		return method;
	}
	
	public void setMethod(Method method) {
		this.method = method;
	}
	
	public Class<?> getCls() {
		return cls;
	}
	
	public void setCls(Class<?> cls) {
		this.cls = cls;
	}
	
	

}
