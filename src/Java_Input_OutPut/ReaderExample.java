package Java_Input_OutPut;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

//Java Reader is an abstract class for reading character streams.
//The only methods that a subclass must implement are read(char[], int, int) and close().
//Some of the implementation class are BufferedReader, CharArrayReader, FilterReader, InputStreamReader, PipedReader, StringReader
public class ReaderExample {

	public static void main(String[] args) throws IOException{
		Reader red= new FileReader("D://TestJavaFileOutputStream.txt");
		int data=red.read();
		while(data!=-1){
			System.out.print((char)data);
			data=red.read();
		}
		red.close();
		

	}

}
