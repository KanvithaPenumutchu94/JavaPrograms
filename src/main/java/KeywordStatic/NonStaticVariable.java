package KeywordStatic;

public class NonStaticVariable {
	
//Static method can not use non static data member or call non static method directly
//this & super can't be used in static context
	
	int a=5; //non static
	int x;
	 static void method(int x)
	 {
		this.x=x;
	 }
	
	public static void main(String[] args) {
		
		System.out.println(a);
		
		
	/*	NonStaticVariable nsv=new NonStaticVariable();
		System.out.println(nsv.a);
		//By using object we can use*/
		 

	}

}
