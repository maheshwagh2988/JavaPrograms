package oops_convept_part1_naveen;

public class CarClass {
	String Company;
	int Modelof_Car;
	int Wheel_of_Car;
	
public void Cardisplay(String Com,int Mod,int wh)
		{
			Com=Company;
			Mod=Modelof_Car;
			wh=Wheel_of_Car;
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarClass Car= new CarClass();
		
		Car.Company="BMW";
		Car.Modelof_Car=2018;
		Car.Wheel_of_Car=4;
		
		System.out.println("Comany Name of Car is: " + Car.Company);
		System.out.println("Comany Model of Car is: " + Car.Modelof_Car);
		System.out.println("Number if Car Wheel is: " + Car.Wheel_of_Car); 
		
		
		//System.out.println(Car.Cardisplay("BMD", 2018, 4));

	}

}
