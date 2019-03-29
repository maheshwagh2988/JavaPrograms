package oops_convept_part1_naveen;

public class LocalAndGlobalVariable {
	//Global variable or Class Variable or Non Static method Variable 
	String name="Tom";
	int age=25;
	
	public static void main(String[] args) {
		// Local Variable
		int i=10;
		System.out.println(i);
//if we want to access name and age then we have to create a Object of calss then only Global variable/Class Variable can Access
		LocalAndGlobalVariable Obj= new LocalAndGlobalVariable();
		System.out.println("Globale varible Name Value is: "+Obj.name);
		System.out.println("Globale varible Age Value is: "+Obj.age);
		
//To Access variable of outside of the class method then we have to Pass method to that Object		
		int k=Obj.sum();
		System.out.println("Addition of I and J is: "+k);

	}
	public int sum(){
		//Local Variable of this Method
		int i=15;
		int j=20;
		int c=i+j;
		return c;
	}

}
