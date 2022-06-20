package com.wallet.Generic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.wallet.Utilities.excelUtility;

//import com.wallet.TestScripts.WebDriverWait;


public class BaseSelenium {
	
	public static int defaultWaitPeriod;
	public static WebDriver driver;
	private Properties properties;
	protected final String propertyFilePath= "C:/Automation/walletHubLatest/walletHubLatest/src/com/wallet/Configuration/Configuration.properties";
			
				
	@BeforeSuite(alwaysRun = true)
	public void ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
		
	@BeforeTest(alwaysRun = true)
	 public void setupBeforeSuite() throws Exception{
		//String readFromConfigFile = System.getProperty("user.dir")+ "/src/com/wallet/Configuration/walletHub-configuration.properties";
		
		//properties = new Properties();
		String BrowserURL = properties.getProperty("BrowserURL");
		String BrowserName = properties.getProperty("BroserName");
		String DriverPath = properties.getProperty("DriverPath");
		
		if(BrowserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", DriverPath);
			driver = new FirefoxDriver();
		}		 
		else if(BrowserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", DriverPath);
			driver = new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Internet Explorer")) {
			System.setProperty("webdriver.ie.driver", DriverPath);
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		//driver.get(BrowserURL);
	 }
	
		
	 public void moveToElementAndClick(By ele)
	  {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ele));
		 Actions action = new Actions(driver);
		 WebElement actionName = driver.findElement(ele);
		 action.moveToElement(actionName).click().perform();
	   
	  }
	 
	
	public void click(By by) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.elementToBeClickable(by));
		driver.findElement(by).click();
		Thread.sleep(1000);
		
	}
	

	
	public void sendKeys(By by, String data) {
		WebElement sendVal = driver.findElement(by);	
		sendVal.sendKeys(data);
	}
	
	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;		 
	    js.executeScript("window.scrollBy(100,450)");
	}
	
	@AfterClass
   	public void quitDown() {
          	driver.quit();
   	}
	
	public void navToFb() {
		driver.get("https://www.facebook.com/");
	}
	
	public void navToWalletHub()
	{
		driver.get("https://wallethub.com/profile/test-insurance-company-13732055i");
	}
	
	public void navToWalletHubReadReview()
	{
		driver.get("https://wallethub.com/profile/test-insurance-company-13732055i");
	}
	
}
	
	


