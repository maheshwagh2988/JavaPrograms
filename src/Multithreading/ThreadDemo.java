package Multithreading;
//Thread:- Its a Unit of Process 
//A Thread is a concurrent unit of execution.
//Use of Thread
//1) By Default we have main thread like if any program give exception its say thread 
//2) By Extend Thread or By Implement Runnable interface we can do Multithreading
//3) In  Interface we have to create Object of thread and pass Object of Class (Runnable)
//Multithreading is a process of executing more than one thread simultaneously.
//1) Threads share the same address space
//2) Thread remains lightweight
//3) Cost of communication between threads is low.

//The process can contain multiple threads.
//The thread is a subset of process. 
//The process can run on on different memory space, but all threads share the same memory space.


//There are two methods to create a thread in java.
//1)First by implementing Runnable interface and then create a thread object from it.
//Runnable interface have only one method named run().
//2)The second method is to extend the thread class.





class Hi implements Runnable{
	public void run(){
		for (int i=1;i<=5;i++)
			System.out.println("Hi");
		try{
			Thread.sleep(5000);
			}catch(Exception e){}
	}
	
} 
class Hello implements Runnable{
	public void run(){
		for (int i=1;i<=5;i++)
			System.out.println("Hello");
		try{
			Thread.sleep(5000);
			}catch(Exception e){}
	}
	
}

public class ThreadDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hi th1= new Hi();
		Hello th2= new Hello();
		
		Thread t1= new Thread(th1);
		Thread t2= new Thread(th2);
		
		t1.start();
		try{
			Thread.sleep(5000);
			}catch(Exception e){}
		
		t2.start();

	}

}
