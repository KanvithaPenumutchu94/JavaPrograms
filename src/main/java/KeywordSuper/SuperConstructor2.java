package KeywordSuper;

public class SuperConstructor2 extends SuperConstructor {
	float salary;

	SuperConstructor2(int id, String name,float salary) {
		super(id, name);
		this.salary=salary;
		System.out.println(id+name+salary);
		
	}
	public static void main(String[] args)
	{
		SuperConstructor2 n=new SuperConstructor2(5,"kanni",58.00f);
		
	}
	

	
}
