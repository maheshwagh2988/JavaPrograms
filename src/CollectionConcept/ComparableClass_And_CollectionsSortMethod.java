package CollectionConcept;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableClass_And_CollectionsSortMethod {

	
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		
		Collections.sort(al);//This is showing reference Object 
		System.out.println(al);
		for(Student list:al){
			System.out.println(list.rollno+" "+list.name+" "+list.age);
		}
	}

}
