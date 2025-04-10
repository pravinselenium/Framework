package javabasicsPart2pkg;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 0;
		
		try
		{
			
			int c = a/b;
		}
		
		
		catch(ArithmeticException et)
		{
			
			System.out.println("i catched the Arithmetic exception");  
		}
		
		//when there is try block then only we can write the finally block
		finally
		{
			
			System.out.println("delete cockies or close brouser");//This block is executed irrespective of exception Throne or not
			//In practical example - We use this code to delete the cookies or close the browser after execution of automation script
			//When we stop execution forcefully, then only finally block will not execute otherwise it will execute every time
		}

	}

}
