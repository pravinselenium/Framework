package javabasicsPart2pkg;

public class FinalDemo {
	
	

	final void getData()  // can not override final method
	{
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// class name as final - means we can not extends that call (can not take as parent class) (final instead of public)
		final int i = 5;
		// i = 6;  now it will not allow to change the value  
		
	}

}
