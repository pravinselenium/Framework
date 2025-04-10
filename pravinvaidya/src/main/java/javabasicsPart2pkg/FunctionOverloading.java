package javabasicsPart2pkg;

public class FunctionOverloading {
	//function overloading
	//1. either argument count should be different
	//2. or argument data type should be different
	
	public void getData(int a) //data type different
	{
		System.out.println(a);
	}
	
	public void getData(String a)  //data type different
	{
		System.out.println(a);
	}
	
	public void getData(int a, int b)  //argument type is different
	{
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionOverloading g = new FunctionOverloading();
		g.getData(1);
		g.getData("pravin");
		g.getData(2, 3);
	}

}
