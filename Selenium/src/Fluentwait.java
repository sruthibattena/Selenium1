import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vamsi\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		
		Wait<WebDriver> w=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		WebElement e=w.until(new Function<WebDriver,WebElement>()
				{
			public WebElement apply(WebDriver driver)
			{
				if(driver.findElement(By.xpath("//h4[text()='Hello World!']")).isDisplayed())
				{
					return driver.findElement(By.xpath("//h4[text()='Hello World!']"));
				}
				else
					return null;
			}
				});
		
		System.out.println(driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText());
	}

}
