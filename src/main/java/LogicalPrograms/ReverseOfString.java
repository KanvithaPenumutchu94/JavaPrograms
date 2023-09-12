package LogicalPrograms;

public class ReverseOfString {

	public static void main(String[] args) 
	{
		String s="ram";
		String rev="";
		//int len=s.length();
		//System.out.println(len);	
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		System.out.print(rev);		

	}

}
