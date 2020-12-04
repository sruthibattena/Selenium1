import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shrut\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement table=driver.findElement(By.xpath("//table[@id='product']"));
		int rowcount=table.findElements(By.tagName("tr")).size();
		System.out.println(rowcount);
		int colcount=table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size();
		System.out.println(colcount);
		List<WebElement> secondrowtext=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(secondrowtext.get(0).getText());
		System.out.println(secondrowtext.get(1).getText());
		System.out.println(secondrowtext.get(2).getText());
		//System.out.println(table.findElement(By.cssSelector("tbody tr:nth-child(3)")).getText());
	}

}
