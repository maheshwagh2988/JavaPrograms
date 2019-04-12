package Abstraction_And_Interface_Concept;

public class Test_CanWeCreateObjectOfAbstractClass extends CanWeCreateObjectOfAbstractClass {

	
	public static void main(String[] args) {
		
		// Create a Object of Test_CanWeCreateObjectOfAbstractClass and Passed to CanWeCreateObjectOfAbstractClass
		CanWeCreateObjectOfAbstractClass ob= new Test_CanWeCreateObjectOfAbstractClass();
		
		//if you see we can't create a Object of CanWeCreateObjectOfAbstract Class 
		//CanWeCreateObjectOfAbstractClass Obj= new CanWeCreateObjectOfAbstractClass();
		ob.myMethod();
		ob.myAbstractTestMethod();
		
		

	}

	@Override
	void myAbstractTestMethod() {
		// TODO Auto-generated method stub
		System.out.println("This is @Override Abstract method of CanWeCreateObjectOfAbstractClass ");
	}

}
