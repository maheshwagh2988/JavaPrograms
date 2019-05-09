package Java_Input_OutPut;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//public class BufferedWriter extends Writer  
//Java BufferedWriter class is used to provide buffering for Writer instances.
//It inherits Writer class. 
//The buffering characters are used for providing the efficient writing of single arrays, characters, and strings.


public class BufferedWriterExample {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("D://TestJavaFileOutputStream.txt");  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write("Welcome to javaTpoint.");  
	    buffer.close();  
	    System.out.println("Success");  

	}

}
