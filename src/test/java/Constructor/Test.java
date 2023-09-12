package Constructor;

public class Test {
	
	int x;
	int y;
	String name;
	
	private Test()
	{
		x=10;
		y=20;
		name="ram";
	}
	
	public static Test createObject()
	{
		Test t=new Test();
		return(t);
	}

	
}
