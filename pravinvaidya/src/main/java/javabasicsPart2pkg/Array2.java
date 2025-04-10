package javabasicsPart2pkg;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[] arr = new int[5];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		int b[]= {6,7,8,9,10}; //another way for declaring array, this is simple way
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}

	}

}
