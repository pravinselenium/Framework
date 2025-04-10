package javaBasicspkg;

import java.util.ArrayList;

public class ArrayListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> a = new ArrayList <String>();
		a.add("Pravin");
		a.add("Ravi");
		a.add("Amol");
		a.add("Ganesh");
		
		for (int i  = 0; i<a.size(); i++) 
		{
			//System.out.println (a.get(i));
		}
		
		//enhanced for loop
		for (String val : a)
		{
			System.out.println (val);
		}

		//item present in ArrayList or not
		System.out.println(a.contains("Pravin"));
		
		
	}

}
