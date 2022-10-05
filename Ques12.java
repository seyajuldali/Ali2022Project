package comb.pack1;

public class Ques12 {

	public static void main(String[] args) {
		String s1="developer";
		
		int count;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			count=0;
			for(int j=0;i<s1.length();j++)
			{
				char ch1=s1.charAt(j);
				if(j<i && ch==ch1)
				{
					break;
				}
				
				if(ch==ch1)
				{
					count++;
				}
				
				
			
			
			}
			if(count >1 && j==s1.length()-1)
			{
				System.out.println(ch1);
			}
		}
		
	}
}

