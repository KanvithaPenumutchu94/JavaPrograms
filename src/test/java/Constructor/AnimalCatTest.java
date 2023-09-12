package Constructor;

public class AnimalCatTest extends Cat{

			AnimalCatTest()  
		    {  
		        // calling base class constructor  
		        super();  
		        System.out.println("The eyes of the cat is blue.");  
		    }  
		    // main() method start  
		    public static void main(String[] args)  
		    {  
		        // call default constructor of the SuperExample1  
		    	AnimalCatTest animalCatTest= new AnimalCatTest();  
		        System.out.println("Inside Main");  
		    }  
	}


