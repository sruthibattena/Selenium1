import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class salesforcecss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shrut\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		/*driver.get("http://login.salesforce.com");
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("hello");
		driver.findElement(By.cssSelector("#password")).sendKeys("world");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());
		driver.close();*/
		
		driver.get("http://www.rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'login')]")).sendKeys("sruthi");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("password");
		driver.findElement(By.cssSelector("input[class*='signin']")).click();
	
	}

}
