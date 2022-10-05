package comb.pack1;

public class Ques10 {

	public static void main(String[] args) {
		String s="HELLO JAVA WORLD";
		String s2[]=s.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			String ch=s2[i];
			System.out.print(ch+"_");
		}

	}

}
