package TestNGTutorial;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements testNG listeners
public class Listeners implements ITestListener  {
	
	@Override
	public void onTestStart(ITestResult result) {
	    // Code to execute when a test starts
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	    // Code to execute when a test passes
		System.out.println("I successfully executed listeners pass code");
	}

	@Override
	public void onTestFailure(ITestResult result) {
	    // Code to execute when a test fails
		//screenshot code
		System.out.println("I successfully executed listeners fail code"+ result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	    // Code to execute when a test is skipped
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // Code to execute when a test fails but is within success percentage
	}

	@Override
	public void onStart(ITestContext context) {
	    // Code to execute before the suite starts
	}

	@Override
	public void onFinish(ITestContext context) {
	    // Code to execute after the suite finishes
	}


	
}
