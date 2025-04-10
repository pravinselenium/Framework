package javabasicsPart2pkg;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 try block can be followed by multiple catch block
		//catch should be be an immediate  block after try 
		int a = 1;
		int b = 0;
		
		try
		{
			//in practical ex. purchase process fail
			int c = a/b;
		}
		
		// WE CSN WRITE MULTIPLE CATCH BLOCK BUT WHICH IS CORRECT IT WILL SHOW THAT(HERE ITS A ARITHIMATCIK EXCEPTION)
		catch(ArithmeticException et)
		{
			//reply u will get - retry again
			System.out.println("i catched the Arithmetic exception");  //here it will show the exception
		}
		
		catch(Exception e)  //Parent block - accept everything if there is no specific blocks created
		{
			//reply u will get - retry again
			System.out.println("i catched the ERROR/exception");  //here it will show the exception
		}
		
		/*int c = a/b;
		System.out.println(c);*/   // HERE IT WILL THROUGH THE ERROR
		
		//Ex of more exception
		/*ArrayIndexOutOfBoundsException
		Occurs When: Trying to access an invalid index in an array.

		Example:

		java
		Copy code
		int[] numbers = {1, 2, 3};
		System.out.println(numbers[5]); // Causes ArrayIndexOutOfBoundsException
		
		IOException
		Occurs When: An input-output operation fails, like file not found.

		Example:

		java
		Copy code
		FileReader file = new FileReader("nonexistent.txt"); // Causes IOException
		
		FileNotFoundException
		Occurs When: Trying to open a file that does not exist.

		Example:

		java
		Copy code
		File file = new File("unknown.txt");
		FileReader fr = new FileReader(file); // Causes FileNotFoundException
		
		InterruptedException
		Occurs When: A thread is interrupted while waiting or sleeping.

		Example:

		java
		Copy code
		Thread.sleep(5000); // If interrupted, causes InterruptedException */
		

	}

}
