package ExceptinalHandleing;

public class TryCatches {

	public static void main(String[] args) {
		
		
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException");
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception");
		}
	}

}
