package SingletonDesignPatternInJava;

public class SingletonDesignConcept {
//Only one Object into SingletonDesignConcept if we create another Object it will point same Object
//In OOP a Singleton class that can have only One Object/Instance at a time 
//How to design Singleton class 
//1) Make Constructor as Private
//2) Write a Static method that has return type of Object of this Singleton class(Lazy Initialization)
	
private static 	SingletonDesignConcept Singleton_instance=null;

public String str;
private SingletonDesignConcept(){
	str="Hello I'm Using Singleton Design Concept ";
}
public static SingletonDesignConcept getInstanceMethod(){
	if(Singleton_instance==null)
		Singleton_instance=new SingletonDesignConcept();
	return Singleton_instance;
}
		
	public static void main(String[] args) {
		SingletonDesignConcept	x=SingletonDesignConcept.getInstanceMethod();
		SingletonDesignConcept	y=SingletonDesignConcept.getInstanceMethod();//IT will not create another Object it will refer x
		SingletonDesignConcept	z=SingletonDesignConcept.getInstanceMethod();//IT will not create another Object it will refer x
			
			//All 3 references Pointing to same Object if we making changes in x then y and Z will be affected
			x.str  =(x.str).toUpperCase();//Convert to UpperCase
			System.out.println(x.str);
			System.out.println(y.str); 
			System.out.println(z.str);
			//Change in Z will be affected X and Y 
			z.str  =(z.str).toLowerCase();//Convert to LowerCase
			System.out.println(x.str);
			System.out.println(y.str); 
			System.out.println(z.str);
		
		

	}

}
