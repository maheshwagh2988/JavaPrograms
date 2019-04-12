package Abstraction_And_Interface_Concept;
//If we want to use Car Interface method then you have implements Car Interface into BMW Class
//All method have to use into BMW class i.e @Override into BMW Class

public  class BMW implements Car{
	
		
	public BMW() {
		
		System.out.println("This generated constructor of BMW Class");
	}
	
	//Non Overriden method 
	public void Wheel() {
		
		System.out.println("This Is BMW Class Non- Overriden method");
	}
		
	@Override
	public void start() {
		System.out.println("BMW----Start is Overrideen method come from Car Interface--");
		
	}
	@Override
	public void stop() {
		System.out.println("BMW----Stop  is Overrideen method come from Car Interface");
		
	}
	@Override
	public void refuel() {
		System.out.println("BMW----Refuel is Overrideen method come from Car Interface");
		
	}
	@Override
	public void On() {
		
		System.out.println("BMW----On is Overrideen method come from Car Interface");
		
	}

	

}

