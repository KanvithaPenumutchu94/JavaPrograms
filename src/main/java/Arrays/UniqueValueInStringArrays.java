package Arrays;

import java.util.ArrayList;
import java.util.List;

public class UniqueValueInStringArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1[]= {"Ram","Kanni"};
		String s2[]= {"Venki","Kanni"};
		List<String> l=new ArrayList<String>();
				
		for(int i=0;i<s1.length;i++)
		{
			int count=0;
			String str1=s1[i];
			for(int j=0;j<s2.length;j++)
			{
				String str2=s2[j];
				if(!str1.equals(str2))
				{
					count++;
				}
				if(count==s2.length)
				{
					l.add(str1);
				}
			}
		}
		
		for(int k=0;k<s2.length;k++)
		{
			int count=0;
			String str2=s2[k];
			for(int m=0;m<s1.length;m++)
			{
				String str1=s1[m];
				if(!str2.equals(str1))
				{
					count++;
				}
				if(count==s2.length)
				{
					l.add(str2);
				}
			}
		}System.out.println(l);
		
		
		
			
		

	}

}
