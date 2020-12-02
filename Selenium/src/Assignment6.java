import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vamsi\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String grabbedtext = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(grabbedtext);
		Thread.sleep(3000);
		Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(grabbedtext);
		driver.findElement(By.id("name")).sendKeys(grabbedtext);
		Thread.sleep(3000);
		driver.findElement(By.id("alertbtn")).click();
		String alerttext = driver.switchTo().alert().getText();
		if(alerttext.contains(grabbedtext))
		{
			driver.switchTo().alert().accept();
			System.out.println("Correct Text");
		}
		else
			System.out.println("Test Failed");
		
		
		}
}
