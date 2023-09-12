package LogicalPrograms;

public class ReverseStringArray2 {

	public static void main(String[] args) 
	{
		String s[]= {"ram","kota"};
		String s1="";
		String rev="";
		for(String l:s)
		{
			s1+=l;
		}
		System.out.println(s1);
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev+=s1.charAt(i);
		}System.out.println(rev);
		
		
	}

}
