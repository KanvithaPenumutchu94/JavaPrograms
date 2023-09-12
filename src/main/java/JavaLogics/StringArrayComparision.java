package JavaLogics;

public class StringArrayComparision
{
	
	public static void strComparision(String[] str1,String[] str2)
	{
		int count=0;
		if(str1.length==str2.length)
		{
			for(int i=0;i<str1.length;i++)
			{
				if(str1[i]==str2[i])
				{
					count++;
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
		String[] str1= {"Venki","Kanni"};
		String[] str2= {"Kanni","Venki"};
		
		strComparision(str1,str2);

	}

}
