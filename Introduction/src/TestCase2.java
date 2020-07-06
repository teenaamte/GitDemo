import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selenium code
		//create Driver Object for FireFox browser
		//we wil strictly implement methods of WebDiver
	    //invoke .exe file first 
		//C:\FirefoxDriver - Geckodriver	
				
	    System.setProperty("webdriver.gecko.driver", "C:\\GeckoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());


	}
	
	public void getString() {
		System.out.println("TestCase2");
	}

}
