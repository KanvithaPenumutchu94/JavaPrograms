package JavaLogics;

public class Triveni {

	public static void main(String[] args) {
		
		
		String s="kanni venki";
		String str[]=s.split(" ");
		String output="";
		
		for(int i=0;i<str.length;i++)
		{
			String rev=str[i];
			System.out.println(rev);
			for(int j=rev.length()-1;j>=0;j--)
			{
				char ch=s.charAt(j);
				output+=ch;
				
			}System.out.println(output);
		}
		

	}

}
