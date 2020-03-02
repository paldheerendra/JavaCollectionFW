
package com.qa.utils.webTables;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class EmpDetails {
	
	 private String name;
	  private String age;
	   private String dept;
	   public EmpDetails(String name, String age, String dept) {
	    //super();
	    this.name = name;
	    this.age = age;
	    this.dept = dept;
	   }

	@Override
	public boolean equals(Object obj) {
	    
	    Boolean response=false;
	    if(obj!=null && obj instanceof EmpDetails)
	    {
	        EmpDetails objParam=(EmpDetails)obj;

	        if(objParam.name.equalsIgnoreCase(this.name) && objParam.age.equalsIgnoreCase(this.age) && objParam.dept.equalsIgnoreCase(this.dept))
	        {
	            response=true;
	        }
	    }
	    return response;
	  }

}
