package InterviewPrograms;

public class RemoveParticularCharFromString3 {

	public static void main(String[] args) {
		
		String s="CloudTech";
		
		String str=s.toLowerCase();
		System.out.println(str.replaceAll("c", ""));
	}

}
