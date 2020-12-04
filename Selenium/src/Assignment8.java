import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shrut\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String text="return document.getElementById(\"autocomplete\").value;";
		String jstext=(String) js.executeScript(text);
		while(!jstext.equalsIgnoreCase("United States (USA)"))
		{
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			jstext=(String) js.executeScript(text);
		}
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
		System.out.println(jstext);
		
		/*driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));*/
	}

}
