package com.wallet.TestScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.wallet.Generic.BaseSelenium;
import com.wallet.UIMap.fbPage;
import com.wallet.Utilities.excelUtility;

public class facebookLoginandDialogueDisplay extends BaseSelenium {

	String projectPath = System.getProperty("user.dir");
	//excelUtility excel = new excelUtility("C:\\Automation\\walletHubLatest\\walletHubLatest\\src\\com\\wallet\\TestData\\TestData.xlsx", "Sheet1");
	
	excelUtility excel = new excelUtility(projectPath+"/walletHubLatest/src/com/wallet/TestData/TestData.xlsx", "Sheet1");
	fbPage fb = new fbPage();

	
	
	
	@Test
	public void loginFBandPostMsg() throws InterruptedException{
		 
		//String projectPath = System.getProperty("user.dir");
		excelUtility excel = new excelUtility("C:\\Automation\\walletHubLatest\\walletHubLatest\\src\\com\\wallet\\TestData\\TestData.xlsx", "Sheet1");
		
		//excelUtility excel = new excelUtility(projectPath+"/walletHubLatest/src/com/wallet/TestData/TestData.xlsx", "Sheet1");
		System.out.println(excel.getCellDataString(1, 1));
		
//		navToFb();		
//		sendKeys(fb.fbusername,"gayatridayz@gmail.com");
//		sendKeys(fb.fbpwd,"Gayatri@2808");
//		click(fb.fbloginbtn);
//		scrollDown();
//		click(fb.goToGroups);
//		click(fb.goToHomePage);		
//		click(fb.navigateToPostMsg);			
//		sendKeys(fb.sendkeytoPostdata,"Hello World");		
//		click(fb.clikonPostBtn);				
//		Thread.sleep(3000);	
		

	}

	

}
