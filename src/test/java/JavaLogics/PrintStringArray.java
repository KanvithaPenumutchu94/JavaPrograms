package JavaLogics;

import java.util.Arrays;

public class PrintStringArray {

	public static void main(String[] args) {
		String s="TODO Auto-generated method stub";
		
		String str[]=s.split(" ");
		//printing string array
		System.out.println(Arrays.toString(str));
		
		//printing values in an array
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}

	}

}
