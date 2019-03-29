package oops_convept_part2_naveen;

//Car_Inheritance_Concept is SuperClass or Parent Class
//BMW is Child Class or SubClass
//extends keyword used to make relationship between these two classes.
//Here we have access of all 3 method of Car_Inheritance_Concept class as well as BMW own has 2 method.
//When we have same method in Parent as well as Child class then with same name or parameter/argument then 1st Preference is given to child method
//this is called MethodOverriding
public class BMW extends Car_Inheritance_Concept {  //Has- a- relationship 
	
	public void start() //this is MethodOverriding Method 
	{
		System.out.println("BMW Start Automatically ");
	}
	public void theftSefty(){
		System.out.println("BMW has theftSefty Fetaure ");
	}	
}
