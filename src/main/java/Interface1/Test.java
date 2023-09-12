package Interface1;

public class Test implements CarStart,CarStop
{
	public void start()
	{
		System.out.println("start");
	}
	public void stop()
	{
		System.out.println("stop");
	}
	

	public static void main(String[] args) {
		Test t=new Test();
		t.start();
		t.stop();

	}

}
