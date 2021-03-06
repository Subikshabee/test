package testpackage;  
import static org.testng.AssertJUnit.assertEquals;
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;  
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test;  
public class MavenTest1 {  
public String baseUrl1 = "http://www.google.com/";  
public String baseUrl2 = "https://twingo.techmahindra.com/";  
String driverPath = "IEDriverServer.exe";  
public WebDriver driver ;   
@Test(enabled=false)            
public void test() {      
// set the system property for internet explorer driver      
System.setProperty("webdriver.ie.driver", driverPath);  
// Create driver object for CHROME browser  
driver = new InternetExplorerDriver();  
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
driver.manage().window().maximize();  
driver.get(baseUrl1);  
// get the current URL of the page  
String URL= driver.getCurrentUrl();  
System.out.print(URL);  
//get the title of the page  
String title1 = driver.getTitle(); 
String expectedtitle1 = "Google";
Assert.assertEquals(title1,expectedtitle1);
System.out.println(title1);  
}     
@Test
public void twingo() {      
	// set the system property for internet explorer driver      
	System.setProperty("webdriver.ie.driver", driverPath);  
	// Create driver object for CHROME browser  
	driver = new InternetExplorerDriver();  
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
	driver.manage().window().maximize();  
	driver.get(baseUrl2);  
	// get the current URL of the page  
	String URL= driver.getCurrentUrl();  
	System.out.print(URL);  
	//get the title of the page  
	String title2 = driver.getTitle(); 
	String expectedtitle2 = "Sign in to your account";
	Assert.assertEquals(title2,expectedtitle2);
	System.out.println(title2);  
	}     
@BeforeTest  
public void beforeTest() {    
System.out.println("before test");  
}     
@AfterTest  
public void afterTest() {  
driver.quit();  
System.out.println("after test");  
}         
}  
