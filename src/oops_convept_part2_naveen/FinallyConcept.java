package oops_convept_part2_naveen;

public class FinallyConcept {
	
//finally is block Starting and ending body like { }
//it is Reserve keyword that has to execute even after execution will throw
//It is always used with try catch block and after try catch block it will execute finally it will print whatever written inside finally
// Real time example is when we create database connection that we have to close using finally block 
//In seleniom driver.quit need to write in fianlly block 	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test1();
		test2();
		division();
		division1();

	}
	
	//if we decide this method as Static then we can directly call it no need to create  Object
	public static void test1(){
		try{
			System.out.println("Inside test1");
			throw new RuntimeException("test");
		}catch(Exception e){
			System.out.println("Inside Catch block ");
		}
		finally{
			System.out.println("Inside Finally Block ");
		}
		System.out.println("****************************");
	}
	
	
	public static void test2(){
		try{
			System.out.println("Inside test2");
		}
		finally{
			System.out.println("Fianlly code in test2 method");
		}
		System.out.println("****************************");
	}
	public static void division(){
		int i=10;
		try{
			System.out.println("Inside try block ");
			int k=i/0;
		}
		catch(ArithmeticException e){
			System.out.println("Insitde catch block ");
			System.out.println("divied by zero error ");
		}
		finally {
			System.out.println("Execute finally even afterr ArithmeticException come still it execute finally ");
		}
		System.out.println("****************************");
	}
	
	//we are expecting ArithmeticException but we given NullPointerException in such case after try it goes finally then it will give exception
	public static void division1(){
		int i=10;
		try{
			System.out.println("Inside try block ");
			int k=i/0;
		}
		catch(NullPointerException e){
			System.out.println("Insitde catch block ");
			System.out.println("divied by zero error ");
		}
		finally {
			System.out.println("Execute finally even afterr ArithmeticException come still it execute finally ");
		}
	}

}
