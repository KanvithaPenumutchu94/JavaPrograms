package DynamicBinding;

public class DynamicBinding {

	public static void main(String[] args) 
	{
		Person p=new Teacher();
		p.speak();
	
		Person p1=new Person();
		p1.speak();
		
		
		Teacher t=new Teacher();
		t.speak();
		
		
		
		

	}

}
