package collectionPKG;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList has a dynamic size where you increase by adding or decrease by removing
		//list interface accept duplicate values (means ArrayList accept duplicate value)
		//ArrayList , linkedList , Vector - implements List interface
		//Array have fixed size where as ArrayList can grow dynamically

		// You can access and insert any value in any index
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Pravin");
		a.add("Ganesh");
		a.add("Ganesh");  //it accept duplicates
	//	System.out.println(a);
		a.add(0,"Vitthal");
	//	System.out.println(a);
		a.remove(0);
	//	System.out.println(a);
		a.remove("Pravin");
	//	System.out.println(a);
	//	System.out.println(a.get(0));
	//	System.out.println(a.contains("Ganesh"));
		a.add("Rahul");
		a.add("Umesh");
		System.out.println(a);
		System.out.println( a.indexOf("Rahul"));
		System.out.println( a.isEmpty());
		System.out.println(a.size());
		
		
		
		
		
		
		
		
		
		


	}

}
