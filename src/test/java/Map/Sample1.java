package Map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Sample1 {
	public static void main(String[] args) {
		
		String s="aHHHbYY";
		
		for(int i=0;i<s.length();i++)
		{
			
				if(!(s.charAt(i)==s.charAt(i+1)))
				{
					System.out.println(s.charAt(i));
				}
				else if(s.charAt(i)==s.charAt(i+1))
				{
					System.out.print(s.charAt(i));
				}
			
		}
	}

}
