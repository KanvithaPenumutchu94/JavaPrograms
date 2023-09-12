package ExceptionHandling;

public class Test1 {
	
	int m1()
	{
		int y=10;
		try {
			int x=10/0;
			System.out.println("executing try block code");
			
			//System.out.println(y);
			//return 15;
			}
			
			catch(ArithmeticException e) {
				//y=8;
				System.out.println("executing catch block code");
				//System.out.println(y);
				//return 8;
			}
			
			finally {
				//y=5;
				System.out.println("close the browser");
				
				//System.out.println(y);
				//return 5;
			}
		System.out.println(y);
		return y;
	}
public static void main(String[] args) {
	
	//try,catch,finally,throw and throws
	
	//either executes try or catch anyone only.
	
	System.out.println("Before executing error code");
	Test1 t=new Test1();
	t.m1();
	  }
}
