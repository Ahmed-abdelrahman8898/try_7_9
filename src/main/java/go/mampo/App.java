package go.mampo;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
	static ChromeDriver driver;
	static Pages.Page1 page1;

	public static void main( String[] args )
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.navigate().to("https://www.amazon.com/");
		
		driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']")).click();







	}
}
