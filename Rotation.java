package comb.pack1;

public class Rotation {
	
	 public static void main(String[] args) {  
	       
	        int [] a = {1, 2, 3, 4, 5};  
	        int n = 2; 
			int j;
			int first;  
	         
	         
			for(int i = 0; i < n; i++)
			{  
	            
	            
	            first = a[0];  
	            for(j = 0; j < a.length-1; j++)
				{  
	                //Shift element of array by one  
	                a[j] = a[j+1];  
	            }  
	            //First element of array will be added to the end  
	            a[j] = first;  
	        }  
	      
	        
	        System.out.println("Array after left rotation: ");  
	        for(int i = 0; i< a.length; i++){  
	            System.out.print(a[i] + " ");    // o/p-4 5 6 7 8 1 2 3
	        }  
	    }  

}
