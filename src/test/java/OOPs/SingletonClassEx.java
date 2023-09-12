package OOPs;

public class SingletonClassEx {
	
	public int x;
	
	//Singleton class has private constructor method as mandatory.
	private SingletonClassEx()
	{
		x=5;
	}
	
	public static SingletonClassEx create()
	{
		SingletonClassEx classEx=new SingletonClassEx();
		return(classEx);
	}
	
	public void display()
	{
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		SingletonClassEx obj=SingletonClassEx.create(); //create obj to call static method using class name
		obj.x=20;
		obj.display();
	}

}
