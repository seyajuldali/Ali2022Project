package comb.pack1;

import java.util.Stack;

public class BalancdParasantesis {
	public static void main(String []args)
	{
	
		String[] inputs = {"{[()]}","{{(])}","{[{[()]}]}"};
		
		for(String s : inputs)
		{
			boolean flag=isBalanced(s);
			if (flag)
			{
				System.out.println("the given string is-"+s+" -is balanced");
			}
			else
			{
				System.out.println("the given string is-"+s+" -is not balanced");
			}
	
		}
	
	}
	
	public static boolean isBalanced(String inputs)
	{
		boolean flag=true;
		Stack<String> s1=new Stack<String>();
		
		for(int i=0;i<inputs.length();i++)
		{
			String val=inputs.charAt(i)+"";
			if (val.equals("(") || val.equals("{") || val.equals("["))
			{
				s1.push(val);
			}
			if (val.equals(")") || val.equals("}") || val.equals("]"))
			{
				if(s1.isEmpty())
				{
					return false;
				}
				String open=s1.peek();
				
				if(val.equals(")") && open.equals("("))
				{
					s1.pop();
				}
				else if(val.equals("]") && open.equals("["))
				{
					s1.pop();
				}
				else if(val.equals("}") && open.equals("{"))
				{
					s1.pop();
				}
					
			 }	
		}
		if(!(s1.isEmpty()))
		{
			 flag =false;
		}
		return flag;
	}
}
