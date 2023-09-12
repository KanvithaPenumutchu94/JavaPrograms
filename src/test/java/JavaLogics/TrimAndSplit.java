package JavaLogics;

import java.util.Arrays;

public class TrimAndSplit {

	public static void main(String[] args) {

		String s=" India is my country";
		String str[]=s.trim().split(" ");
		System.out.println(Arrays.toString(str));
		for(String str1:str)
		{
			System.out.println(str1);
		}
	}

}
