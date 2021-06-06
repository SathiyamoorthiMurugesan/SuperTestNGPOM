package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class SQLPage extends Base{
	
	public SQLPage(WebDriver driver) {
//		driver = super.getDriver();
		driver = super.driver;
	}

	public void openSQLPage() {
		driver.findElement(By.xpath("//a[@title=\"SQL Tutorial\"]")).click();
	}

}
