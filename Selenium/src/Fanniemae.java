import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fanniemae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shrut\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fanniemae.com/");
		driver.findElement(By.xpath("//*[@class='fas fa-search fm-toggle-search']")).click();
		driver.findElement(By.cssSelector("input[form*='coveo']")).sendKeys("Mortgage");
		
		driver.findElement(By.xpath("//svg[@class='coveo-search-button-svg']")).click();
		

		
		
		
		
		
		
		
	}

}
