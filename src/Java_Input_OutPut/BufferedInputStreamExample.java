package Java_Input_OutPut;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//Java BufferedInputStream class is used to read information from stream. 
//It internally uses buffer mechanism to make the performance fast.
//When bytes from the stream are skipped or read, the internal buffer automatically refilled from the contained input stream, many bytes at a time.
//When a BufferedInputStream is created, an internal buffer array is created.
//public class BufferedInputStream extends FilterInputStream  

//SequenceInputStream 
//public class SequenceInputStream extends InputStream  
//SequenceInputStream inst=new SequenceInputStream(input1, input2);   
//Java SequenceInputStream class is used to read data from multiple streams. It reads data sequentially (one by one).

public class BufferedInputStreamExample {

	public static void main(String[] args)throws IOException {
		FileInputStream fn= new FileInputStream("D://TestJavaFileOutputStream.txt");
		BufferedInputStream br= new BufferedInputStream(fn);
		int i;
		while((i=br.read())!=-1){
			System.out.print((char)i);
		}
		fn.close();
		br.close();
		
	}

}
