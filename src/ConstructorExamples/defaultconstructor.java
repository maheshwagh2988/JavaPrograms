package ConstructorExamples;

public class defaultconstructor {

	public defaultconstructor(int a, int b) {
	      System.out.println("parameterized constructor with two Parameter ");
	}
	public defaultconstructor(int a, int b, int c){
	      System.out.println("parameterized constructor with three Parameter");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if we un-comment below code then it gives an compilation error beacause we don't have default constructor
		
		//defaultconstructor obj= new defaultconstructor();
		
		// if we pass parameter then it will work fine
		defaultconstructor obj1= new defaultconstructor(10,10);
		defaultconstructor obj2= new defaultconstructor(10,20,30);


	}

}
