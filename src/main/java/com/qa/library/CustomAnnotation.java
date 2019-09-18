/**
 * 
 */
package com.qa.library;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author Dheerendra Pal (expleo)
 *
 */

@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD, 
	java.lang.annotation.ElementType.TYPE, 
	java.lang.annotation.ElementType.CONSTRUCTOR})
public @interface CustomAnnotation {

	public String webAction() default "";
	public String mobileAction() default "";
	
	
}
