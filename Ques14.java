package comb.pack1;

public class Ques14 {

	public static void main(String[] args) {
		String s1="big black dog in big house black house" ;
		String s2[]=s1.split(" ");
		int count;
		for(int i=0;i<s2.length;i++)
		{
			count=0;
			for(int j=0;j<s2.length;j++)
			{
				
				if(j<i && s2[i].equals(s2[j]))
				{
					break;
				}
				if(s2[i].equals(s2[j]))
				{
					count++;
				}
				
			
			if(count>1 && j==s2.length-1 )
			{
				
				System.out.println(s2[i]);
			}
			}
			
			
		}
		

	}

}
