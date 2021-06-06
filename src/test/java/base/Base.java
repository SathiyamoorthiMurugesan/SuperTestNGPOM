package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	
	@BeforeTest
	public void launchURL() {
		WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
//	     getDriver().get("https://www.w3schools.com/html/");
//	     getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	     getDriver().manage().window().maximize();
	     
	     driver.get("https://www.w3schools.com/html/");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	}

	public WebDriver getDriver() {
		return driver;
	}
	
}
