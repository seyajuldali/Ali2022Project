package comb.pack1;

public class Ques8 {

	public static void main(String[] args) {
		String s1="MADAM";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch =s1.charAt(i);
			s2=s2+ch;
			
		}
		System.out.println(s2);
		if(s1.equals(s2))
		{
			System.out.println("given name is palidrome");
		}
		else
		{
			System.out.println("given name is not palidrome");
		}
		

	}

}
