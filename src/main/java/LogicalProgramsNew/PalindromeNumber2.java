package LogicalProgramsNew;

public class PalindromeNumber2 {

	public static void main(String[] args)
	{
		int num=1221;
		int num1=0;
		String s1="";
		int compare=num;
		
		while(num!=0)
		{
			num1=num%10; 
			s1+=num1+"";
			
			num=num/10;
			
		}System.out.println("reverse number is: "+s1);
		
		String s2=compare+"";
		
		if(s1.equals(s2))
		{
			System.out.println("PalindromeNumber");
		}
		else
		{
			System.out.println("not a PalindromeNumber");
		}
		
		
		
		
		
		
	}

}
