import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitandExplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vamsi\\chromedriver.exe");
		String[] veggies= {"Cucumber","Carrot","Tomato"};
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver,5);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		addItems(driver,veggies);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Code applied ..!']")));
		System.out.println(driver.findElement(By.xpath("//span[text()='Code applied ..!']")).getText());
		
	}

	public static void addItems(WebDriver driver,String[] veggies)
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
