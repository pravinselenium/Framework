package TestNGTutorial;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class annotation1 {
	
	@Parameters({"username","password"})
	@Test
    public void Test1(String id,String pass) {
        // TODO Auto-generated method stub
        System.out.println("Test1");
        System.out.println(id);
        System.out.println(pass);
    }

    @DataProvider
    @Test
    public Object[][]  getdata() {
        // SOMETIME WE NEED TO TEST WITH DIFFERENT DATA SET, STUDENT LOGIN, TEACHER LOIN
    	Object [][] data = new Object[2][2];
    	//1st set of id password
    	data[0][0]="ravi";
    	data[0][1]="ravi123";
    	//2nd set of id password
    	data[1][0]="amol";
    	data[1][1]="amol123";
    	return data;
    	
        
        
    }

    @Test(dataProvider="getdata")
    public void Test3(String username,String password) {
        // TODO Auto-generated method stub
        System.out.println("Test3");
        System.out.println(username);
        System.out.println(password);
    }

    @Test
    public void Test4() {
        // TODO Auto-generated method stub
        System.out.println("Test4");
    }

}
