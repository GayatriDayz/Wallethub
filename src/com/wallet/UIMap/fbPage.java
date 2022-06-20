package com.wallet.UIMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fbPage {
	
	public By fbusername = By.xpath("//input[@id='email']");
	public By fbpwd = By.xpath("//input[@id='pass']");
	public By fbloginbtn = By.xpath("//button[@name=\"login\"]");
	public By navigateToPostMsg = By.xpath("//span[contains(text(),\"What's on your mind, Gayatri?\")]");
	public By sendkeytoPostdata = By.xpath("//p[@class='i1ao9s8h hcukyx3x oygrvhab cxmmr5t8 kvgmc6g5']");	
	public By clikonPostBtn =  By.xpath("//span[contains(text(),'Post')]");
	public By goToHomePage = By.xpath("//a[@aria-label='Home']//*[local-name()='svg']");			
	public By goToGroups = By.xpath("//a[@aria-label='Groups']//*[local-name()='svg']");
	
	

}
