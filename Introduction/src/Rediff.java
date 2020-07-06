import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("You are in Rediiff.java");
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://rediff.com");
		
		//using regular expressions for css and xpath
		//  //tagName[contains(@attribute,'value')] - xpath
		//  tagName[attribute*='value'] - css
		
		//Using customized css from html attributes
		// tagName#id - css 
		//tagname.classname - css
		
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("hello");
		//driver.findElement(By.cssSelector("input[name*='passwd']")).sendKeys("1234");
		driver.findElement(By.cssSelector("input#password")).sendKeys("1234");
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();


		
			
	}	

}
