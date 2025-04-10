package javabasicsPart2pkg;

public class InterviewMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc[][] = {{2,4,5},{3,2,10},{1,2,2}};                                       //2 4 5
		int min= abc[0][0]; //3 4 7
	                                                                       	 //1 2 9
		
	    for(int i=0;i<3;i++)  //row
		{
			for (int j=0;j<3;j++)  //column
			{
				if(abc[i][j]<min)
				{
					min = abc[i][j];
					
				}
			}
		}
	    System.out.println(min);
	    
	    }
		
	}   



