package ConstructorExamples;

public class Parameterizedconstructor2 {
	int empId;
	String empName;

	//parameterized constructor with two parameters

	public Parameterizedconstructor2(int id, String name){
		this.empId=id;
		this.empName=name;
	}
	void Displayinfo(){
		System.out.println(" Id : "  +empId+ " Name: " +empName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterizedconstructor2 obj= new Parameterizedconstructor2(29, "Mahesh");
		Parameterizedconstructor2 obj2= new Parameterizedconstructor2(17, "Mj");
		obj.Displayinfo();
		obj2.Displayinfo();
	
	}

}
