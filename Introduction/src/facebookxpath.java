import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.facebook.com");
		/*driver.findElement(By.xpath("//input[@id='email']")).sendKeys("enteremail");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@type='submit']")).click();*/
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("enteremail");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("password");
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}

}
