package javabasicsPart2pkg;

public class MultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int [2][3]; //row, column count
		a[0][0] = 2;   //first bracket is for row       
		a[0][1] = 4;                                     // 2 4 5
		a[0][2] = 5;                                     // 3 4 7
		a[1][0] = 3;                                     
		a[1][1] = 4;
		a[1][2] = 7;
		
	// System.out.println(a[0][2]);
		
		// int b [][] = {{1,2,3},{4,5,6}}; //another way to write it
		
		for (int i=0;i<2;i++)  //row
		{
			 for (int j=0;j<3;j++)   //column
			 {
				System.out.println( a[i][j]);
			 }
		}
		
		
				
	
	}

}
