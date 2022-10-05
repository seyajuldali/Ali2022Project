package comb.pack1;

public class Ques11 {

	public static void main(String[] args) {
		String s="hello world";
		int a=s.length();
		
		int count=0;
		for(int i=0;i<a;i++)
		{
			char ch=s.charAt(i);
			if(ch==' ')
			{
				continue;
			}
			else
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
