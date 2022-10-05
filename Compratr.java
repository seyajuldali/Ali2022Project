package comb.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee
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

}
class salCompare implements Comparator
{
  
@Override
public int compare(Object o1, Object o2) {
	
	Employee e1=(Employee)o1;
	Employee e2=(Employee)o2;
	
	if (e1.eid>e2.eid)
	{
		return 1;
	}
	else if (e1.eid<e2.eid)
	{
		return -1;
	}
	else
	{
		return 0;
	}
	
	/*int val=e1.ename.compareTo(e2.ename);
	return val;*/
}
}



public class Compratr {
	
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
		
		salCompare com=new salCompare();
		Collections.sort(al,com);
		
		for(Employee e:al)
		{
			System.out.println(e.ename+","+e.eid+","+e.esal);
		}
		

}
}
