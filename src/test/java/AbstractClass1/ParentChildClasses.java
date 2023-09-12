package AbstractClass1;

public abstract class ParentChildClasses {
//Abstract class can contain constructors
//Abstract class can contain instance variable which are initialization 
//+when we create object to child class automatically Abstract class (parent class) constructor exucated
//The variables that are declared inside the class but outside the scope of any method are called instance variables
//No one is allowed to create object for abstract class
	
	int age;
	String name;
	//constructor
	ParentChildClasses(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
}	
class Child extends ParentChildClasses{
	
	int rollno;
	Child(int rollno,int age,String name)
	{
		super(age,name);
		this.rollno=rollno;
	}
}


	


