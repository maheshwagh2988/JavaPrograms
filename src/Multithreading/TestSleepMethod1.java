package Multithreading;
//After starting a thread, it can never be started again.
//If you does so, an IllegalThreadStateException is thrown.
//Typing the jconsole in the command prompt. 
//The jconsole tool provides information about the loaded classes, memory usage, running threads etc.
//Note: If you want to make a user thread as Daemon, it must not be started otherwise it will throw IllegalThreadStateException.
//ThreadGroup in Java convenient way to group multiple threads in a single object
//ThreadGroup represents a set of threads
//A thread group can also include the other thread group.
//Note: Now suspend(), resume() and stop() methods are deprecated.



public class TestSleepMethod1 extends Thread {
	public void run(){
		
		if(Thread.currentThread().isDaemon()){//checking for daemon thread  
			   System.out.println("daemon thread work");  
			  }  
		
		else{  
			  System.out.println("user thread work");  
			 }  
		
		
		for (int i=1;i<5;i++){
			try{
				Thread.sleep(5000);
			}catch(Exception e){}
			System.out.println(i);
			//Show the name of Thread i.e Thread 1
			System.out.println(Thread.currentThread().getName());
			
			//Print the Priority of thread
			//By Default it display 5
			System.out.println("running thread priority is:"+Thread.currentThread().getPriority()); 
		}
	}
static class TestSleepMethod2 extends Thread{
	public void run(){
		for (int i=1;i<5;i++){
			try{
				Thread.sleep(5000);
			}catch(Exception e){}
			System.out.println("Hello This is Thread 2");
			//Show the name of Thread i.e Thread 2
			System.out.println(Thread.currentThread().getName()); 
			
			//Print the Priority of thread 
			//By Default it display 5
			System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
		}
	
}	

	public static void main(String[] args) {
		TestSleepMethod1 t1= new TestSleepMethod1();
		TestSleepMethod1 t2= new TestSleepMethod1();
		TestSleepMethod2 t3= new TestSleepMethod2();
		//Display the name of Thread 
		System.out.println("Name of t1:"+t1.getName());  
		System.out.println("Name of t2:"+t2.getName());
		System.out.println("Name of t3:"+t3.getName());  
		//Display the ID of Thread
		System.out.println("id of t1:"+t1.getId());
		System.out.println("id of t2:"+t2.getId());
		System.out.println("id of t3:"+t3.getId());
		
		//Change the ThreadPriority
		t1.setPriority(Thread.MIN_PRIORITY);  //  5 Updated with 1
		t2.setPriority(Thread.MAX_PRIORITY);  // 5 Updated with 10
		t3.setPriority(Thread.NORM_PRIORITY);  // 5 Default Priority
		
		t1.setDaemon(true);//now t1 is daemon thread  
	
		
		t1.start();
		
		try{  
			  t1.join();  
			 }catch(Exception e){System.out.println(e);}  
		
		t2.start();
		t3.start();
		//Change the name of Thread
		t1.setName("Mahesh Wagh");  
		System.out.println("After changing name of t1:"+t1.getName());  
	
	}

}
}

