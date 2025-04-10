package javabasicsPart2pkg;



public class SuperChild extends SuperParent {
	
	String name = "Child_Variavle";
	public SuperChild() //this is for constructor
	{
		super(); ///this is not coming plz check
		System.out.println("I am child class constructor"); 
	}
	
	public void getVariable() //this is for variable
	{
		System.out.println(name); //without super it calling local variable 
		System.out.println(super.name); //with super keyword it calling parent class variable
	}
	
	public void getMethod() //this is for method
	{
		super.getMethod();
		System.out.println("I am chid class method"); 
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperChild sc = new SuperChild();
		sc.getVariable();
		sc.getMethod();
		
	
		
		
	}

}
