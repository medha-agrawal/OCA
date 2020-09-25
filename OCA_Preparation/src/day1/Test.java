package day1;

public class Test {

		public static void print(String s) 
	    {     
	        System.out.println("It is a String"); 
	    } 
	    public static void print(Object o) 
	    { 
	        System.out.println("It is an Object"); 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	        print(-55);
	        print(0);
	        print(null);
	        print("55");
	        print("abcd");
	        
	        
	    } 

	}

