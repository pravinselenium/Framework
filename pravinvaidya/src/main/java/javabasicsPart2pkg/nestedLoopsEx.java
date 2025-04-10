package javabasicsPart2pkg;

public class nestedLoopsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int k=1;
		for(int i=0;i<4;i++)  //outer for loop - loop for 4 times
		{
		//	System.out.println(i);
			for(int j=1;j<=4-i;j++)//inner loop - loop for 16 times
			{
				System.out.print( k);  //ln- prints in new line so removed from here
				k++;
				System.out.print("\t");
			}
			System.out.println( "");
		}
		
	}

}
