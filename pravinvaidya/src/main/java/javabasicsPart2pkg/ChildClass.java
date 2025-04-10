package javabasicsPart2pkg;

public class ChildClass extends ParentClass {
	
	public void Gear()
	{
		System.out.println("new engine");  //if we change then it will take from child class
	}
	
	public void Colour()
	{
		System.out.println(colour);  //if we not change then it will take from parent class
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass c = new ChildClass();
		c.Colour();
		c.Breaks(); //if we not change then it will take from parent class
		c.Gear(); //if we change then it will take from child class
	}


}
