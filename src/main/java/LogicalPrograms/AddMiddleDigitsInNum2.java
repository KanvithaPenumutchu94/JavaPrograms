package LogicalPrograms;

import java.util.ArrayList;
import java.util.List;

public class AddMiddleDigitsInNum2 {

	public static void main(String[] args) 
	{
		int num=123456;
		int sum=0;
		List<Integer> l1=new ArrayList<Integer>();
		
		while(num>0)
		{
			int rem=num%10;
			l1.add(rem);
			num=num/10;
			
		}
		System.out.println(l1);
		
		//size of the list
		System.out.println("Size= "+l1.size());
		
		//remove first value
		l1.remove(l1.size()-1);
		System.out.println(l1);
		
		//remove last value from list
		l1.remove(0);
		System.out.println(l1);
		
		
		 // Convert ArrayList to Array
        Integer[] array = l1.toArray(new Integer[0]);

        // Print the array
        for (Integer n : array) {
            System.out.println(n);
        }
        
        for(int i=0;i<=array.length-1;i++)
        {
           	sum=sum+array[i];
        }
        System.out.println("sum of all middle values= "+sum);
	}

}
