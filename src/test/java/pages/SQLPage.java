package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class SQLPage extends Base{
	
	public void openSQLPage() {
		driver.findElement(By.xpath("//a[@title=\"SQL Tutorial\"]")).click();
	}

}
