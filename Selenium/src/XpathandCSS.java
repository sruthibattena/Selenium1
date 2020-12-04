import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathandCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shrut\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\login.salesforce.com");
		driver.findElement(By.cssSelector("#username")).sendKeys("username");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("password");
		//driver.findElement(By.id("rememberUn")).click();
		driver.findElement(By.cssSelector("#Login")).click();
		System.out.println(driver.findElement(By.id("error")).getText());
		driver.close();

	}

}
