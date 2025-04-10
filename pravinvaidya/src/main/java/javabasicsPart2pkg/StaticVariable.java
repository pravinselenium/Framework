package javabasicsPart2pkg;

public class StaticVariable {
	
	String name;  //instance variable
	String address;
	static String city = "pune"; //when we make any variable as static then that is part of class so now it will not change as per created object
	//so above variable is class variable
	static int i =0;
	
	//we can initialize static variable in block
	//static 
	//{ i = 0;
	// city = "pune";       }
	
	StaticVariable(String name, String address)  //variable belongs to constructor is local variable
	{
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
		
			
	}
	
	public void getAddress()
	{
		System.out.println(address +" "+ city);
	}
	
	public static void getCity()
	{
		System.out.println( city);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable s = new StaticVariable("pravin", "chikalthana");
		StaticVariable sv = new StaticVariable("ravi", "ramnagar");
		s.getAddress();
		sv.getAddress();
		
		//static methods can be directly called by class name
		StaticVariable.getCity();
		
				
		
		
		
		

	}

}
