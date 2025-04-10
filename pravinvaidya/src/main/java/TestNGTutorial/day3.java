package TestNGTutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {

	
		// TODO Auto-generated method stub
		 @Test
			public void demo5() 
		    {
				// TODO Auto-generated method stub\
				System.out.println("Home Loan 1");
		    }
		    @Test
			public void demo6() 
		    {
				// TODO Auto-generated method stub\
				System.out.println("Home Loan 2");
		    }
		    @BeforeSuite
			public void beforesuite() 
		    {
				// TODO Auto-generated method stub\
				System.out.println("execute before suite");
		    }
		    @Test
			public void exclude() 
		    {
				// TODO Auto-generated method stub\
				System.out.println("Home Loan 3");
		    }

		    @BeforeClass
			public void beforecls() 
		    {
				// TODO Auto-generated method stub\
				System.out.println("before class");
		    }
		    @AfterClass
			public void aftercls() 
		    {
				// TODO Auto-generated method stub\
				System.out.println("after class");
		    }
	

}
