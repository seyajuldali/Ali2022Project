package comb.pack1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PracticeRough {

	public static void main(String[] args) {
		
		String s1= "my bussiness is my bussiness not my bussiness";
		 String s2[]= s1.split(" ");
		Map<String,Integer> m= new LinkedHashMap<String,Integer>();
		
		for (int i=0;i<s2.length;i++)
		{
			String ch= s2[i];
			if(m.containsKey(ch))
			{
				m.put(ch, m.get(ch)+1);
			}
			else
			{
				m.put(ch,1);
			}
		}
		
		Set<Entry<String,Integer>> se= m.entrySet();
		for(Entry<String,Integer> fr: se)
		{
			System.out.println(fr.getKey()+ "="+ fr.getValue());
		}
		

	}

}
