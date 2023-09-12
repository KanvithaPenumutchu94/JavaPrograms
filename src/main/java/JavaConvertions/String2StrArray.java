package JavaConvertions;

public class String2StrArray {

	public static void main(String[] args) {
		String str = "Converting string to string array using split() method";  
		String[] strArray = null;  
		//converting using String.split() method with whitespace as a delimiter  
		strArray = str.split(" ");  
		//printing the converted string array  
		for (int i = 0; i< strArray.length; i++){  
		System.out.println(strArray[i]);  
		}  	}

}
