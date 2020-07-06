import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlexpathparent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Identify xpath with Parent Child Traverse relationship 
		
		driver.get("http://google.com");
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("rediff");
		driver.findElement(By.xpath("//div[@id='gbw']/div/div/div/div[2]/a")).click();

	}

}
