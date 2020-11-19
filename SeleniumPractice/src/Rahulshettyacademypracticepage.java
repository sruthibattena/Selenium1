import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Rahulshettyacademypracticepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		/*driver.findElement(By.cssSelector("#name")).sendKeys("sruthi");
		driver.findElement(By.xpath("//input[contains(@type,'ema')]")).sendKeys("sruthi.battena2@gmail.com");
		driver.findElement(By.cssSelector("button[id*='submit']")).click();*/
		
		//Radio Button Example
		driver.findElement(By.cssSelector("input.radioButton")).click();
		//Suggestion Class Example
		driver.findElement(By.xpath("//input[contains(@class,'inputs')]")).sendKeys("India");
		//Dropdown Example
		driver.findElement(By.xpath("//select[contains(@name,'dropdown')]")).click();
		driver.findElement(By.cssSelector("[value='option2']")).click();
		//Checkbox Example
		driver.findElement(By.xpath("//*[@name='checkBoxOption1']")).click();
		driver.findElement(By.cssSelector("input[value='option2']")).click();
		driver.findElement(By.cssSelector("#checkBoxOption3")).click();
		//Switch Window Example
		driver.findElement(By.cssSelector("button[class*='class1']")).click();
		//driver.close();
		//Switch Tab Example
		driver.findElement(By.linkText("Open Tab")).click();

		
		
		
		
		
		
		
		
		
		
		
	}

}
