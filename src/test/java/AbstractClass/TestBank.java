package AbstractClass;

public class TestBank {

	public static void main(String[] args) {
		//creating object for child class i.e SBI with reference of Parent class
		Bank sbi=new SBI();
		System.out.println(sbi.getRateOfInterest());
		
		Bank icici=new ICICI();
		System.out.println(icici.getRateOfInterest());
		
		SBI sbi1=new SBI();
		System.out.println(sbi1.getRateOfInterest());
		
		ICICI icici1=new ICICI();
		System.out.println(icici1.getRateOfInterest());
	}

}
