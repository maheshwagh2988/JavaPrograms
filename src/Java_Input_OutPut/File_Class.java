package Java_Input_OutPut;
//The File class is an abstract representation of file and directory pathname.
//A pathname can be either absolute or relative.
//This class is used for creation of files and directories, file searching, file deletion, etc.
//File object represents the actual file/directory on the disk.




import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Class {

	public static void main(String[] args) {
	
			File f= new File("Hello.text");
		    
			// creates the file
			try {
				f.createNewFile();
   	      // creates a FileWriter Object
	    		FileWriter Flwrite= new FileWriter(f);
	    		 // Writes the content to the file
	    		Flwrite.write("This\n is\n new\n file\n Test\n file");
	    		Flwrite.flush();
	    		Flwrite.close();
	    		
	    //Create a FileReader Object
	    		FileReader Flread= new FileReader(f);
	    		char []a=new char[50];
	    		Flread.read(a);
	    		for(char c:a){
	    			System.out.print(c);
	    			Flread.close();
	    		}
	    		
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		

	}

}
