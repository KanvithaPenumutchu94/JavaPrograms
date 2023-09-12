package Encapsulation;

public class Read_Only {
	
	//we can't change the value of name.if you are trying, we will get Compile time Error
	private String name="kanni";

	public String getName() {
		return name;
	}

	
}
