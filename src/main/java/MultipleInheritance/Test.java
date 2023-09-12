package MultipleInheritance;

public class Test implements Printable,Showable
{

		public void print()
		{
			System.out.println("Print");
		}
		public void show()
		{
			System.out.println("Show");
		}
		
public static void main(String[] args)
{
	Test obj=new Test();
	obj.print();
	obj.show();

	}

}
