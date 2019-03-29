package PolymorphismExamples;


public class Polymorphism_Dog extends Polymorphism_Animal{

	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
        System.out.println("Woof");
		
	}
	public static void main(String[] args) {
		Polymorphism_Dog ob= new Polymorphism_Dog();
		ob.animalSound();

	}

}
