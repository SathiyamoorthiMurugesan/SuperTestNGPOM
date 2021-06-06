package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class JavaPage extends Base{
	
//	public JavaPage(WebDriver driver) {
////		driver = super.getDriver();
//		driver = super.driver;
//	}
	

	public void openJavaPage() throws InterruptedException {
//		launchURL();
		getDriver().findElement(By.xpath("//a[@title='Java Tutorial']")).click();
	}

}
