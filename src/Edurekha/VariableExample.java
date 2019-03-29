package Edurekha;

public class VariableExample {
	
	// instance variable
	public String myInstanceVariable="This is Instance Variable";
	public static String staticVariable="This is Static Variable";
	
	public void myMethod(){
			String myLocalVariable="Local Variable in Inside Methond ";
			System.out.println(myLocalVariable);
			System.out.println(myInstanceVariable);//Can Access instance variable with in method of class
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableExample Obj= new VariableExample();
		System.out.println("Calling Method");
		Obj.myInstanceVariable="Change value of Instance New Variable";
		VariableExample.staticVariable="Change Value of Static";
		//Before Method we have to Initilize the variable 
		 Obj.myMethod();
		//Obj.myInstanceVariable
		System.out.println(Obj.staticVariable);
		System.err.println(Obj.myInstanceVariable);

	}

}
