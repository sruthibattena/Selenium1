import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shrut\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.linkText("Gmail")).click();
		//Thread.sleep(3000);
		driver.findElement(By.linkText("Sign in")).click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> id=ids.iterator();
		//String parentid=id.next();
		String childid=id.next();
		driver.switchTo().window(childid);
		driver.findElement(By.id("identifierId")).sendKeys("sruthi.javaui");
		driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sruthi@24");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Keys.ENTER);
	}

}
