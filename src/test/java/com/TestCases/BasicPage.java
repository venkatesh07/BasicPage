package com.TestCases;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasicPage {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\venkatesh\\eclipse\\com.pageobject\\BrowserDriver\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.youtube.com/");
		
		
		
		

	}

}
