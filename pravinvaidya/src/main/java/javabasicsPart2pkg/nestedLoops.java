package javabasicsPart2pkg;

public class nestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=4;i++)  //outer for loop - loop for 4 times
		{
			System.out.println("outer loop started");
			for(int j=1;j<=4;j++)//inner loop - loop for 16 times
			{
				System.out.println("inner loop started");
			}
			System.out.println("outer loop finished");
		}
		}

}
