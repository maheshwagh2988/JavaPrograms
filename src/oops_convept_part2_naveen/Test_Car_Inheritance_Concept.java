package oops_convept_part2_naveen;

public class Test_Car_Inheritance_Concept {
	
	public static void main(String[] args) {
		
		//Static PolyMorphisam or compile time Polymorphism
		BMW Obj= new BMW();
		
		System.out.println("BMW class has access of BMS and Car_Inheritance_Concept class Methods i.e Super and Subclass Methods");
		Obj.start(); //this will MethodOverriding method  as same method is in Parent class to so here call only subclass method
		Obj.theftSefty();
		Obj.stop();
		Obj.refuel();
		Obj.engine(); //GrandPaent Method
		
		System.out.println("********************");
		
		Car_Inheritance_Concept car= new Car_Inheritance_Concept();
		System.out.println("Car_Inheritance_Concept class only has access of Parent/SuperClass Methods");
		car.start();
		car.stop();
		car.refuel();
		System.out.println("*********************");
		
		// TOP Casting
		//Dynamic polymorphism or run time polymorphism
		Car_Inheritance_Concept c1=new BMW();//Child call Object can be referred by parent class reference variable 
		System.out.println(" Below are called Dynamic Polymorphisam or run time Polymorphism");
		//Only Overridden method can call i.e start() 
		c1.start();
		c1.stop();
		c1.refuel();
		//Down Casting
		//java.lang.ClassCastException:given when we do DOWN Casting 
		BMW b1= (BMW) new Car_Inheritance_Concept();
		
		
		
		
		
	}

}
