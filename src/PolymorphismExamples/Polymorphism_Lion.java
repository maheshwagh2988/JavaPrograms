package PolymorphismExamples;


public class Polymorphism_Lion extends Polymorphism_Animal{

	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
        System.out.println("Roar");
	}
	
	public static void main(String[] args) {
		Polymorphism_Lion ob1= new Polymorphism_Lion();
		ob1.animalSound();
	}

}
