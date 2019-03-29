package OOPS_Concept;

public class Variables {
int mdata=50; //instance variable 
static int m=100; //static variable
void method(){
	int j=10; //local variable  
	System.out.println("Local variable is inside the Method "+j);
	System.out.println("This is instance variable in the class "+mdata);
}
public static void main (String args[]){
	Variables obj= new Variables();
	obj.method();
	//System.out.println("has"+mdata);
	System.out.println("This is Static variable int the class with keyword static "+m);
}
}
