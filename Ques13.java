package comb.pack1;

public class Ques13 {

	public static void main(String[] args) {
		String s1="developer";
		String s2="";
		
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			int index=s2.indexOf(ch);
			if (index==-1)
			{
				s2=s2+ch;
			}
			
		}
		System.out.println(s2);
		System.out.println(s2.length());
	}

}
