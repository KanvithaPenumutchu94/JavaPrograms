package Arrays;

public class CommonValueInStringArrays {

	public static void main(String[] args)
	{
		String s1[]= {"Venki","Kanni"};
		String s2[]= {"Venki","Kanni"};
		
		for(int i=0;i<s1.length;i++)
		{
			String str1=s1[i];
			for(int j=0;j<s2.length;j++)
			{
				String str2=s2[j];
				if(str1.equals(str2))
				{
					System.out.println(str1);
				}
			}
		}
	}

}
