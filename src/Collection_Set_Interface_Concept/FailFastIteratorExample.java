package Collection_Set_Interface_Concept;
//Similarities Between HashSet, LinkedHashSet and TreeSet In Java :
//All three doesn’t allow duplicate elements.
//All three are not synchronized.
//All three are Cloneable and Serializable.
//Iterator returned by all three is fail-fast in nature. i.e You will get ConcurrentModificationException if they are modified after the creation of Iterator object.

import java.util.Iterator;
import java.util.TreeSet;

public class FailFastIteratorExample {

	public static void main(String[] args) {
		TreeSet<Integer> list = new TreeSet<Integer>();
		//Adding elements to list
        list.add(1452);
        list.add(6854);
        list.add(8741);
        list.add(6542);
        list.add(3845);
      //Getting an Iterator from list
       Iterator<Integer> it=list.iterator();
       while(it.hasNext()){
    	   System.out.println(it.next());
    	   list.add(123); ////This will throw ConcurrentModificationException
       }
        

	}

}
