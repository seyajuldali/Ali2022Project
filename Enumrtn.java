package comb.pack1;

import java.util.Enumeration;
import java.util.Vector;
public class Enumrtn {

	public static void main(String[] args) {
		
		Vector <String> v=new Vector<String>();
		v.add("ali");
		v.add("pooja");
		v.add("prity");
		v.add("paul");
		
		Enumeration <String> e1=v.elements();
		while(e1.hasMoreElements())
		{
			String i=e1.nextElement();
			System.out.println(i);
		}

	}

}
