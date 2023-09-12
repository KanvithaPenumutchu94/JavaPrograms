package OverLoading;

public class Test
{
	public void m1(float i,int j)
	{
		System.out.println("int arg");
	}
	public void m1(int d,float r)
	{
		System.out.println("float arg");
	}
	
	public static void main(String[] args)
	{
		Test t=new Test();
		t.m1(5f,10);
		t.m1(10,7f);
		//t.m1('a');
		//t.m1(10l);
	}

}
