package com.jackfruit.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.jackfruit.base.BasePage;

public class FileUploadRobot extends BasePage
{

	public FileUploadRobot(WebDriver driver) 
	{
		super(driver);
		
	}
	
	
	@FindBy(xpath=".//*[@id='report_bug_form']/div/div[2]/div[1]/div/table/tbody/tr[11]/td/div")
	private WebElement report_bug_form;
	
	public void fileUploadRobot(Transferable filePath) throws Exception
	{
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath,null);
		 
		
		// driver.findElement(By.xpath(".//*[@id='report_bug_form']/div/div[2]/div[1]/div/table/tbody/tr[11]/td/div")).click();
		
		 report_bug_form.click();
		 
		// Create object of Robot class
		 Robot robot = new Robot();
		 Thread.sleep(1000);
		
		
		 // Press Enter
		 robot.keyPress(KeyEvent.VK_ENTER);
		 
		 // Release Enter
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 // Press CTRL+V
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 
		 
		 // Release CTRL+V
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 Thread.sleep(1000);
		 
		 
		 //Press Enter 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 
		// This will scroll down the page 
		/* JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("scroll(0,350)");*/
		 
	/*	 
		 Robot robot1 = new Robot();
		 robot1.keyPress(KeyEvent.VK_PAGE_DOWN);
		 robot1.keyRelease(KeyEvent.VK_PAGE_DOWN);*/
	}
	
	

}
