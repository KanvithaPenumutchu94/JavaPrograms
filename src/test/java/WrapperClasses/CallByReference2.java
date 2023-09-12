package WrapperClasses;

public class CallByReference2 {
	

	int x;
	public static void main(String[] args) {
		
		CallByReference2 callByReference2=new CallByReference2();
		callByReference2.x=12;
		test(callByReference2);
		System.out.println(callByReference2.x);
		
	}
	
	public static void test(CallByReference2 xCopy)
	{
		xCopy.x=50;
	}

}
