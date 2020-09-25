package day1;

class Operator1 { 
    public static void main(String[] args) 
    { 
        int a = 10; 
        int b = 20; 
  
        if (++a <= 10 && --b < 20) {} 
          System.out.println("o/p of && operator: " + "a = " + a + " b = " + b); 
        System.out.println(" "); 
  
        a = 10; 
        b = 20; 
        if (++a <= 10 & --b < 20) {} 
          System.out.println("o/p of & operator: " + "a = " + a + " b = " + b); 
    } 
} 