package Interface;

public class Test {

	public static void main(String[] args) 
	{
		Bank b=new SBI();
		System.out.println("ROI for SBI "+b.rateOfInterest());
		Bank b1=new ICICI();
		System.out.println("ROI for ICICI "+b1.rateOfInterest());

	}

}
