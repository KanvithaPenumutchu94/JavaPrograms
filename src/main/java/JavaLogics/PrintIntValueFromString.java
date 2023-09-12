package JavaLogics;

public class PrintIntValueFromString {

	public static void main(String[] args) 
	{
		String s="Test123";
		String output="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
				System.out.print(s.charAt(i));
			}
		}

	}

}
