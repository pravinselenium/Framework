package Inheritance;

import org.testng.annotations.Test;

public class PS2 extends PS4
{
	
	int a;  //class variable

	
	public PS2(int a)  //instance variable 
	{
		// TODO Auto-generated constructor stub
		super(a);
		this.a = a;   //this
	}
	@Test
	public int Increament() 
	{
		// TODO Auto-generated method stub
		 a = a+1;
		 return a;
	}
	@Test
	public int Decreament() 
	{
		// TODO Auto-generated method stub
		 a = a-1;
		 return a;
	}
}
