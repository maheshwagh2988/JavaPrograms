package Abstraction;

//We can't create a Object of "AbstractClass_Shape" class as this class is Abstract
//But we can create reference Of Abstract class
//Create Object of Test_AbstractClass_Shape class and create reference of Abstract class and pass it
//with the help of this we can call all the method from Abstract class

public class Test_AbstractClass_Shape extends AbstractClass_Shape {
	
	public Test_AbstractClass_Shape(){
		System.out.println("This is Child class Constructor ");
	}

	public static void main(String[] args) {
		
		Test_AbstractClass_Shape test= new Test_AbstractClass_Shape();
		test.drawing();
		test.fll();
		
		//Test_AbstractClass_Shape  call Object pass to Abstract class reference.
		AbstractClass_Shape ab=	new Test_AbstractClass_Shape();
		ab.drawing();
		ab.fll();
		
	}

	@Override
	public void drawing() {
		System.out.println("drawing() : is Overriden method from Abstract Class Shape ");
		
	}

}
