package Map;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
	
		String s="Shame Shame Puppy Shame kanni ram venki kanni";
		String[] words=s.split("\\s+");
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		/*for(String word:words)
		{
			if(hm.containsKey(word))
			{
				hm.put(word, hm.get(word)+1);
			}
			else
			{
				hm.put(word, 1);
			}
		}System.out.println(hm);*/
		
		for(int i=0;i<words.length;i++)
		{
			if(hm.containsKey(words[i]))//word already inserted into hash map
			{
				hm.put(words[i], hm.get(words[i])+1);//update existing entry
			}
			else
			{
				hm.put(words[i], 1);//insert a new entry
			}
				
			
		}System.out.println(hm);
		
		//Display Duplicated words
		for(String word:hm.keySet())
		{
			if(hm.get(word)>1)
			{
				System.out.println(word+" occured "+hm.get(word));
			}
		}
		
		
	}

}
