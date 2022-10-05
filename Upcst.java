package comb.pack1;

 abstract class cl
{
	static void m1()
	{
		System.out.println("m1 of cl");
	}
	static void m3()
	{
		
	}
}
class cb extends cl
{
	void m2()
	{
		System.out.println("m2 of cl");
	}
	
	 void m4()
	{
		 System.out.println("m3 of cl");
	}
	
}

public class Upcst {

	public static void main(String[] args) {
		
		cb a1=new cb();
		a1.m1();
		a1.m2();
		a1.m3();
		
	}

}
