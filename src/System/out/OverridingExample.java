package System.out;

class Animal{
	   public void animalSound(){
		System.out.println("Default Sound");
	   }
	}

public class OverridingExample extends Animal {

	public void animalSound(){
		System.out.println("Woof");
	   }
	
	public static void main(String[] args) {
		
		// This would call the Animal class method
		Animal obj1= new Animal();
		obj1.animalSound();
		
		// This would call the OverridingExample class method

		Animal obj= new OverridingExample();
		obj.animalSound();
		
		//Since both the classes, child class and parent class have the same method animalSound.
		//Which of the method will be called is determined at runtime by JVM.



	}

}
