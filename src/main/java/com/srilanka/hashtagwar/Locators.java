package com.srilanka.hashtagwar;

import org.openqa.selenium.By;

public class Locators {
	
	public static By txtUsername = By.xpath("//input[@id=\"email\"]");
	
	public static By txtPassword = By.xpath("//input[@id=\"pass\"]");
	
	public static By btnLogin = By.xpath("//button[@name=\"login\"]");
	
	public static By txtCommentBox = By.xpath("//div[@aria-label=\"Write a comment\"]");
	
	public static By txtPostBox = By.xpath("//span[contains(text(), \"What's on your mind\")]");
	
	public static By txtPostWindowBox = By.xpath("//div[contains(@aria-label,\"What's on your mind\")]");
	
	public static By btnPrivacy = By.xpath("//div[contains(@aria-label,\"Edit privacy. Sharing with\")]");
	
	public static By btnRadioPublic = By.xpath("//div[@role=\"radio\"]//span[contains(text(), \"Public\")]");
	
	public static By btnPost = By.xpath("//span[contains(text(), \"Post\")]");

}
