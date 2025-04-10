package TestNGTutorial;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 
{

		// TODO Auto-generated method stub
            
	        @AfterTest
		    public void after() 
	        {
			// TODO Auto-generated method stub\
			System.out.println("execute after");
	        }
	        @AfterSuite
			public void beforesuite() 
		    {
				// TODO Auto-generated method stub\
				System.out.println("execute after suite");
		    }
	 
		    @Test (dependsOnMethods={"aemo4"})
			public void demo3() 
		    {
				// TODO Auto-generated method stub\
				System.out.println("Car Loan 1");
		    }
		    @Test 
			public void aemo4() 
		    {
				// TODO Auto-generated method stub\
				System.out.println("Car Loan 2");
		    }
		    @BeforeTest (enabled=false)
			public void before() 
		    {
				// TODO Auto-generated method stub\
				System.out.println("execute before");
		    }


}
