package JavaLogicalPrograms;

public class T9_Reverse_Of_String {

	public static void main(String[] args) {
		
		String s="ram";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}System.out.println(rev);
	}

}
