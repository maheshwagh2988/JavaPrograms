package Abstraction;

public abstract class AbstractClass_Shape {
	 
//Can't create Object of Abstract class
//In a class if any method is abstract then that class should be abstract class
//In Abstract class we can have non abstract  method too
//It is also called Partital abstraction
//Constructor and Abstract method can't be final as we can't create Object 	
//Abstract methods must be overridden in the sub classes and final methods are not at all eligible for overriding.
//its not use make final method in abstraction 
//Constructor can't be final  as it not overriding so no use to make final
	//Test 
	String color;
	
	public 	AbstractClass_Shape(){
			System.out.println("Abstract class Constructor");
	}
	  
	 public  abstract void drawing();
	 
	 public void fll(){
		 
		 System.out.println("fll() :  is non Abstract method from Abstract class shape");
	 }

}
