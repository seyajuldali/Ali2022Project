package comb.pack1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;



public class Itr {

	public static void main(String[] args) {
		
		LinkedList as=new LinkedList();
		as.add("ali");
		as.add(10);
		as.add(20);
		as.add(30);
		System.out.println(as);
		
		ListIterator it=as.listIterator();
		
		while(it.hasNext())
		{
			Object t=it.next();
			System.out.println(t);
		}
		it.remove();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@");
		 
		
		while(it.hasPrevious())
		{
			
			Object t=it.previous();
			System.out.println(t);
		}
		
		
	}

}
