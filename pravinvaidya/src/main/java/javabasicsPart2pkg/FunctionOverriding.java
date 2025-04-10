package javabasicsPart2pkg;

public class FunctionOverriding extends ParentClass {
	
	public void AudioSystem()
	{
		System.out.println("new child audio");
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionOverriding f = new FunctionOverriding();
		f.AudioSystem();  //function overriding - both have same method name,same argument count,same type
		
		//its printing - new child audio
		//not taking output from parent class, taking from this class

		

	}

}
