package pages;

import org.openqa.selenium.By;

import base.Base;

public class JavaPage extends Base{

	public void openJavaPage() throws InterruptedException {
		driver.findElement(By.xpath("//a[@title='Java Tutorial']")).click();
	}

}
