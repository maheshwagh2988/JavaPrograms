package oops_convept_part2_naveen;

//use of Final keyword if we mark as this class as Final then we can't inherit this class 
//If we given method as Final then in another class same method can't be overriding it prevent method overriding 
//Prevent Inheritance 
//Prevent method Overriding 
//if you want to stop overriding then declare that method as final 
//it it Used to declare as Constance Variable 
public class ParentClass {
	public void start(){
		System.out.println("This is Perent class method");
	}

}

/*public final class ParentClass {
	public final void start(){
		System.out.println("This is Perent class method");
	}

}*/
