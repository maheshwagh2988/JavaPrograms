package Java_Input_OutPut;

import java.io.FileInputStream;
import java.io.IOException;

//ancestors of I / O streams are 
//1) Byte: java.io.InputStream
//2) java.io.OutputStream;
//3) Symbolic: java.io.Reader,
//4) java.io.Writer;

//Java FileInputStream class obtains input bytes from a file.
//It is used for reading byte-oriented data (streams of raw bytes) such as image data, audio, video etc.
//You can also read character-stream data.
//But, for reading streams of characters, it is recommended to use FileReader class.
public class FileInputStream_Class {

	public static void main(String[] args) {
	try{
		FileInputStream fin= new FileInputStream("D://TestJavaFileOutputStream.txt");
		int i=0;
		while((i=fin.read())!=-1){
			System.out.print((char)i);
		}
		int store=fin.read();
		//Convert into Char
		System.out.println((char)store);
		fin.close();
	}catch(IOException e){System.out.println(e);}
	

	}

}
