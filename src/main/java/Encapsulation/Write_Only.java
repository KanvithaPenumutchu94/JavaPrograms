package Encapsulation;

public class Write_Only {
	
	//we can change the value of name.if you are trying to get name, we will get Compile time Error
	private String name="kanni";

	public void setName(String name) {
		this.name = name;
	}

	
	
}
