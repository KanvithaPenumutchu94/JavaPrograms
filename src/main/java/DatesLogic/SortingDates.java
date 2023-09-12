package DatesLogic;

import java.util.ArrayList;
import java.util.Collections;

public class SortingDates {

	public static void main(String[] args)
	{ 
        ArrayList<String> datesList = new ArrayList<>();  
    
        datesList.add("2020-03-25");  
        datesList.add("2019-01-27");  
        datesList.add("2020-03-26");  
        datesList.add("2020-02-26");  
    
        System.out.println("Dates Object before sorting : ");  
      
        for (String dates : datesList)
        {  
        	System.out.println(dates);  
        }  
        /* Sorting the ArrayList using Collections.sort() method */  
        Collections.sort(datesList);  
      
        System.out.println("Dates Object after sorting : ");  
     
        for(String dates : datesList) 
        {  
        	System.out.println(dates);  
        }  

	}

}
