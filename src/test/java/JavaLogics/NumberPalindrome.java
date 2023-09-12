package JavaLogics;

public class NumberPalindrome {

	public static void main(String[] args) {
		
	int num=12321;
	int temp=num;
	int sum=0;
	int r;
	
	while(num>0)
	{
		r=num%10;
		sum=(sum*10)+r;
		num=num/10;
			
	}if(sum==temp)
	{
		System.out.println("Given num is palindrome");
	}
	else {
		System.out.println("Given num is not palindrome");
	}

	}

}
