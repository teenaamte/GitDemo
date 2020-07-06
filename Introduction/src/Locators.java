import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selenium code
	    //create Driver Object for chrome browser
		//we wil strictly implement methods of WebDiver
		//invoke .exe file first 
		//C:\ChromeDriver
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		/*driver.findElement(By.className("inputtext")).sendKeys("Username");
		driver.findElement(By.id("email")).sendKeys("UserName");
		driver.findElement(By.name("pass")).sendKeys("Enter your Password");
		driver.findElement(By.linkText("Forgotten account?")).click();*/
		//driver.findElement(By.cssSelector("#email")).sendKeys("Email Address"); //css from firefox browser
		driver.findElement(By.cssSelector("input#email.inputtext.login_form_input_box")).sendKeys("Email Address"); //css from chrome browser
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
	}

}