package testpackage;  
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;  
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test;  
public class MavenTest1 {  
public String baseUrl = "http://www.google.com/";  
String driverPath = "D:\\SB00561518\\TECHM\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe";  
public WebDriver driver ;   
@Test             
public void test() {      
// set the system property for internet explorer driver      
System.setProperty("webdriver.ie.driver", driverPath);  
// Create driver object for CHROME browser  
driver = new InternetExplorerDriver();  
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
driver.manage().window().maximize();  
driver.get(baseUrl);  
// get the current URL of the page  
String URL= driver.getCurrentUrl();  
System.out.print(URL);  
//get the title of the page  
String title = driver.getTitle();                  
System.out.println(title);  
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