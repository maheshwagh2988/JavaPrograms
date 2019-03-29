package oops_convept_part1_naveen;

public class CallByValueandCallByReference {
	int p;
	int q;
	
	public static void main(String[] args) {
		
		CallByValueandCallByReference obj= new CallByValueandCallByReference();
		//Call by Value or Pass by Value 
		int x=10;
		int y=50;
		int  z=obj.test(x, y);	// here x and y  refer or Pass  to  method test() variable a and b it is called as call by value 
		System.out.println("Call by Value of a and b and Addition = "+z);
		
		//Before Swap
		obj.p=50;
		obj.q=60;
		System.out.println("Before Swap Value of p = "+obj.p);
		System.out.println("Before Swap Value of q = "+obj.q);
		//Another way to print
		//System.out.println("Before swapping, p = " + obj.p + " and q = " + obj.q);

		obj.swap(obj);
		//After Swap
		System.out.println("After Swap Value of p = "+obj.p);
		System.out.println("After Swap Value of q = "+obj.q);
	}

	public int test(int a,int b){
		a=30;
		b=40;
		int c=a+b;
		return c;
	}
	
	//This is called by call by reference 
	public void swap(CallByValueandCallByReference t){
		int temp;
		temp= t.p; //Temp= 50;
		t.p=t.q;   //t.p=  60;
		t.q=temp;// t.q= 50
		
	}

}
