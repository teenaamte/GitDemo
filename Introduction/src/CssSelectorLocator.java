import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "C:\\GeckoDriver\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
	     driver.get("https://login.salesforce.com");
	     System.out.println(driver.getTitle());
	     System.out.println(driver.getCurrentUrl());
	     
	     /* css= [attribute = 'value']
	        xpath = //*[@attribute='value'] */
	    
         driver.findElement(By.cssSelector("[id='username']")).sendKeys("CSS");
         //driver.findElement(By.cssSelector("[id='password']")).sendKeys("123");
         driver.findElement(By.cssSelector("input[id='password']")).sendKeys("123");
         //driver.findElement(By.xpath("//input[@id='Login']")).click();
         driver.findElement(By.cssSelector("#Login")).click(); //#id and .classname also works
	}

}
