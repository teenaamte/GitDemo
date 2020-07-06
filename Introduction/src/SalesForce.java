import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selenium code
	    //create Driver Object for chrome browser
		//we wil strictly implement methods of WebDiver
		//invoke .exe file first 
		//C:\ChromeDriver
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("UserName");
		driver.findElement(By.name("pw")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
	}

}
