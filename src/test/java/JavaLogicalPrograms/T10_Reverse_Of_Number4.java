package JavaLogicalPrograms;

public class T10_Reverse_Of_Number4 {

	public static void main(String[] args) {
		
		int num=1234;
		
		int temp=num;
		int op=0;
		int rem=0;
		while(temp>0)
		{
			rem=temp%10;
			op=(op*10)+rem;
			temp=temp/10;
			
		}System.out.println(op);
	}

}
