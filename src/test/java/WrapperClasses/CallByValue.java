package WrapperClasses;

public class CallByValue {
	
	public int testSum(int a,int b)
	{
		a=30;
		b=30;
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		
		CallByValue callByValue=new  CallByValue();
		int x=10;
		int y=20;
		callByValue.testSum(x, y); //call by value/pass by value
		System.out.println(x+y);
	}
	
	

}
