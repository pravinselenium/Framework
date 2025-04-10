package javabasicsPart2pkg;

public class ChildAirIndia extends ParentAirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildAirIndia a = new ChildAirIndia();
		a.engine();
		a.saftyGuidelines();
		a.bodyColour();
		//we can not create object or instantaniate for the class which declare as abstract
		//ParentAirCraft p = new ParentAirCraft();

	}

	@Override
	public void bodyColour() {
		// TODO Auto-generated method stub
		System.out.println("red color to body");
		
	}

}
