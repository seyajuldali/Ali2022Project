package comb.pack1;

public class RecursionFibo {
	
	
	    public static void main(String[] args) {
	        int num = 10;
	        int total= fib(num);
			
	        System.out.println("Fibonacci of " + num + " = " + total);
	    }
	    public static int fib(int num)
	    {
		
	        if (num==0 || num==1)
			{
				return num;
			}
	        else  
			{
				return fib(num-1)+fib(num - 2);
			}
			
		
			
			
	    }
	}


