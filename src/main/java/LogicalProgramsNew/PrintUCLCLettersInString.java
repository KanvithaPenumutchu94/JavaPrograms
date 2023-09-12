package LogicalProgramsNew;


public class PrintUCLCLettersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ram";
		String uc="";
		String lc="";
		
		
		
		for(int i=0;i<s.length();i++)
		{
			//char ch=s.charAt(i);
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				lc+=s.charAt(i);
			}
			else if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				uc+=s.charAt(i);
			}
		}System.out.println("Lower case letters are: "+lc);
		System.out.println("Upper case letters are: "  +uc);
	}

}
