import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vamsi\\\\chromedriver.exe");
		//String text = "Sruthi";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  driver.findElement(By.id("autosuggest")).sendKeys("in"); 
		  //Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.cssSelector(".ui-menu-item")); 
		  for(WebElement oneoption:options) 
		  { 
			  if(oneoption.getText().equalsIgnoreCase("india")) 
			  {
				  oneoption.click(); 
				  break; 
				  } 
			  }
		  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); 
		 driver.findElement(By.cssSelector("a[value='HYD']")).click();
		 //Thread.sleep(2000); 
		 driver.findElement(By.xpath("//body[1]/form[1]/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[3]/div[1]/div[1]/ul[1]/li[6]/a[1]")).click();
		  //driver.findElement(By.xpath("//body/ul[@id='ui-id-1']/li[15]")).click();
		  //driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
		  driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		  if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		  {
		  System.out.println("Is Disabled"); Assert.assertTrue(true);
		  } 
		  else 
		  {
		  System.out.println("Is Enabled"); 
		  Assert.assertTrue(false); 
		  }
		  driver.findElement(By.id("divpaxinfo")).click(); 
		  //Thread.sleep(2000);
		  int i; 
		  for(i = 1;i<5;i++) 
		  {
		  driver.findElement(By.id("hrefIncAdt")).click(); 
		  }
		  driver.findElement(By.id("hrefIncChd")).click();
		  driver.findElement(By.xpath("//*[@value='Done']")).click();
		  System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); 
		  Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		  s.selectByValue("USD");
		  driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		  Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		  System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		  driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		

		/*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss(); */

	}

}
