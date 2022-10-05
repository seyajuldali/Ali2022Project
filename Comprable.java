package comb.pack1;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
	String ename;
	int eid;
	int esal;
	
	Employee(String ename,int eid,int esal)
	{
		this.ename=ename;
		this.eid=eid;
		this.esal=esal;
	}

	
	public int compareTo(Employee o1) {
		
		/*if (esal>o1.esal)
		{
			return 1;
		}
		else if (esal<o1.esal)
		{
			return -1;
		}
		else
		{
			return 0;
		}*/
		int val=ename.compareTo(o1.ename);
		return val;
	}
	
	
	
}


public class Comprable {

	public static void main(String[] args) {
		
		Employee e1=new Employee("pritam",101,10000);
		Employee e2=new Employee("Ali",102,80000);
		Employee e3=new Employee("golu",103,20000);
		Employee e4=new Employee("sona",104,50000);
		Employee e5=new Employee("hola",105,70000);
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		
		Collections.sort(al);
		
		for(Employee e:al)
		{
			System.out.println(e.ename+","+e.eid+","+e.esal);
		}
		

	}

}
