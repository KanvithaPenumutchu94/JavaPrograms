package KeywordStatic;

public class TestStudent {

	public static void main(String[] args) {
		
		Student.change();
		
		Student s=new Student(5,"kanni");
		s.display();
		Student s1=new Student(10,"venki");
		s1.display();
		Student s2=new Student(10,"thanvish ram");
		s2.display();
		
		System.out.println(Student.college="cha");
				

	}

}
