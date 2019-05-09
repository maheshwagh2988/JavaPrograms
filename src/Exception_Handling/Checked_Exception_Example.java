package Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//1)Checked exceptions
//Checked exceptions are checked at compile-time
//it should handle the exception using try-catch block or
//it should declare the exception using throws keyword, otherwise the program will give a compilation error.		
//All exceptions other than Runtime Exceptions are known as Checked exceptions as the 
//compiler checks them during compilation to see whether the programmer has handled them or not.
//SQLException, IOException, ClassNotFoundException etc.
	

public class Checked_Exception_Example {
//In this example we are reading the file myfile.txt and displaying its content on the screen.
//there are three places where a checked exception is thrown
//1. FileInputStream which is used for specifying the file path and name, throws FileNotFoundException. 
//2. The read() method which reads the file content throws IOException
//3. close() method which closes the file input stream also throws IOException	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis= null;
		try{
		fis= new FileInputStream("D:/Automation/Automation_Project/JavaPrograms/myfile.txt");
		}catch(FileNotFoundException e){
			System.out.println("The specified file is not " +"D:/Automation/Automation_Project/JavaPrograms/myfile.txt");
		}
		int k;
		
		
		
		try{
		while(( k = fis.read() ) != -1) 
		{ 
			System.out.print((char)k); 
		} 
		
		fis.close();
		}catch(IOException  ioe){
			System.out.println("I/O error occurred: "+ioe);
		}

	}

}
