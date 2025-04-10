package Inheritance;

import org.testng.annotations.Test;

public class PS4 {
	
	int a;
	
	public PS4(int a) {
		// TODO Auto-generated constructor stub
		
		this.a =a;
		
	}

	@Test
	public int multiplybyTwo() 
	{
		// TODO Auto-generated method stub
		 a = a*2;
		 return a;
	}

	@Test
	public int multiplybyThree() 
	{
		// TODO Auto-generated method stub
		 a = a*3;
		 return a;
	}

}
