package demoPKG;

import javabasicsPart2pkg.ParentClass;  //we imported the package here for parent class

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if there are 2 classes from same package then we can create object for any class 
		//but DemoClass - is from demoPKG and ParentClass is from javabasicsPart2pkg
		//in this care we have to import the package then we can create the object
		ParentClass p = new ParentClass();

	}

}
