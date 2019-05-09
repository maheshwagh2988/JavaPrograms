package Multithreading;

class Table{
	synchronized	void PrintTable(int n){ //If you un-comment method then it is not synchronized  O/p is different
		for(int i=1;i<5;i++){
			System.out.println(n*i);
			try{
				Thread.sleep(5000);
			}catch(Exception e){System.out.println(e);}
						
		}
	}
}

class MyThreaed1 extends Thread{
	Table t;
	MyThreaed1(Table t){
		this.t=t;
	}
	public void run(){
		t.PrintTable(5);
	}
	
}
class MyThread2  extends Thread{
	Table t;
	MyThread2(Table t){
		this.t=t;
	}
	public void run(){
		t.PrintTable(10);
	}
}


public class Thread_Synchronization {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table Obj= new Table();//Only one Object Created
		MyThreaed1 t1= new MyThreaed1(Obj);
		MyThreaed1 t2= new MyThreaed1(Obj);
		t1.start();  
		t2.start();  

	}

}
