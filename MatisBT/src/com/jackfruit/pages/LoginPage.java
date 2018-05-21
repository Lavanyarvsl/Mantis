package com.jackfruit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.jackfruit.base.BasePage;

public class LoginPage extends BasePage
{
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath=".//*[@id='login-form']/fieldset/input[2]")
	private WebElement loginBtn;
	
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void login(String un,String pw){
		username.sendKeys(un);
		password.sendKeys(pw);
		loginBtn.click();
	}
	
	
	
}
