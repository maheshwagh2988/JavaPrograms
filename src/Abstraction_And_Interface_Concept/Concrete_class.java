package Abstraction_And_Interface_Concept;

//This is Pure Concrete_class 
//A concrete class is a class that has an implementation for all of its methods
//They cannot have any unimplemented methods. 
//In other words, we can say that any class which is not abstract is a concrete class.
//Necessary condition for a concrete class: There must be an implementation for each and every method.


public class Concrete_class {

	// this method calculates product of two numbers 
    static int product(int a, int b) 
    { 
        return a * b; 
    } 
  
    // this method calculates sum of two numbers 
    static int sum(int a, int b) 
    { 
        return a + b; 
    } 
	public static void main(String[] args) {
		  
			int p = product(5, 10); 
	        int s = sum(5, 10); 
	  
	        // print product 
	        System.out.println("Product: " + p); 
	  
	        // print sum 
	        System.out.println("Sum: " + s); 

	}

}
