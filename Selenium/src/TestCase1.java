import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shrut\\\\chromedriver.exe");//setting the path to the driver exe file.
		WebDriver driver=new ChromeDriver();//creating an object for the chromedriver class and assigning it to a reference variable 'driver' of webdriver interface.
		driver.get("http:\\www.google.com");//to hit the given url
		System.out.println(driver.getTitle());//to print the current url title
		System.out.println(driver.getCurrentUrl());//to print the current url i.e., to check if we landed on the correct url/not.
		System.out.println(driver.getPageSource());//to print/view the page source if the page source on the UI is disabled.
		driver.navigate().to("http:\\www.facebook.com");//to navigate from google page to facebook page.
		driver.navigate().back();//to navigate from current page to back/previous page.
		driver.navigate().forward();//to navigate from current page to forward/next page.
		driver.close();//it closes the current browser.
	}

}
