package ConstructorExamples;

public class ConstructorOverloading {
	private int stuID;
	private String stuName;
	private int stuAge;
	public ConstructorOverloading() {
		//Default constructor and Assigned value for Instance Variable 
	       stuID = 100;
	       stuName = "New Student";
	       stuAge = 18;
	}
	public	ConstructorOverloading(int num1, String str, int num2){
		//Parameterized constructor and Initialise the Instance Variable with Parameter 
	       stuID = num1;
	       stuName = str;
	       stuAge = num2;
	}
	//Getter and setter methods
	public int getStuID(){
		return stuID;
	}
	public void setStuID(int stuID) {
	       this.stuID = stuID;
	}
	public String getStuName(){
		return stuName;
	}
	public void setStuName(String stuName){
		this.stuName = stuName;
	}
	public int getStuAge() {
	       return stuAge;
	}
	public void setStuAge(int stuAge) {
	       this.stuAge = stuAge;
	}
	
	public static void main(String[] args) {
	       //This object creation would call the default constructor

		ConstructorOverloading myobj = new ConstructorOverloading();
	       System.out.println("Student Name is: "+myobj.getStuName());
	       System.out.println("Student Age is: "+myobj.getStuAge());
	       System.out.println("Student ID is: "+myobj.getStuID());
	    //*This object creation would call the parameterized * constructor StudentData(int num1, String str, int num2)*/
	    ConstructorOverloading myobj2= new ConstructorOverloading(12, "Mahesh", 29);
	     System.out.println("Student Name is: "+myobj2.getStuName());
	     System.out.println("Student Name age: "+myobj2.getStuAge());
	     System.out.println("Student Name iD: "+myobj2.stuID);
	}

}
