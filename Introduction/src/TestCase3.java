import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selenium code
		//create Driver Object for Internet browser
		//we wil strictly implement methods of WebDiver
	    //invoke .exe file first 
		//C:\MicrosoftWebDriver - MicrosoftWebDriver	
				
	    System.setProperty("webdriver.ie.driver", "C:\\MicrosoftWebDriver\\MicrosoftWebDriver.exe");
	    //System.setProperty("webdriver.ie.driver","C:\\MicrosoftWebDriver\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());


	}
	
	public void getString() {
		System.out.println("TestCase3");
	}

}
