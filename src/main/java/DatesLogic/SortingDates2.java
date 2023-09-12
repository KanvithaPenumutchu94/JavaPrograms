package DatesLogic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortingDates2 {

	public static void main(String[] args)
	{ 
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Dates");
       String alldates=sc.nextLine();
       String[] dates=alldates.split(" "); //1/02/1994 11/10/1994 31/11/1995  (day/month/year)
       List<String> al=new ArrayList<String>();
    
       List<Integer> dayal=new ArrayList<Integer>();
       List<Integer> monthal=new ArrayList<Integer>();
       List<Integer> yearal=new ArrayList<Integer>();
       
       
       for(String date:dates)
       {
    	   al.add(date);
    	   System.out.println(date);
       }
       System.out.println(al);
       
       System.out.println("Total no of dates: "+(al.size()));
       
       for(int i=0;i<al.size();i++)
       {
    	   String date=al.get(i);
    	  // System.out.println(date);
    	   String[] datesplittings=date.split("/");
    	   //System.out.println(datesplittings.length);
    	   for(int j=datesplittings.length-1;j>=0;j--)
    	   {
    		   if(j==datesplittings.length-1)
    		   {
    		      String yearinstring=datesplittings[j];
    		      int year=Integer.parseInt(yearinstring);
    		      yearal.add(year);
    		   }
    		   else if(j==datesplittings.length-2)
    		   {
    			   String monthinstring=datesplittings[j];
    			   int month=Integer.parseInt(monthinstring);
    			   monthal.add(month);
    		   }
    		   else
    		   {
    			   String dayinstring=datesplittings[j];
    			   int day=Integer.parseInt(dayinstring);
    			   dayal.add(day);
    		   }
    			   
    	   }
    	}System.out.println("Years are: "+yearal);
    	System.out.println("Month are: "+monthal);
    	System.out.println("Days are: "+dayal);
    	
    	for(int k=0;k<yearal.size()-1;k++)
    	{
    		int year=yearal.get(0);
    		if(year<yearal.get(k+1))
    		{
    			year=yearal.get(k+1);
    		}
    		System.out.println(al.get(year));
    	}
    	
	}

}
