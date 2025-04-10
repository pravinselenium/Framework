package collectionPKG;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet Treeset linkhashSet - implements Set interface
		//Does not accept duplicate values
		//There is no guarantee elements stored in sequential order
		
		HashSet<String> h = new HashSet<String>();
		h.add("US");
		h.add("UK");
		h.add("INDIA");
		h.add("INDIA");
		h.add("PAKISTAN");
		//System.out.println(h);
		//System.out.println(h.remove("US"));
		//System.out.println(h.isEmpty());
		//System.out.println(h.size());
		
		Iterator<String> it =  h.iterator();
		//it.next(); //use this when we want to print only next one string
		
		while(it.hasNext()) // use this while loop when we want to print all string in HashSet
		{
			System.out.println(it.next());
		}

		
		

	}

}
