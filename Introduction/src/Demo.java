import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selenium code
	    //create Driver Object for chrome browser
		//we wil strictly implement methods of WebDiver
		//invoke .exe file first 
		//C:\ChromeDriver
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());  // validate your page title 
		System.out.println(driver.getCurrentUrl());  //validate if u r landed on correct url
		// System.out.println(driver.getPageSource());  //print source
		
		driver.get("http://yahoo.com");
		System.out.println(driver.getTitle());  // validate your page title
		System.out.println(driver.getCurrentUrl());  //validate if u r landed on correct url
		
		driver.navigate().back();
		System.out.println(driver.getTitle());  // validate your page title
		System.out.println(driver.getCurrentUrl());  //validate if u r landed on correct url
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());  // validate your page title
		System.out.println(driver.getCurrentUrl());  //validate if u r landed on correct url
		
		driver.close();//It closes current browser
		//driver.quit();//It closes all the browser opened by selenium script
	}

}
