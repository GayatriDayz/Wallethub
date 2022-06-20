package com.wallet.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.wallet.Generic.BaseSelenium;
import com.wallet.UIMap.walletInsurancePage;

public class walletPostReviewAndRead extends BaseSelenium {

	walletInsurancePage locators = new walletInsurancePage();
		
	@Test
	public void verifyStarAndClick() throws InterruptedException {
		navToWalletHub();
		scrollDown();
		Thread.sleep(300);		
		moveToElementAndClick(locators.starIcon);		
		click(locators.clickOnDropdown);
		moveToElementAndClick(locators.selectDropValue);
		click(locators.textarea);		
		sendKeys(locators.textarea, "Value added for demo purpose VAlue added for demo purpose VAlue added for demo purpose\"\r\n VAlue added for demo purpose VAlue added for demo purpose");
		click(locators.clickOnSubmit);
				

	}

	@Test
	public void readAddedReview() {		 
		navToWalletHubReadReview();
		 scrollDown();
		 //WebElement tocheckmyreview = driver.findElement(By.xpath("//*[text()=' Your Review']"));
		// String readDesc = driver.findElement(By.xpath("//div[@data-pos='0']")).getText();
		 //String ActualTitle = driver.getTitle();
		 String ExpectedTitle = "Value added for demo purpose VAlue added for demo purpose VAlue added for demo purpose\\\"\\r\\n VAlue added for demo purpose VAlue added for demo purpose";
		 //Assert.assertEquals(ExpectedTitle, ActualTitle);
		
	}
}
