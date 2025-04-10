package javaBasicspkg;

public class string_in_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is an object, with a sequence of characters
		
				//String by literal
				//is this case it will not create new object in java space, st1 will point out to st
				//String st = "Pravin Vaidya";
				//String st1 = "Pravin Vaidya";
			//	System.out.println (st1);
				
				//new (second type to write String)
				//String s = new String("Welcome");
				//String s2 = new String("Welcome");
				//-------------------------------------------------------------------------------------
				String st = "Pravin Vaidya";
				//String[] splittedsring = st.split(" "); //it becomes Array
				//System.out.println(splittedsring [0]);
				//System.out.println(splittedsring [1]);
				
			//split by providing the word of string
				String pra  = "Pune Mumbai Nagpur";
				String[] split = pra.split("Mumbai");
				System.out.println(split [0]);
				//System.out.println(split [1]);
				System.out.println(split[1].trim());
				
				//print the characters
				for(int i = 0; i<pra.length(); i++)
				{
			//	System.out.println(pra.charAt(i));
				}
				
				//reverse characters
				for(int i = pra.length()-1; i>=0; i--)
				{
					System.out.println(pra.charAt(i));
				}
				
			
	}

}
