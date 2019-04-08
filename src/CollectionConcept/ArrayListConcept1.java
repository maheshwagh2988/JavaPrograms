package CollectionConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept1 {
//Java ArrayList class can contain duplicate elements.
//Java ArrayList class maintains insertion order.
//Java ArrayList class is non synchronized.
//Java ArrayList allows random access because array works at the index basis.
//In Java ArrayList class, manipulation is slow because a lot of shifting needs to occur if any element is removed from the array list.
//It Allows null Values	
//Java collection framework was non-generic before JDK 1.5. Since 1.5, it is generic.
//Traverse Using Enumeration in vector while in ArrayList and Linked we can Traverse using Itrator  
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ar= new ArrayList<Integer>();
		ar.add(5);  // Index 0
		ar.add(10); // Index 1
		ar.add(15); // Index 2
		ar.add(null);
		//ar.add(null); // Index 3
		System.out.println(ar.get(1));
		System.out.println(ar.size());
		System.out.println(ar);
		System.out.println("**************************");
		ArrayList<Integer> ar1= new ArrayList<Integer>();
		ar1.add(20); // Index 4
		ar1.add(10); // Index 5
		ar1.add(40); // Index 6
		//This is called Random access 
		System.out.println(ar1.get(0));
		
		
		ArrayList <Integer> ar2 = new ArrayList<Integer>();
		ar2.add(10); // Index 7
		ar2.add(20); // Index 8
		ar2.add(30); //Index 9
		
		
		System.out.println("***********Using For Loop");
		ar1.addAll(ar); // Index 7
		for(int i=0;i<ar1.size();i++){
			System.out.println(ar1.get(i));
		}
		System.out.println(ar1.size());
		
		System.out.println("**************************");
		ar1.set(4, 35);
		System.out.println(ar1);
		
		System.out.println("******Usuing Iterator Loop ");
		ar1.retainAll(ar);
		Iterator<Integer> itr=ar1.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  	
		  System.out.println("******Usuing for-each loop ");
			ar1.retainAll(ar);
			for(Integer in:ar1){
				System.out.println(in);
			}
		System.out.println("******User-defined class objects in Java ArrayList***********");
			//User-defined class objects in Java ArrayList
			//Create Employee class object 
			Employee em1= new Employee("Mahesh", 30, "QA");
			Employee em2= new Employee("Jhony", 20, "Dev");
			Employee em3= new Employee("Rony", 35, "It");
			//Create ArrayList
			ArrayList<Employee> ar3= new ArrayList<Employee>();
			ar3.add(em1);
			ar3.add(em2);
			ar3.add(em3);
			//Iterator does not work on index as here this is kind of object 
			Iterator<Employee> it=ar3.iterator();
			while (it.hasNext()) {
			Employee emp=it.next();
			System.out.println("Name of Employee is:= "+emp.name+"\nName of Department is:= "+emp.department + "\nAge of Employee:= " + emp.age);
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.department);
			}	
			
			}

}
