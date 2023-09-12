package Arrays;

public class ReverseOfStringArray {

	public static void main(String[] args)
	{
        String s[]= {"ram","kota"};
		
		for(int i=0;i<s.length;i++)
		{
			String rev="";
			//System.out.println(s[i]);
			String str=s[i];
			for(int j=str.length()-1;j>=0;j--)
			{
				rev+=str.charAt(j);
			}System.out.println(rev);
		}	
		
	}

}
