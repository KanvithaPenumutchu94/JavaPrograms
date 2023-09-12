package SingletonClass;

public class SingletonClassEx1 {

	
	int x,y;
	String s1,s2;
	//private constructor method
	private SingletonClassEx1()
	{
		x=5;
		y=55;
		s1="ram";
		s2="kota";
	}
	//use public operational method as static
	//create and return object to SingletonClassEx1
	public static SingletonClassEx1 createObject()
	{
		SingletonClassEx1 obj=new SingletonClassEx1();
		return obj;
	}
	
	public static class Test
	{
		public static void main(String[] args) {
			
			SingletonClassEx1 obj=SingletonClassEx1.createObject();
			System.out.println(obj.x+obj.y+obj.s1+obj.s2);
			
		}
	}

	
}

