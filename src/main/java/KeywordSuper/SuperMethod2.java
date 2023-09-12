package KeywordSuper;

public class SuperMethod2 extends SuperMethod1 {
	void eat()
	{
		System.out.println("eat");
	}
	void bark()
	{
		System.out.println("bark");
	}
	void call()
	{
		super.eat();
		eat();
		
	}
	public static void main(String[] args)
	{
		SuperMethod2 sm=new SuperMethod2();
		sm.call();
	}

}
