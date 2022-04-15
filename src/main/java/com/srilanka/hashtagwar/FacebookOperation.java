package com.srilanka.hashtagwar;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookOperation {
	
	WebDriver driver;
	
	public void loginFaceBook(String userName,String Password) {
		

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		String baseUrl = "https://facebook.com/";
		
		driver.get(baseUrl);
		
		driver.manage().window().maximize();
		
		
		driver.findElement(Locators.txtUsername).sendKeys(userName);
		driver.findElement(Locators.txtPassword).sendKeys(Password);
		driver.findElement(Locators.btnLogin).click();

		sleep(6000);
		
	}
	
	public void commentPost(String postURL,int commentCount) {
		
		driver.navigate().to(postURL);
		sleep(6000);
		
		for(int i=0;i<commentCount;i++) {
			driver.findElement(Locators.txtCommentBox).click();
//			driver.findElement(Locators.txtCommentBox).sendKeys("#GoHomeGota2022\n");
			driver.findElement(Locators.txtCommentBox).sendKeys("#ArrestRajapakshas #GiveOurStolenMoneyBack #GoHomeGota2022 #Anonymous #anonymoushackers #anonymousforthevoiceless #helpless #SaveSriLanka #findstolenmoney #PeoplesMoney #itspeople #SaveTheChildren #savethefuture #savemymotherland #GotaGoHome2022 #CorruptPoliticians #rajapakshas #Anonymoushelpsrilanka #AnonymousSaveSriLanka #giveourstolenmoney\n");
			sleep(2000);
		}
		
		driver.close();
	}
	
	public void createPost() {
		
		String content = FileReader.readFile();
		
		driver.findElement(Locators.txtPostBox).click();
		driver.findElement(Locators.txtPostWindowBox).sendKeys(content);
		driver.findElement(Locators.btnPrivacy).click();
		driver.findElement(Locators.btnRadioPublic).click();
		driver.findElement(Locators.btnPost).click();
		
		sleep(4000);
	}
	
	
	private void sleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
