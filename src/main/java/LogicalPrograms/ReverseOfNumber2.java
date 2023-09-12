package LogicalPrograms;

import java.util.ArrayList;
import java.util.List;

public class ReverseOfNumber2 {

	public static void main(String[] args) 
	{
		int number=1234;
		int remainder;
		int reverse=0;
		while(number != 0)   
		{  
		remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		 
	}  
}
