package comb.pack1;

public class Ques5 {

	public static void main(String[] args) {
		String s="HELLO JAVA WORLD";
		String s1[]=s.split(" ");
		String s3=" ";
		for(int i=0;i<s1.length;i++)
		{
			String s2=s1[i];
			
			for(int j=s2.length()-1;j>=0;j--)
			{	
				char ch=s2.charAt(j);
				
				System.out.print(ch);
			}
			System.out.print(" ");
			
			
		
		

	}

}
}
