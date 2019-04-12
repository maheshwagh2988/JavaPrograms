package Abstraction_And_Interface_Concept;

public class Test_Car_Interface_with_BMW_class {

	public static void main(String[] args) {
		
		BMW b= new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.On();
		b.Wheel();
		System.out.println("This is static final Variable in Interface Car "+b.Testnumber);
		System.out.println("By Defalut Wheel variable consider as Static or Final in Interface Car "+b.wheel);
		
		//Child class Object Pass to Interface Car and its reference variable c
		//This is also called Dynamic Polymorphisam_
		  Car c  =new BMW();
		  c.start();
		  c.stop();
		  c.refuel();
		  c.On();
		  //c.Wheel();//Here Wheel() will not allow to call as its method in child class

	}

}
