package JavaLogics;

public class SplitMethod {

	public static void main(String[] args) {
	
		String s="India   is  my  country";
		String[] str=s.split("\\s+");//splits the string based on whitespace  
		for(String ss:str)
		{
			System.out.println(ss);
			
		}
		
		String s1="geekss@for@geekss";
		String[] str1=s1.split("s",0);
		for(String ss1:str1)
		{
			System.out.println(ss1);
		}
		
		 String str2 = "Javatpointtt";  
	        System.out.println("Returning words:");  
	        String[] arr = str2.split("t", 0);  
	        for (String w : arr) {  
	            System.out.println(w);  
	        }  
	        System.out.println("Split array length: "+arr.length);  

	}

}
