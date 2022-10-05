package comb.pack1;
import java.util.Stack;
public class Parasenthesis {

	public static void main(String[] args) {
		
		String expr="{[()]}";
		
		  
		 Stack<Character> s1 = new Stack<Character>();
		 for (int i = 0; i < expr.length(); i++)
		 {
		 char ch = expr.charAt(i);
		 if (ch == '{' || ch == '(' ||ch == '[')
		 {
		 s1.push(ch);
		 }
		 if (ch == '}' || ch == ')' || ch == ']')
		 {
		
		 char last = s1.peek();
		 if (ch == '}' && last == '{' || ch == ')' && last == '(' || ch == ']' && last == '[')
		 s1.pop();
		 }
		 
		 }
		 if(s1.isEmpty())
			 
		 {
			 System.out.println("balanced");
		 }
		 else
		 {
			 System.out.println("not balanced");
		 }
		 }
		 

	}


	

