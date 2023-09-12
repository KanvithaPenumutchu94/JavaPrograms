package KeywordStatic;

public class Test12 {
	
	int x=2;
	public void f1()
	{
		System.out.println("hkg");
	}
	public static void f2()
	{
		Test12 t=new Test12();
		t.x=5;
		t.f1();
	}

	public static void main(String[] args) {
		


	}

}
