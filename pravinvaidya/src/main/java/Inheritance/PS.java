package Inheritance;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PS {

	@Test
	public void MyMethod() {
		// TODO Auto-generated method stub
		System.out.println("Parent class method executed");

	}
	@BeforeTest
	public void MySecondMethod() {
		// TODO Auto-generated method stub
		System.out.println("Before Test");
	}

}
