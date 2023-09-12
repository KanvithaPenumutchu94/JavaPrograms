package JavaLogics;

public class Test55 {

	public static void main(String[] args) {
		
		String s="kanvitha";
		String revstr="";
		
		for(int i=s.length()-1;i<=0;i--)
		{
			char ch=s.charAt(i);
			revstr=revstr+ch;
		}System.out.println(revstr);

	}

}
