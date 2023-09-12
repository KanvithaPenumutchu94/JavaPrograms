package InterviewPrograms;

public class CountNoOfDigits {

	public static void main(String[] args) {
		
		/*int i=12345;
		
		String s=Integer.toString(i);
		System.out.println(s.length());*/
		
		int i=12345657;
		int count=0;
		
		while(i>0)
		{
			
			i=i/10;
			count++;
		}System.out.println(count);

	}

}
