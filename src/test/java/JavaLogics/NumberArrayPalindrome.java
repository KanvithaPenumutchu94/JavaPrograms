package JavaLogics;

public class NumberArrayPalindrome {

	public static void main(String[] args) {
		
		int num[]= {10101,1234,12321};
		
		for(int i=0;i<num.length;i++)
		{
			int no=num[i];
			int temp=no;
			int sum=0,r;
			
			while(no>0)
			{
				r=no%10;
				sum=(sum*10)+r;
				no=no/10;
			}
			if(sum==temp)
			{
				System.out.println(temp+"  Given num is palindrome");
			}
			else {
				System.out.println(temp+"  Given num is not palindrome");
			}

		}

	}

}
