package javabasicsPart2pkg;

public class AustralianTrafic implements CentralTraffic, ContinentalTrafic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a= new AustralianTrafic ();
		a.greenGo();
		a.redStop();
		a.flashYellow();
	
		AustralianTrafic b= new AustralianTrafic ();
		b.walkOnRoad();
		
		ContinentalTrafic c= new AustralianTrafic ();
		c.trainSymbol();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("goGreen implementation");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redStop implementation");
		
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flashYellow implementation");
		
	}
	
	public void walkOnRoad() {
		// TODO Auto-generated method stub
		System.out.println("walkOnRoad");
		
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("trainSymbol");
		
	}
	

}
