package JavaLogics;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesInStringArray2 {

	public static void main(String[] args) {
		//This logic is applicable for two duplicates are present	
		String s[]= {"ram","ram","sita","sita","kanni","kanni","venki"};
		
		Set<String> hs=new HashSet<String>();
		
		for(String ss:s)
		{
			if(hs.add(ss)==false)
			{
				System.out.println(ss);
				
			}
		}
		
	}

}
