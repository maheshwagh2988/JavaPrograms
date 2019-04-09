package oops_convept_part2_naveen;

public class FinalConcept {

	public static void main(String[] args) {
		
		//Final keyword is used to define Constant value 
		//no one can change the value of variable 
		//use of Final keyword if we mark as this class as Final then we can't inherit this class 
		//If we given method as Final then in another class same method can't be overriding it prevent method overriding 
		//Prevent Inheritance 
		//Prevent method Overriding 
		//if you want to stop overriding then declare that method as final 
		//it it Used to declare as Constance Variable
		
	//	Please check Class ParentClass & ChildClass for example 
		int i=10;
		i=20;
		System.out.println(i);
		final int j=10;
		//j=20;
		System.out.println(j);
		
			
		

	}

}
