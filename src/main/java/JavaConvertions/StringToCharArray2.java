package JavaConvertions;

import java.util.Arrays;

public class StringToCharArray2 {

	public static void main(String[] args) 
	{
		String str="KANNIRAMVENKI";
		char charArray[] = str.toCharArray();
	    Arrays.sort(charArray);
	    //System.out.println(new String(charArray));
	    System.out.println(charArray);
	}

}
