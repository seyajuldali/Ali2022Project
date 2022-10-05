package comb.pack1;

public class Revision {

	public static void main(String[] args)
	{
		String s1= "my name is ali";
		String [] s2= s1.split(" ");
		int len= s2.length;
		String s4=" ";
		for(int i=0;i<len;i++)
		{
			String s3= s2[i];
			String s5=" ";
			for(int j=s3.length()-1;j>=0;j--)
			{
			char ch= s3.charAt(i);
			s5=s5+ch;
			}
			s4=s4+s5+" ";
			
		}
		System.out.println(s4);

	}
	}

}
