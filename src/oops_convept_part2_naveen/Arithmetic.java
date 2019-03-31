package oops_convept_part2_naveen;

public interface Arithmetic {
	
	//With Java 8, interfaces can have static methods. They can also have concrete instance methods, but not instance fields.
	//Here is example interface Arithmetic and class ArithmaticImplementation implements Arithmetic 
	int min_account=150;
	public int add(int a, int b);
	 public static int multiply(int a, int b){
		return a * b;
		
	} 
	public int subtract();
	
	public int divied();

}
