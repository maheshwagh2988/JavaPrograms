package oops_convept_part1_naveen;

public class FunctionsInJava {

	
	public static void main(String[] args) {
		
		FunctionsInJava Obj1= new FunctionsInJava();
		Obj1.test();
		//AdditionMethod Result Store in Obj1 if we have to print then assign into one variable and PRint it 
		int a= Obj1.AdditionMethod();
		System.out.println("OutPut of AdditionMethod is :"+a);
		
		//StringMethod Result Store in Obj1 if we have to print then assign into one variable and PRint it 
		String  S=Obj1.StringMethod();
		System.out.println("OutPut of StringMethod is :"+S);
		
		//ParametarizedMethod Result Store in Obj1 if we have to print then assign into one variable and PRint it 
		int T=Obj1.ParametarizedMethod(10, 20);
		System.out.println("OutPut of ParametarizedMethod is :"+T);
		
	}
	//Non-Static Method
	public void test(){
		System.out.println("This is Test method");
	}
	public int AdditionMethod(){
		System.out.println("This is AdditionMethod");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
		
	}
	public String StringMethod(){
		System.out.println("This is StringMethod");
		String s= "selenium";
		return s;
	}
	public int ParametarizedMethod(int x, int  y){
		System.out.println("This is ParametarizedMethod");
		int d=x-y;
		return d;

		
	}

}
