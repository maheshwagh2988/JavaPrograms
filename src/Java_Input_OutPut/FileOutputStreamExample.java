package Java_Input_OutPut;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Stream Two Types Byte & Character Stream

1) InPutStream Read
2) OutPutStream  Write

2)Byte Steam
*Java Byte streams are used to perform input and output of 8-bit bytes,
*frequently used classes are, FileInputStream and FileOutputStream.
*/
/*
 3)Character streams
* Java Character streams are used to perform input and output for 16-bit unicode. 
* character streams but the most frequently used classes are, FileReader and FileWriter
* Though internally FileReader uses FileInputStream and FileWriter uses FileOutputStream
* major difference is that FileReader reads two bytes at a time and FileWriter writes two bytes at a time.
*/


public class FileOutputStreamExample {

	
	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream fileout= new FileOutputStream("D://TestJavaFileOutputStream.txt");
			String S="This is My test ";
			byte b[]=S.getBytes();//converting string into byte array 
			fileout.write(b); 
			fileout.write(56);//This will Print A in giventext file
			fileout.close();
            System.out.println("Text Print in file successfully...");    

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
