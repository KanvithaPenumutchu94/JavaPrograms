package InterviewPrograms;

public class PrimeNo1to100 {

	public static void main(String[] args) {
		
		int a=5;
		int flag=0;
		
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				flag=1;
				break;
			}
		}if(flag==0) 
		{
			System.out.println("prime no");
		}else {
			System.out.println("not a prime no");
	}
		
		
	}

}
