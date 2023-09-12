
package JavaLogics;

import java.util.Arrays;

public class RemoveSpacesInString2 {

	public static void main(String[] args) {
		
		String s="India   is  my  country";
		String[] str=s.split("\\s+");//splits the string based on whitespace  
		for(String ss:str)
		{
			System.out.println(ss);
			
		}
		//System.out.println(Arrays.toString(str));
		
	}

}
