package JavaLogics;

public class StringArrayComparision2
{
	
	public static void strComparision(String[] str1,String[] str2)
	{
		int count=0;
		if(str1.length==str2.length)
		{
			for(int i=0;i<str1.length;i++)
			{
				String s1=str1[i];
				for(int j=0;j<str2.length;j++)
				{
					String s2=str2[j];
					if(s1.equals(s2))
					{
						count++;
					}
				}
			}if(count==str1.length)
			{
				System.out.println("Arrays are equal");
			}
			else {
				System.out.println("Arrays are not equal");
			}
		}else {System.out.println("Arrays sizes are not equal");}
		
	}

	public static void main(String[] args) 
	{
		String[] str1= {"Kanni","Venki"};
		String[] str2= {"Venki","Kanni","Ram"};
		
		strComparision(str1,str2);

	}
		
}
