

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shrut\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='travel_date']")).click();
		Thread.sleep(3000);
		String months = driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText();
		while(!months.contains("April"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		int count = driver.findElements(By.cssSelector(".day")).size();
		for(int i=0;i<count;i++)
		{
			 String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
			 if(text.equalsIgnoreCase("23"))
			 {
				 driver.findElements(By.className("day")).get(i).click();
				 break;
			 }
			
		}
	}

}
