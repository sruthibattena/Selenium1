import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// To Add one item to Cart
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vamsi\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			if (formattedName.contains("Cucumber")) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}

		System.out.println("Pass");
	}

}
