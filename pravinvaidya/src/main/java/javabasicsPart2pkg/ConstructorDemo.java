package javabasicsPart2pkg;

public class ConstructorDemo {
	
	//name of the constructor should be same as class name
	//constructor will not return values
	//1. Default Constructor
	public ConstructorDemo() 
	{
		System.out.println("I am constructor");
	}
	//2. Parameterized Constructor
	public ConstructorDemo(int a , int b) 
	{
		System.out.println("I am Parameterized constructor");
	}
	
	public ConstructorDemo(String c) 
	{
		System.out.println(c);
	}

	
	public void RegulerMethod()
	{
		System.out.println("I am method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorDemo c = new ConstructorDemo(); //when we create the object then constructor is called
		ConstructorDemo cp = new ConstructorDemo(4,5);
		ConstructorDemo cps = new ConstructorDemo("Hello");
		
		
		System.out.println("I am main method");

	}

}
