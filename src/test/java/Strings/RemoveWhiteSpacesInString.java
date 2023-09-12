package Strings;

public class RemoveWhiteSpacesInString {

	public static void main(String[] args) {

		String s="India  is  my  Country";
		System.out.println(s.replaceAll("\\s+", "").trim());

	}

}
