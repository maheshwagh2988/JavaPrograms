package Edurekha;

class EmployeeCount{
	
	private int numOfEmployees=0; //This variable we can't change it so this is EncapsulationExample
	public void setNoOfEmployees (int count)
	{
		numOfEmployees=count;
	}
	public double getNoOfEmployees()
	{
		return numOfEmployees;
	}
}

public class EncapsulationExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeCount Obj= new EmployeeCount();
		Obj.setNoOfEmployees(125);
		System.out.println("No of Employee is "+(int)Obj.getNoOfEmployees());

	}

}
