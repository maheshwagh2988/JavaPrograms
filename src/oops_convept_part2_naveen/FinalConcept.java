package oops_convept_part2_naveen;

public class FinalConcept {

	public static void main(String[] args) {
//final class —> can not be extended.
//final method —> can not be overridden in the sub class.
//final variable —> can not change it’s value once it is initialized.
//No, constructors can not be final.as it not overriding so no use to make final
//All variables are implicitly public static and final in interfaces.
//Prior to Java 8, you can't create static methods in interfaces. All methods are instance methods.
//since methods in interfaces can't have any implementation, making them final would make no sense:
//they would have no implementation, and could not be overridden.

		
		
//Final keyword is used to define Constant value 
//no one can change the value of variable 
//use of Final keyword if we mark as this class as Final then we can't inherit this class 
//If we given method as Final then in another class same method can't be overriding it prevent method overriding 
//Prevent Inheritance 
//Prevent method Overriding 
//if you want to stop overriding then declare that method as final 
//it it Used to declare as Constance Variable
//Please check Class ParentClass & ChildClass for example
//Abstract methods must be overridden in the sub classes and final methods are not at all eligible for overriding.
//its not use make final method in abstraction 
//Constructor can't be final  as it not overriding so no use to make final 	

		
		
		int i=10;
		i=20;
		System.out.println(i);
		final int j=10;
		//j=20;
		System.out.println(j);
		
			
		

	}

}
