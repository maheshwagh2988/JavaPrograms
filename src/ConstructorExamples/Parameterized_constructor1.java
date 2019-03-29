package ConstructorExamples;

public class Parameterized_constructor1 {

	private int var;
	public Parameterized_constructor1(){
		this.var=10;
	}
	public Parameterized_constructor1(int num){
		this.var=num;
	}
	public int getValue(){
		return var;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterized_constructor1 obj= new Parameterized_constructor1();
		Parameterized_constructor1 obj1= new Parameterized_constructor1(100);
		System.out.println("Value of Default Constructor is :"+obj.getValue());
		System.out.println("Value of Parameterized_constructor1 is :"+obj1.getValue());
				
	}

}
