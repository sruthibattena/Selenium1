import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vamsi\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.id("fromPlaceName")).sendKeys("hyd");
		/*System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
		System.out.println(driver.findElement(By.id("fromPlaceName")).getText());*/
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script="return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		while(!text.equalsIgnoreCase("hyderabad"))
		{
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			text=(String) js.executeScript(script);
			System.out.println(text);
			
		}
		
		
		

	}

}
