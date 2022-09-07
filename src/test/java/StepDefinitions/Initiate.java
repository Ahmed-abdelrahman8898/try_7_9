package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Initiate {

	public static WebDriver driver;
	public static WebDriverWait wait ;
	
	@Before()
	public void startdriver() {
		
		String D="chrome";
		
		if (D.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else if(D.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		String Url ="https://en.zalando.de/";
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//pages intit
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		 driver.navigate().to(Url);
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}

	@After()
	
	public void takeScreenshotOnFailure(Scenario scenario) {
		
		if (scenario.isFailed()) {
			
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png","");
		}
		//try remove the wait to check the error of socet
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		
		driver.quit();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		
	}
	public static WebDriver getDriver() {
        return driver;
      }
	
	
	
	
	
	
}
