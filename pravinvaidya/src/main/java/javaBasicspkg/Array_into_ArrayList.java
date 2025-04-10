package javaBasicspkg;

import java.util.Arrays;
import java.util.List;

public class Array_into_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] name = {"pravin", "ravi", "pavan"};
		
		List<String> nameArraylist = Arrays.asList(name);
		
		System.out.println(nameArraylist.contains("pavan"));

		//Array have the static size( which we set at starting) and Arraylist have dynamically grow (we can add here)
	}

}
