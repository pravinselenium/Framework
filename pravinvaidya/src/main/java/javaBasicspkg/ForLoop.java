package javaBasicspkg;

public class ForLoop {

	private static final char[] str = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int veriable = 5;
		String StringVeriable = "Pravin";
		char CharVerialbe = 'c';
		double doublVeriable = 9.5;
		boolean booleanVeriable = true;
		
		int[] arr = new int[5];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] arr1 = {1,2,3,4,5};
		
		//FOR LOOP
		for (int i = 0; i<arr.length; i++)
		{
			//System.out .println (arr[i]);
			
		}
		
		String[] name = {"Pravin","Ravi","Rohan"};
		for (int p = 0; p<name.length; p++)
		{
		//	System.out.println(name[p]);
		}
		
		//enhanced for loop (same work but simple to write)
		for (String var: name)
		{
			System.out.println(var);
		}
		
		
	}
	

}

