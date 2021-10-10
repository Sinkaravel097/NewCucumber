package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJO extends BaseClass {
	
	// 1. Non parametrized constructor
	public LoginPOJO() {

		PageFactory.initElements(driver, this); 
	}
	
	
	// 2. Private WebElements    
	 
	// instead WebElement email = driver.findElement(By.id("email"));
	@CacheLookup
	@FindBy(id="email")
	private WebElement email;
	
	//  WebElement password = driver.findElement(By.name("pass"));
	@CacheLookup
	@FindBy(name="pass")
	private WebElement password;
	
	@CacheLookup
	@FindBy(id="u_0_d_Ff") 
	private WebElement loginBtn;
	
	
	// findbys for login btn
	@CacheLookup
	@FindBys({
		
		@FindBy(xpath="//button[@name='login']"),
		@FindBy(xpath="// button[@data-testid='royal_login_button']"),
		@FindBy(xpath="//button[@id='u_0_d_Ff']"),
		@FindBy(xpath="//button[text()='Log In']")
	})
	private WebElement loginFindBys;
	
	// findall for login btn
	@CacheLookup 
	@FindAll({
		
		@FindBy(xpath="//button[@name='login']"),
		@FindBy(xpath="// button[@data-testid='royal_login_button']"),
		@FindBy(xpath="//button[@id='u_0_d_Ff']"),
		@FindBy(xpath="//button[text()='Log In']")
	})
	private WebElement loginFindAll;
	
	
	
	// 3.  Getters to access those webElements outside the class
	
	public WebElement getEmail() {
		return email; 
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getLoginFindBys() {
		return loginFindBys;
	}

	public WebElement getLoginFindAll() {
		return loginFindAll;
	}


}
