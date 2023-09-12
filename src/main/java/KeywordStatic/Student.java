package KeywordStatic;

public class Student {
	int rollno;
	String name;
	public  static String college="ciet";
	
	//static method to change the value of static variable
	public static void change()
	{
		college="chalapathi";
		System.out.println(college);
		
	}
	
	//constructor to initialize the variable
	public Student(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno);
		System.out.println(name);
	}

}
