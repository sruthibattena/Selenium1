//import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\shrut\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.navigate().to("https://www.netflix.com/login");
		/*driver.findElement(By.id("email")).sendKeys("my first email");
		driver.findElement(By.name("pass")).sendKeys("Pass123");
		driver.findElement(By.linkText("Forgot Password?")).click();*/
		/*driver.findElement(By.name("userLoginId")).sendKeys("email");
		driver.findElement(By.id("id_password")).sendKeys("helloworld");
		driver.close();*/

		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\shrut\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("sruthi.battena2@gmail.com");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		driver.findElement(By.name("password")).sendKeys("Sruthi@24");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();*/
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shrut\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.udemy.com");
		driver.findElement(By.xpath("Log in"));
		
	
	}

}
