package SingletonClass;

public class SingletonClassEx2 {

	
	int x,y;
	String s1,s2;
	//private constructor method
	private SingletonClassEx2(int a,int b)
	{
		x=a;
		y=b;
		s1="ram";
		s2="kota";
	}
	//use public operational method as static
	//create and return object to SingletonClassEx1
	public static SingletonClassEx2 createObject(int a,int b)
	{
		SingletonClassEx2 obj=new SingletonClassEx2(a,b);
		return obj;
	}
	
	public static class Test
	{
		public static void main(String[] args) {
			
			SingletonClassEx2 obj=SingletonClassEx2.createObject(5,55);
			System.out.println(obj.x+obj.y+obj.s1+obj.s2);
			
			SingletonClassEx2 obj1=SingletonClassEx2.createObject(5,5);
			System.out.println(obj.x+obj.y+obj.s1+obj.s2);
			
		}
	}

	
}

