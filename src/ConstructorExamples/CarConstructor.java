package ConstructorExamples;

public class CarConstructor {
	//Class Variable
	String name;
	int price;
	String engine;
	public CarConstructor(String name,int price,String engine){
		this.name=name;	 //this.Class Variable=Local Variable
		this.price=price;
		this.engine=engine;
		
	}
	public static void main(String[] args) {
		CarConstructor Obj1= new CarConstructor("BMW",10,"Auto");
		CarConstructor Obj2= new CarConstructor("Audi",20,"Auto");
		CarConstructor Obj3= new CarConstructor("Honda",5,"Manual");
		
		System.out.println(Obj1.name+" "+Obj1.price+" "+Obj1.engine);
		System.out.println(Obj2.name+" "+Obj2.price+" "+Obj2.engine);
		System.out.println(Obj3.name+" "+Obj3.price+" "+Obj3.engine);
		
		

	}

}
