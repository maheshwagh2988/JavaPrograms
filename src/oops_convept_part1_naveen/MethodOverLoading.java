package oops_convept_part1_naveen;

//When we have same Method name with different Parameter or Argument then it is called as MethodOverLoading

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading Obj= new MethodOverLoading();
		Obj.Add();
		Obj.Add(10);
		Obj.Add(10, 20);
		Obj.Add("Mahesh-This is no of Parameter same but Different Data Types");
		
	}
	
	public static void main(int a) {
		//We can Overload Main Method but need different Parameter	
	}
	
	public void Add(){
		System.out.println("Add() Method with No Input Parameter");
	}	
	public void Add(int i){
		System.out.println("Add() Method with One Input Parameter");
		System.out.println(i);
	}
	public void Add(String m){
		String m1=m;
		System.out.println("Add() Method with One Input Parameter");
		System.out.println(m1);
	}
	public void Add(int i ,int j){
		System.out.println("Add() Method with Two Input Parameter");
		
		System.out.println(i+j);
	}

}
