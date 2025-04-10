package Inheritance;

import org.testng.annotations.Test;

public class PS1 extends PS{
	

	@Test
	public void YourMethod() {
		// TODO Auto-generated method stub
		PS2 ps2 = new PS2(3);  //Parameterized constructor
		int a = 3;
		MyMethod(); // taken from parent class
		System.out.println(ps2.Increament());
		System.out.println(ps2.Decreament());
		
		//in the console in gives the result for before method , same if u provide 
		//after method annotation in parent class method then that will also work here
		
		//PS4 ps4 = new PS4(3);
		System.out.println(ps2.multiplybyTwo());
		

	}
	
	

}
