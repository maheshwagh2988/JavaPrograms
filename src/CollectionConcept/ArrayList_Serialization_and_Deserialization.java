package CollectionConcept;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class ArrayList_Serialization_and_Deserialization {

	public static void main(String[] args) {
		
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("Ravi");
		ar.add("Tanya");
		ar.add("Constance");
		
		//Serialization  
		try{
		FileOutputStream fos= new FileOutputStream("file");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(ar);
		fos.close();
        //Deserialization  
		FileInputStream fis=new FileInputStream("file");  
        ObjectInputStream ois=new ObjectInputStream(fis);  
        
       ArrayList<String> list=(ArrayList<String>) ois.readObject();
       System.out.println(list);
		
		
		}catch(Exception e)  
        {  
            System.out.println(e);  
        }  

	}

}
