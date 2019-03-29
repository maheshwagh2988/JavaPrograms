package ConstructorExamples;

public class ParameterizedConstructor3 {
	   //Default constructor
	ParameterizedConstructor3(){
	      System.out.println("Default constructor");
		}
	/* Parameterized constructor with 
	    * two integer arguments
	    */
	ParameterizedConstructor3(int i,int j){
	      System.out.println("constructor with Two parameters");
	}
	/* Parameterized constructor with 
	    * three integer arguments
	    */
	ParameterizedConstructor3(int i,int j ,int k){
	      System.out.println("constructor with Three parameters");	      
	}
	 //* Parameterized constructor with two arguments, int and String 
	    
	    
	ParameterizedConstructor3(int i,String name){
	      System.out.println("constructor with int and String parameters");

	}
	public static void main(String[] args) {
	      //This will invoke default constructor
		ParameterizedConstructor3 Obj= new ParameterizedConstructor3();
		//* This will invoke the constructor  with two int parameters
	    ParameterizedConstructor3 Obj1= new ParameterizedConstructor3(29, 29);
	    //* This will invoke the constructor * with three int parameters
	    ParameterizedConstructor3 Obj2= new ParameterizedConstructor3(10, 20, 30);
	    //* This will invoke the constructor  * with int and String parameters
	    ParameterizedConstructor3 Obj3= new ParameterizedConstructor3(29,"Mahesh");
	     
	}

}
