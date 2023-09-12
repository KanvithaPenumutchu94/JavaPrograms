package JavaLogics;

public class PrintDuplicatesInStringArray {

	public static void main(String[] args) {
		//This logic is applicable for two duplicates are present	
		//String s[]= {"ram","ram","sita","sita","hanuma","hanuma","lakshman"};
		String s[]= {"ram","hanuma","sita","hanuma","lakshman","ram","sita"};
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equals(s[j]))
				{
					System.out.println(s[i]);
				}
			}
		}
		
	}

}
