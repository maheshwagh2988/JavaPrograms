package Java_Input_OutPut;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Java BufferedOutputStream class is used for buffering an output stream.
//It internally uses buffer to store data.
//It adds more efficiency than to write data directly into a stream. So, it makes the performance fast.
//public class BufferedOutputStream extends FilterOutputStream  


public class BufferedOutputStreamExample {

	public static void main(String[] args)throws IOException {
		FileOutputStream fout= new FileOutputStream("D://TestJavaFileOutputStream.txt");
		BufferedOutputStream bout= new BufferedOutputStream(fout);
		String s="Welcome to javaTpoint.";
		byte b[] =s.getBytes();
		bout.write(b);    
	    bout.flush();    
	    bout.close();    
	    fout.close();    
	    System.out.println("success");   

	}

}
