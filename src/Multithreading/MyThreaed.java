package Multithreading;
/*Multitasking can be achieved in two ways:
 * 1.) Process-based Multitasking (Multiprocessing)
 * Each process has an address in memory.
 * A process is heavyweight.
 * Cost of communication between the process is high.
 * Switching from one process to another requires some time for saving and loading registers, memory maps, updating lists, etc.

 * 2.) Thread-based Multitasking (Multithreading)
 * Threads share the same address space.
 * A thread is lightweight.
 * Cost of communication between the thread is low.
 * 
 * 
 * A thread is a lightweight subprocess, the smallest unit of processing. It is a separate path of execution.
 * Note: At a time one thread is executed only.
 * 
 * wait(), notify() and notifyAll() methods are defined in Object class not Thread class
 * It is because they are related to lock and object has a lock.


 
 */


public class MyThreaed extends Thread{
	int []values={4,5,8,1,3};
	public void run(){
		for(int i=0;i<5;i++){
			int Result=values[i]*2;
			System.out.println("Multipy by 2 for given array & Result is : "+Result);
		}
	}
	public static void main(String args[]) throws InterruptedException{
		
		MyThreaed th= new MyThreaed();
		th.start();
		th.sleep(2000);
	}

}
