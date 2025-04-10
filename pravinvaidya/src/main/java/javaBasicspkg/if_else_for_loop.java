package javaBasicspkg;

public class if_else_for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,6,1,7,9};
		
		for (int i = 0; i < arr.length; i++)

		{
			if (arr[i] % 2 == 0)
			{
				System.out.println(arr[i]);
				//break;
			}
		
			else
			{
				System.out.println(arr[i] + "is not devided by 2");
			}
		}

	}

}
