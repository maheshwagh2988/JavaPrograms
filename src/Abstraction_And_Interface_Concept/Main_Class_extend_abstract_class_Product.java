package Abstraction_And_Interface_Concept;

public class Main_Class_extend_abstract_class_Product extends Abstract_class_Product {
	
//Concrete_class_with_interface_and_Abstract_Class has a Interface has tow method called as Concrete method or Concrete Class  
//Abstract_class_Product has Abstract class which implements Concrete_class_with_interface_and_Abstract_Class to @Override product method
//Main_Class_extend_abstract_class_Product	extends Abstract_class_Product class which has @Override sum method and called in main class
	
	
//Necessary condition for a concrete class: There must be an implementation for each and every method.
	     //Example
// 1) Three classes Shape, Rectangle and Circle.
// 2) Shape has area() method. only define no body {} 
// 3) Shape is abstract whereas Rectangle and Circle are concrete and inherit Shape.
// 4) Class Rectangle extend Shape ,then Override public void area(){} 
// 5) Class Circle extend Shape ,then Override public void area(){} 		
// 6) So Rectangle and Circle are concrete class because Rectangle and Circle implemented area() method.
	

	

	public static void main(String[] args) {
		
		Main_Class_extend_abstract_class_Product obj= new Main_Class_extend_abstract_class_Product();
		
				int Pr	=obj.product(5, 5);
				int add	=obj.sum(3, 3);
		
		System.out.println("Multiplication of a and b= "+Pr);
		System.out.println("Addition of a and b= "+add);
		

	}

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
