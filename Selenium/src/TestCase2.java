import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setting path for the driver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\geckodriver.exe");
		
		/* WebDriver is an Interface in Selenium
		> FirefoxDriver is a Class in Selenium
		> In the below statement, we have created an object for FirefoxDriver class using new keyword and assigned the created object to the reference variable of WebDriver interface.
		The reason behind using WebDriver instead of FirefoxDriver in the below statement is, we can create a reusable method for launching the desired browser by passing the browser 
		name to the reusable method.*/
		
		WebDriver driver=new FirefoxDriver();
		
		//Getting Facebook URL for the above opened browser i.e.,firefox
		driver.get("http:\\www.facebook.com");
		
		//getting the title of the above opened facebook page and printing it
		System.out.println(driver.getTitle());
		
		//closing the firefox browser
		driver.close();

	}

}
