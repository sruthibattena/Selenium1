import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Traversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shrut\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.linkText("Images")).click();
		//driver.findElement(By.xpath("//div[@id='gbw']/div/div/div/div[2]/a")).click();
		//driver.findElement(By.cssSelector("div.gb_ke gb_i gb_Ig gb_yg")).click();
		//driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hello");
		//driver.findElement(By.xpath("//body/div[@id='viewport']/div[@id='gb']/div[@id='gbw']/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
		//driver.findElement(By.xpath("//header/div[1]/div[2]/nav[1]/ul[1]/li[4]/following-sibling::li[2]")).click();
		driver.findElement(By.xpath("//*[text()='About']")).click();
		
		
		
		
		
		
		

	}

}
