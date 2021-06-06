package testcases;

import org.testng.annotations.Test;

import base.Base;
import pages.JavaPage;
import pages.SQLPage;

public class JavaTestCases  extends Base{
	
	JavaPage homePage = new JavaPage();
//	SQLPage sqlPage = new SQLPage();
	
	@Test
	public void verifyJavaPageIsOpening() throws InterruptedException {
//		launchURL();
		homePage.openJavaPage();
//		sqlPage.openSQLPage();
	}
	
//	@Test
	public void verifySQLPageIsOpending() {
//		sqlPage.openSQLPage();
	}

}
