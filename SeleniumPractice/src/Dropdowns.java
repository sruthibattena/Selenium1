import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		 
		/*Static Dropdown
		
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("AED");
		s.selectByIndex(3);
		s.selectByVisibleText("AED"); */
		
		/*driver.findElement(By.cssSelector("#divpaxinfo")).click();
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		driver.findElement(By.cssSelector(".pax-add.pax-enabled")).click();
		driver.findElement(By.id("hrefIncChd")).click();
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText()); */
		
		/*driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		Select s1=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s1.selectByValue("3");
		Select s2=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		s2.selectByVisibleText("2");
		Select s3=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		s3.selectByValue("1");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); */
		
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		//driver.findElement(By.xpath("//*[@value='HYD']")).click();
		//driver.findElement(By.xpath("//*[@value='DEL']")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
