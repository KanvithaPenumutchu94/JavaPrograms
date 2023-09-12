package InterviewPrograms;

public class RemoveParticularCharFromString {

	public static void main(String[] args) {
		//Need to finish
		String s="CloudTech";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='c' || s.charAt(i)=='C')
			{
				s1=s.replace(s.charAt(i), ' ');
				
			}
		}System.out.println(s1);

	}

}
