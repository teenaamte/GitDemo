import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://facebook.com");
		
		// //tagName[@attribute='value'] - xpath syntax
		
		/*
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Myown xpath");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		*/
		
		// tagName[attribute='value'] - css syntax
		/*
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Myown css path");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();	
		*/
		
		//tagName#id - css syntax
		
		driver.get("http://login.salesforce.com");
		driver.findElement(By.cssSelector("input#username")).sendKeys("Myown css path");
	}

}
