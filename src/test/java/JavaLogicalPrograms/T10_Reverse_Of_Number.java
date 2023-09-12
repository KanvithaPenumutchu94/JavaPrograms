package JavaLogicalPrograms;

public class T10_Reverse_Of_Number {

	public static void main(String[] args) {
		
		int num=1234;
		
		String n=1234+"";
		String rev="";
		
		for(int i=n.length()-1;i>=0;i--)
		{
			rev+=n.charAt(i);
		}System.out.println(rev);
	}

}
