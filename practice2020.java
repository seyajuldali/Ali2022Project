package comb.pack1;

public class practice2020 {

	public static void main(String[] args) {
	
	 int sum=0;
	 int n=152;
	 int temp=n;
	 
	 while(n!=0)
	 {
		 int rem=n%10;
		 sum=sum*10+rem;
		 n=n/10;
	 }
	 
	 if(temp==sum)
	 {
		 System.out.println("the given number is palidrome");
	 }
	 else
	 {
		 System.out.println("the given number is NOT palidrome");
	 }
	}
	

}
