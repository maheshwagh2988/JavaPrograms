package Collection_propertiesFiles_Concept;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;



public class Properties_class {
	
	public static void main(String[] args) throws Exception {
		//FileReader reader= new FileReader("D:\\Automation\\Automation_Project\\JavaPrograms\\bin\\Collection_propertiesFiles_Concept\\db.properties");
		FileReader reader1= new FileReader("..//JavaPrograms//src//Collection_propertiesFiles_Concept//db.properties");
		Properties p= new Properties();
		p.load(reader1);
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
		
		System.out.println("**************************************");
		
		//Properties class to get all the system properties
		Properties p1= System.getProperties();
		Set set=p1.entrySet();
			Iterator it=set.iterator();
			while(it.hasNext()){
				 Entry pr=(Entry) it.next();
				 System.out.println(pr.getKey()+" "+pr.getValue());
			}
		
		
		

	}

}
