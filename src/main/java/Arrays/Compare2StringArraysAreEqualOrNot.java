package Arrays;

import java.util.Arrays;

public class Compare2StringArraysAreEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"ram","thanvish"};
		String[] s1= {"ram","thanvish","kota"};
		int count=0;
		//System.out.println(Arrays.toString(s));
		
		if(s.length==s1.length)
		{
			for(int i=0;i<s.length;i++)
			{
				String str=s[i];
				//System.out.println(str);
				for(int j=0;j<s1.length;j++)
				{
					String str1=s1[j];
					if(str.equals(str1))
					{
						count++;
					}

				}
			}
		}
		if(count==s.length)
		{
			System.out.println("arrays are equal");
		}
		else {
			System.out.println("arrays are not equal");
		}
		
	}

}
