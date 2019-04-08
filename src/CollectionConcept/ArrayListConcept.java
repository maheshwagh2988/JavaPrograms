package CollectionConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= new int[3];//This is Static array and Size is fixed
		//Dynamic array ---ArrayList
		//1 can contains duplicate values
		//2 it maintain insertion order
		//3 it is not synchronize
		//4  allows you random access to fetch any element it store values on basis on index
		//Arrays can store primitive data types as well as objects.	
		//ArrayList cannot store the primitive data types it can only store the objects.
		//ArrayList is of dynamic size. and Arrays are of the static type.	


		
		ArrayList ar = new ArrayList();
		ar.add(10); // Index 0
		ar.add(20); // Index 1
		ar.add(30); //Index 2
		System.out.println("ArrayList size is : "+ar.size());
		ar.add(40); //Index 3
		ar.add(50); //Index 4
		ar.add(50); //Index 5
		//Here different data types allow if we are not define Generic
		ar.add(12.5); //Index 5    Decimal data type 
		ar.add("test"); //Index 5  String data type 
		ar.add('A'); //Index 5     Character data type 
		ar.add(true); //Index 5    Boolean data type 
		
		System.out.println("After add more ArrayList size is : "+ar.size());
		
		System.out.println("Given index size is : "+ar.get(4));
		//Print all the values 
		for(int i=0;i<ar.size();i++) {
			System.out.println("ArrayList with Index is " +i+" value is = : "+ar.get(i));
		}
		
		//Non Generic vs Generic
		//Before java 1.5 generic not available 
		//Below are Generic using wrapper class
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("test");//The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (String)
		ArrayList<String> ar2 = new ArrayList<String>();
		ar1.add(100);
		System.out.println("************************");
		
		
		//How to define user define class Employee into ArrayList
		//Create Employee class object 
		Employee e= new Employee("mahesh", 25, "QA");
		Employee e1= new Employee("tom", 28, "Network");
		Employee e2= new Employee("peter", 27, "IT");
		//Create ArrayList and Pass Employee class 
		ArrayList<Employee> ar3 = new ArrayList<Employee>();
		ar3.add(e);
		ar3.add(e1);
		ar3.add(e2);
		//Iterator does not work on index as here this is kind of object 
		Iterator<Employee> it=ar3.iterator();
		while (it.hasNext()) {
			Employee emp=it.next();
		System.out.println("Name of Employee is:= "+emp.name+"\nName of Department is:= "+emp.department + "\nAge of Employee:= " + emp.age);
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.department);
			
		}
      System.out.println("*****************************");
		//addAll method to add one object values to another object
		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("A"); // Index 0
		ar4.add("B"); // Index 1
		ar4.add("C"); //Index 2
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("test1"); // Index 0
		ar5.add("test2"); // Index 1
		ar5.add("test3"); //Index 2
		
		ar4.addAll(ar5);
		for(int i=0;i<ar4.size();i++){
			System.out.println(ar4.get(i));
		}
		
		
		
	}

}
