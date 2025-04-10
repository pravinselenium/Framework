package TestNGTutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {

    @Test(groups = {"my group"})
    public void demo1() {
        // TODO Auto-generated method stub
        System.out.println("Personal Loan 1");
    }

    @Parameters({"URL"})
    @Test(groups = {"my group"})
    public void demo2(String urlname) {
        // TODO Auto-generated method stub
        System.out.println("Personal Loan 2");
        System.out.println(urlname);
    }

    @BeforeMethod
    public void beforemethod() {
        // TODO Auto-generated method stub
        System.out.println("before every method in this class");
    }

    @AfterMethod
    public void aftermethod() {
        // TODO Auto-generated method stub
        System.out.println("after every method in this class");
    }
}
