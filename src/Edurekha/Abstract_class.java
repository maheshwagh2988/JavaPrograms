package Edurekha;
//abstract class
abstract class Animal{
 //abstract method
public abstract void animalSound();
}
public class Abstract_class extends Animal{
	@Override
	public void animalSound() {
		System.out.println("Woof");
	}

public static void main(String[] args) {
		
		Animal obj= new Abstract_class();
		obj.animalSound();
	}

}
