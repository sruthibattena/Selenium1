import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shrut\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		System.out.println(rowcount);
		int number=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		for(int i=0;i<number-2;i++)
		{
			String text=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int intvalue=Integer.parseInt(text);
			sum=sum+intvalue;
		}
		System.out.println(sum);
		String extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int intextras=Integer.parseInt(extras);
		sum=sum+intextras;
		System.out.println(sum);
		String actualtotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int intactualtotal=Integer.parseInt(actualtotal);
		if(intactualtotal==sum)
		{
			System.out.println("Count matches");
		}
		else
			System.out.println("Count not matches");
	}

}
