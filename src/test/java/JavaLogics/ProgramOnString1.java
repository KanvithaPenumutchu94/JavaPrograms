package JavaLogics;

public class ProgramOnString1 {

	public static void main(String[] args) {
		
		//input=We Love India
		//output=W L India
		String str="We Love India";
		String s[]=str.split(" ");
		int len=s.length;
		System.out.println(len);
		
		for(int i=0;i<s.length;i++)
		{
			if(i==0 || i==1)
			{
				String s1=s[i];
				System.out.print(s1.substring(0,1)+" ");
			
			}
			else
			{
				System.out.print(s[i]);
			}
			
		}

	}

}
