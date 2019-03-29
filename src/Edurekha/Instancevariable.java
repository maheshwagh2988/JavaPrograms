package Edurekha;

public class Instancevariable {
	//Instance variables are declared in a class, but outside a method, constructor or any block.
	//Created instance Variable inside of the class but outside of below methods
	public String color; 
		
	Instancevariable(String c){ //metod
		color=c;
	}
	public void display(){ //Methold
		System.out.println("Color of car is " +color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instancevariable obj= new Instancevariable("black");
		obj.display();

	}

}
