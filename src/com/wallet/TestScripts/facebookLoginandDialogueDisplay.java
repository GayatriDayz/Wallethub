package com.wallet.TestScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.wallet.Generic.BaseSelenium;
import com.wallet.UIMap.fbPage;
import com.wallet.Utilities.excelUtility;
import com.wallet.Utilities.excelUtilityg;

import java.io.IOException;

public class facebookLoginandDialogueDisplay extends BaseSelenium {


	String excelPath = System.getProperty("user.dir")+"\\src\\com\\wallet\\TestData\\TestData.xlsx";
	String sheetName = "Sheet1";
	excelUtilityg excelUtility = new excelUtilityg();
	excelUtility excel = new excelUtility(excelPath+"/walletHubLatest/src/com/wallet/TestData/TestData.xlsx", "Sheet1");
	fbPage fb = new fbPage();

	@Test
	public void loginFBandPostMsg() throws InterruptedException, IOException {	
		excelUtility.sheetName = sheetName;
		excelUtility.excelPath = excelPath;
		String userName = excelUtility.getCellData(2,1);
		System.out.println("userName fetched From excel: "+ userName);
		String password = excelUtility.getCellData(3,1);
		System.out.println("password fetched From excel: "+ password);

		navToFb();
		sendKeys(fb.fbusername,userName);
		sendKeys(fb.fbpwd,password);
		click(fb.fbloginbtn);
		scrollDown();
		click(fb.goToGroups);
		click(fb.goToHomePage);
		click(fb.navigateToPostMsg);
		sendKeys(fb.sendkeytoPostdata,"Hello World");
		click(fb.clikonPostBtn);	
	}
}
