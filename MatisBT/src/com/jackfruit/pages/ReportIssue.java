package com.jackfruit.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.jackfruit.base.HomePage;

public class ReportIssue extends HomePage{

	public ReportIssue(WebDriver driver) 
	{
		super(driver);
		
	}

	
	@FindBy(xpath = ".//*[@id='sidebar']/div[1]/div[1]/ul/li[3]/a") 
    public WebElement reportIssueBtn;
	
	@FindBy(id="category_id") 
    public WebElement categoryId;
	
	
	@FindBy(id="platform")
	private WebElement plat;
	
	@FindBy(id="os") 
    public WebElement os;
	
	@FindBy(id="os_build") 
    public WebElement os_build;
	
	
	@FindBy(id="summary") 
    public WebElement summary;
	
	@FindBy(id="description") 
    public WebElement description;
	

	@FindBy(id="steps_to_reproduce") 
    public WebElement steps_to_reproduce;
	
	
	@FindBy(id="additional_info") 
    public WebElement additional_info;
	
	@FindBy(id="tag_string") 
    public WebElement tag_string;
	
	
	
	@FindBy(xpath=".//*[@id='report_bug_form']/div/div[2]/div[1]/div/table/tbody/tr[11]/td/div")
	private WebElement report_bug_form;
	
	@FindBy(xpath=".//*[@id='report_bug_form']/div/div[2]/div[2]/input") 
    public WebElement submit;
	
	
	public void clickReportIssueBtn()
	{
		reportIssueBtn.click();
	}
	
	
	
	public void selectCategory(String id)
	{
		
	   String catg = ".//*[@id='category_id']/option["+id+"]";
	   
	 
	   driver.findElement(By.xpath(catg)).click();
	  
		
	}
	
	public void selectReproducibility(String id)
	{
		
		
	   String rep = ".//*[@id='reproducibility']/option["+id+"]";
	   driver.findElement(By.xpath(rep)).click();
	   
	   
		
	}
	
	public void selectSeverity(String id)
	{
		
	   String Severity = ".//*[@id='severity']/option["+id+"]";
	   driver.findElement(By.xpath(Severity)).click();
	   
	  
	   
	}
	
	
	public void selectPriority(String id)
	{
		
	   String Priority = ".//*[@id='priority']/option["+id+"]";
	   driver.findElement(By.xpath(Priority)).click();
	   
	  
	   
	   
	}
	
	
	public void setPlatform(String platform)
	{
		plat.sendKeys(platform);
	}
	
	public void sendOS(String operating)
	{
		os.sendKeys(operating );
	}
	
	public void osBuild(String osBuild)
	{
		os_build.sendKeys(osBuild);
	}
	
	
	public void summary(String summ)
	{
		summary.sendKeys(summ);
	}
	
	public void description(String desc)
	{
		description.sendKeys(desc);
	}
	
	public void stepsToReproduce(String reproduce)
	{
		steps_to_reproduce.sendKeys(reproduce);
	}
	
	public void additionalInfo(String addInfo)
	{
		additional_info.sendKeys(addInfo);
	}
	
	public void AttachTags(String attTags)
	{
		tag_string.sendKeys(attTags);
	}
	
	
	
	public void submit()
	{
		submit.click();
	}
	
	
	
	
	
	
	
	
}
