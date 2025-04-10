package javabasicsPart2pkg;

public class thisDemo {
	
	int a = 2;
	
	public void getData()
	{
		int a= 3;
		System.out.println(a);
		System.out.println(this.a); //if i want global variable in my method when both variable with same name, then i have to use this keyword
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisDemo t = new thisDemo();  //class object should be created in main method
		t.getData();
		
	}

}
