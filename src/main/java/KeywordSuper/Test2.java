package KeywordSuper;

public class Test2 extends Test1 {
	String s="venki";
	void print()
	{
		System.out.println(s);
		System.out.println(super.s);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t=new Test2();
		t.print();
		
	}

}
