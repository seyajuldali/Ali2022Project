package comb.pack1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ScndLarge {
	
	public static void main(String[] args)
	{
		String s1= "seyajuldinali";
		
		Map<Character,Integer> m= new LinkedHashMap<Character,Integer>();
		
	      for(int i=0;i<s1.length();i++)
	      {
	    	  char ch= s1.charAt(i);
	    	  if(m.containsKey(ch))
	    	  {
	    		  m.put(ch,m.get(ch)+1);
	    	  }
	    	  else
	    	  {
	    		  m.put(ch,1);
	    	  }
	      }
	      
	      Set<Entry<Character,Integer>> se= m.entrySet();
	      for(Entry<Character,Integer> fr: se)
	      {
	    	  System.out.println(fr.getKey()+"="+fr.getValue());
	      }
	    	  
	}

}
