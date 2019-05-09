package Java_Input_OutPut;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//It is an abstract class for writing to character streams. 
//The methods that a subclass must implement are write(char[], int, int), flush(), and close().

public class WriterExample {
	
	public static void main(String[] args) {
		try{
			Writer wr= new FileWriter("D://TestJavaFileOutputStream.txt");
			String Context="I love my country";  
			wr.write(Context);
			wr.close();
			System.out.println("Done");
		}catch(IOException e){System.out.println(e);}
		
	}

}
