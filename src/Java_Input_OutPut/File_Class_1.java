package Java_Input_OutPut;

import java.io.File;
import java.io.IOException;

public class File_Class_1 {

	public static void main(String[] args) {
		String path = "";  
        boolean bool = false;  
		
		 try {  
			// Creating  new files  
	            File file = new File("javaFile123.txt");  
	            if (file.createNewFile()) {  
	                System.out.println("New File is created!");  
	            } else {  
	                System.out.println("File already exists.");  
	            } 
	            // Creating new canonical from file object  
	            File file2 = file.getCanonicalFile();  
	            
	         // returns true if the file exists  
	            System.out.println(file2);  
	            bool = file2.exists();  
	            
	            // returns absolute pathname  
	            path = file2.getAbsolutePath();  
	            System.out.println(bool);  
	            
	         // if file exists  
	            if (bool) {  
	                // prints  
	                System.out.print(path + " Exists? " + bool);  
	            }  
	            
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	
	


	}
}
