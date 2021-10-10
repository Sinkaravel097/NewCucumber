package org.test.sample;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends BaseClass {

	
	
	@Test
	private void tc1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		String url = driver.getCurrentUrl();
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("python@gmail.com");
		
		Assert.assertTrue(url.contains("Face"), "Check your testcase 1");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("kjh5434");	
		
		
	}
	
	@Test
	private void tc50() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		String url = driver.getCurrentUrl();
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("testng@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("8765345678");	
	}

	
	
}
