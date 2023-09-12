package ExceptinalHandleing;

public class TryCatches2 {

	public static void main(String[] args) {
		
		//we should not declare Exception first and then child class i.e NullPointerException
		//because the exception is handled by parent class i.e Exception
		//no need of NullPointerException so we got compile error in line no 18
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception");
		}
		catch(NullPointerException e)
		{
			System.out.println(" NullPointerExceptionException");
		}
	}

}
