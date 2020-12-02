import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ecommerce2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//To Add multiple items to Cart
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vamsi\\chromedriver.exe");
		String[] veggies= {"Cucumber","Carrot","Tomato"};
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addMultiple(driver,veggies);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button[text()='PROCEED TO CHECKOUT']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}
	public static void addMultiple(WebDriver driver,String[] veggies)
	{
	int j=0;
		List<WebElement> names=driver.findElements(By.cssSelector("h4.product-name"));
	for(int i=0;i<names.size();i++)
	{
		String[] product=names.get(i).getText().split("-");
		String formatProductName=product[0].trim();
		List<String> veggiesList=Arrays.asList(veggies);
		if(veggiesList.contains(formatProductName))
		{
			j++;
			//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			//Thread.sleep(5000);
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			//if(j==veggies.length);
			if(j==veggiesList.size())
			{
				break;
			}
		}
	}
	}
}

	
