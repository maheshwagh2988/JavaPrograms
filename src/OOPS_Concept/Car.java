package OOPS_Concept;

public class Car {
	
	public static int tyre;// Created a class variable tyre
	
	//Method creation name as display()
	//These are the variables which are declared within the method of a class
	public void display(String m){ 
		String model=m;  //model is Local Variable declared within the method of a class
		System.out.println("Model of car is "+model);
	}
	
	//Instance variable is declared in a class but outside a method
	public String colour; // Created an instance variable color declared in a class but outside a method
	Car(String c){
		colour=c;
	}
	public void display() {  // Method name as display()
	      System.out.println("Color of the car is "+colour);
	   }
	public static void main(String args[]){
        Car obj=new Car("black");
        obj.display("Audi");
        obj.display();
                       
  //In the above code, ‘color’ is my instance variable which has a value “black” associated to it.
         tyre=4;
  //All car has 4 tyre so it whose value remains same throughout the class.
         System.out.println("Number of Typre "+tyre);
 }
	
	
}
