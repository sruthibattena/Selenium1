import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shrut\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//Getting the count of links in the page.
		System.out.println(driver.findElements(By.tagName("a")).size());
		//Getting the count of links in footer section.
		WebElement footer=driver.findElement(By.cssSelector("#gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		//Getting the count of links in the 1st column of footer section.
		WebElement column1=footer.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]"));
		System.out.println(column1.findElements(By.tagName("a")).size());
		//Clicking all the links in the 1st column.
		for(int i=1;i<column1.findElements(By.tagName("a")).size();i++)
		{
			String newtab1=Keys.chord(Keys.CONTROL,Keys.ENTER);
			column1.findElements(By.tagName("a")).get(i).sendKeys(newtab1);
			Thread.sleep(3000);
		}
		//Getting all the opened link page titles from column1.
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parent=it.next();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			driver.close();
		}
		driver.switchTo().window(parent);
		
		//Getting the count of links in the 2nd column of footer section.
		WebElement column2=footer.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[2]"));
		System.out.println(column2.findElements(By.tagName("a")).size());
		//Clicking all the links in the 2nd column.
		for(int j=1;j<column2.findElements(By.tagName("a")).size();j++)
		{
			String newtab2=Keys.chord(Keys.CONTROL,Keys.ENTER);
			column2.findElements(By.tagName("a")).get(j).sendKeys(newtab2);
			Thread.sleep(3000);
		}
		//Getting all the openedlink page titles from column2.
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			driver.close();
		}
		
		//Getting the count of links in the 3rd column of footer section.
		WebElement column3=footer.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[3]"));
		System.out.println(column3.findElements(By.tagName("a")).size());
		//Getting the count of links in the 4th column of footer section.
		WebElement column4=footer.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[4]"));
		System.out.println(column4.findElements(By.tagName("a")).size());

	}

}
