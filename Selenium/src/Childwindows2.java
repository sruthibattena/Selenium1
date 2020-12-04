import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindows2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shrut\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.linkText("Help")).click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> id=ids.iterator();
		String parentid=id.next();
		String childid=id.next();
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.xpath("//div[text()='How can we help you?']")).getText());
		driver.close();
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
	}

}
