package javaBasicspkg;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method m = new Method();
		m.GetData();
		
		String s = m.GetString();
		System.out.println(s);
		
		MethodTwo m2 = new MethodTwo();
		System.out.println(m2.GetmyString());

	}
	
	public void GetData() {
	// void - return type, it can be integer, string)
		System.out.println("hello world");
	
	}
	
	public String GetString() {
		//return type will change here
		return"pravin vaidya";
	}
}
