package org.test.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {
	
	@Test
	private void tc13() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		String url = driver.getCurrentUrl();
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("java@gmail.com");
		
		Assert.assertTrue(url.contains("Face"), "Check your testcase 1");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("8765345678");	
	}
	
	@Test
	private void tc5() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		String url = driver.getCurrentUrl();
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("java@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("8765345678");	
	}
	
	@Test
	private void tc9() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		String url = driver.getCurrentUrl();
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("cucumber@gmail.com");
		
		Assert.assertTrue(url.contains("Face"), "Check your testcase 1");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("8765345678");	
	}
	
	@Test
	private void tc50() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		String url = driver.getCurrentUrl();
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("sql@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("8765345678");	
	}
	
} 
 