/**
 * 
 */
package com.qa.utils.webTables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class CompareTwoTables {

	public static void main(String args[]) {
				
		    Map<String,EmpDetails> table1=new HashMap<String,EmpDetails>();
		    Map<String,EmpDetails> table2=new HashMap<String,EmpDetails>();

		    table1.put("123",new EmpDetails("John", "30", "Ops"));
		  
		    table2.put("123",new EmpDetails("John", "30", "Ops"));
		
		    table1.put("127",new EmpDetails("Amy", "30", "Ops"));
		    
		    table2.put("127",new EmpDetails("Rachel", "30", "Ops"));

		    List<String> match = new ArrayList<String>();
		    List<String> diff = new ArrayList<String>();

		    for(String empIdTable1:table1.keySet())
		    {
		        EmpDetails tempemp1;
		        EmpDetails tempemp2;
		        for(String empIdTable2:table2.keySet())
		        {
		            if(empIdTable1.equalsIgnoreCase(empIdTable2))
		            {
		                tempemp1=table1.get(empIdTable1);
		                tempemp2=table2.get(empIdTable2);
		                if(tempemp1.equals(tempemp2))
		                {
		                    match.add(empIdTable1);
		                    break;
		                }else{
		                    diff.add(empIdTable1);
		                }
		            }
		        }

		    }
		    System.out.println(" Match :"+match);
		    System.out.println(" diffn :"+diff);

			
	}
		
	
}
