package Java_Input_OutPut;
//Scanner is usually used to read user input and BufferedReader is commonly used to read a file line by line in Java.

//public class BufferedReader extends Reader  
//BufferedReader should be used if we are working with multiple threads.
//BufferedReader has significantly larger buffer memory than Scanner.
//BufferedReader is synchronous while Scanner is not.
//This means, you cannot share Scanner between multiple threads but you can share the BufferedReader object.

//Java BufferedReader class is used to read the text from a character-based input stream. 
//It can be used to read data line by line by readLine() method.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		FileReader fr= new FileReader("D://TestJavaFileOutputStream.txt");
		BufferedReader br= new BufferedReader(fr);
		int i;
		while((i=br.read())!=-1){
			System.out.print((char)i);
		}
		br.close();
		fr.close();

	}

}
