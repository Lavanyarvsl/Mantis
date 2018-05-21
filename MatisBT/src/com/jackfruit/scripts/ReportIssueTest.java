package com.jackfruit.scripts;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.jackfruit.base.BaseTest;
import com.jackfruit.pages.FileUploadRobot;
import com.jackfruit.pages.ReportIssue;

import generics.Utility;

public class ReportIssueTest extends BaseTest{

	@Test(priority=10,enabled=true)
	public void mantisRepotIssue() throws Exception
	{
		
		ReportIssue reportIssuePage=new ReportIssue(driver);
		
		//
		
		//reportIssuePage.selectCategory("2");
		
		
		
		/*reportIssuePage.selectReproducibility("1");
		
		reportIssuePage.selectSeverity("1");
		
		reportIssuePage.selectPriority("1");
		
		reportIssuePage.setPlatform("My Plat Form");
		
		reportIssuePage.sendOS("OS");
		
		reportIssuePage.osBuild("OS Build");
		
		reportIssuePage.summary("summ");
		
		reportIssuePage.description("desc");
		
		reportIssuePage.stepsToReproduce("desc");
		
		reportIssuePage.additionalInfo("add Info");

		reportIssuePage.AttachTags("Att Tags");
		
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
		*/
		/*
		 ((JavascriptExecutor) driver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");*/
		 
		/*StringSelection sel = new StringSelection("D:\\1.jpg");
		
		FileUploadRobot fileUpload=new FileUploadRobot(driver);
		
		fileUpload.fileUploadRobot(sel);
		
		 Thread.sleep(10000);
		*/
		 
		
		
		 int rc=Utility.getExcelRowCount(INPUT_PATH, "mantis");
		 System.out.println("My Row Count"+rc);
			
		   for(int i=1;i<=rc;i++)
		   {
			   
			   String category=Utility.getExcelCellValue(INPUT_PATH, "mantis",i,1);
			   
			   String pageName=Utility.getExcelCellValue(INPUT_PATH, "mantis",i,2);
			   
			   String reproducibility=Utility.getExcelCellValue(INPUT_PATH, "mantis",i,3);
			   
			   String severity = Utility.getExcelCellValue(INPUT_PATH, "mantis",i,4);
			   
			   String priority = Utility.getExcelCellValue(INPUT_PATH, "mantis",i,5);
			   
			   String summary = Utility.getExcelCellValue(INPUT_PATH, "mantis",i,6);
			   
			   String description = Utility.getExcelCellValue(INPUT_PATH, "mantis",i,7);
			   
			   String stepsToReproduce = Utility.getExcelCellValue(INPUT_PATH, "mantis",i,8);
			   
			   String additionalInfo = Utility.getExcelCellValue(INPUT_PATH, "mantis",i,9);
			   
			   String attachTag = Utility.getExcelCellValue(INPUT_PATH, "mantis",i,10);
			   
			   String filePath =Utility.getExcelCellValue(INPUT_PATH, "mantis",i,11);
			   
			   
			   //reportIssuePage.description(description);
			   
			   //Code for Selecting the Category Type
			   
			   reportIssuePage.clickReportIssueBtn();
			   /**If Block for Selecting the Category Type Start**/
			   
			   if(category.equalsIgnoreCase("Attorney"))
			   {
				   
				   reportIssuePage.selectCategory("2");
				 
			   }
			   
			   /**If Block for Selecting the Category Type End**/
			  
			   
			   
			   
			   
			   //Code for Selecting the Reproducibility Type
			   
			   /** Switch Block for Selecting the Reproducibility Type Start **/
			   
		         switch (reproducibility) 
		        {
		        
		            case "always": 
		                            reportIssuePage.selectReproducibility("1");
		                            break;
		       
		                     
		            case "sometimes":  
				                     reportIssuePage.selectReproducibility("2");
				                     break;
		                     
		                     
		            case "random": 
						             reportIssuePage.selectReproducibility("3");
				                     break;
		                     
		                     
		            case "have not tried":  
		            	
						             reportIssuePage.selectReproducibility("4");
					                 break;
			                 
			                 
		            case "unable to reproduce": 
		            	
							         reportIssuePage.selectReproducibility("5");
						             break;
		                     
				             
		            case "N/A":  
		            	         reproducibility = "N/A";
		                         break;
		            
		                     
		            default: reproducibility = "have not tried";
		            
		             
		          }
		         
		         /** Switch Block for Selecting the Reproducibility Type End **/
		         
		         
		         
		       //Code for Selecting the Severity Type
				   
		         
				   /** Switch Block for Selecting the Severity Type Start **/  
		         
					switch (severity) 
			        {
			        
			            case "feature": 
			            				reportIssuePage.selectSeverity("1");
			                            break;
			       
			                     
			            case "trivial":  
					                     reportIssuePage.selectSeverity("2");
					                     break;
			                     
			                     
			            case "text": 
							             reportIssuePage.selectSeverity("3");
					                     break;
			                     
			                     
			            case "tweak":  
			            	
							             reportIssuePage.selectSeverity("4");
						                 break;
				                 
				                 
			            case "minor": 
			            	
								         reportIssuePage.selectSeverity("5");
							             break;
			                     
					             
			            case "major":  
						            	 reportIssuePage.selectSeverity("6");
							             break;
			                         
			            case "crash":  
						            	 reportIssuePage.selectSeverity("7");
							             break;            
			                         
			                         
			            case "block":  
						            	reportIssuePage.selectSeverity("8");
							            break;            
			            
			                     
			            default: severity = "minor";
			            
			            
			            
			          }
		         
					  /** Switch Block for Selecting the Severity Type End **/  
		         
					
					 //Code for Selecting the Priority Type
					   
			         
					   /** Switch Block for Selecting the Priority Type Start **/  
			         
						switch (priority) 
				        {
				        
				            case "none": 
				            	            reportIssuePage.selectPriority("1");
				                            break;
				       
				                     
				            case "low":  
						                     reportIssuePage.selectPriority("2");
						                     break;
				                     
				                     
				            case "normal": 
								             reportIssuePage.selectPriority("3");
						                     break;
				                     
				                     
				            case "high":  
				            	
								             reportIssuePage.selectPriority("4");
							                 break;
					                 
					                 
				            case "urgent": 
				            	
									         reportIssuePage.selectPriority("5");
								             break;
				                     
						             
				            case "immediate":  
							            	 reportIssuePage.selectPriority("6");
								             break;
				                         
				           
				                     
				            default: priority = "normal";
				            
				            
				            
				          }
			         
						  /** Switch Block for Selecting the Severity Type End **/  
			         
		         
					
		            //Code for entering the Platform details
					reportIssuePage.setPlatform("JAVA");
					
					//Code for entering the OS details
					reportIssuePage.sendOS("Windows");
					
					//Code for entering the OS Version details
					reportIssuePage.osBuild("7");
					
					//Code for entering the Summary details
					String summaryDet="["+pageName+"]"+summary;
					
					
				
					
					reportIssuePage.summary(summaryDet);
					
					 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
					
					//Code for entering the Description details
					reportIssuePage.description(description);
					
					
					
					
					
					//Code for entering the Steps To Reproduce details
					reportIssuePage.stepsToReproduce(stepsToReproduce);
					
					//Code for entering the Additional Information details
					reportIssuePage.additionalInfo(additionalInfo);
					
					//Code for entering the Attach Tags details
					
					if(attachTag.contains("NA"))
					{
						System.out.println("No tags to Attach");
					}
					else
						
					{	
					reportIssuePage.AttachTags(attachTag);
					}
					
					
					
					
					if(filePath.contains(","))
					{
						
						System.out.println("Special character '");
						
					
					String[] splitted =filePath.split(",");
					
					//String[] splitted = attachTag.split(",");
					
					for(int j=0;j<splitted.length;j++)
					{		
					
						
					reportIssuePage.AttachTags(splitted[j]);
					
					
					
					StringSelection sel = new StringSelection(splitted[j]);
					
					
					
					FileUploadRobot fileUpload=new FileUploadRobot(driver);
					
					fileUpload.fileUploadRobot(sel);
					
					
					
					
					}
					
					
					}
					else if(filePath.contains("NA"))
				    {
						
						System.out.println("No Test Image Screenshots");
			        }
					
					else
				   {
						System.out.println("Single Image Screenshots");
						
						StringSelection sel = new StringSelection(filePath);
						FileUploadRobot fileUpload=new FileUploadRobot(driver);
						
						fileUpload.fileUploadRobot(sel);
						
						
				    }
					
					reportIssuePage.submit();
					
					Thread.sleep(1000);
			   
			   } 
		   
		   /**** For Loop End ****/
			   
		     
		   
		   }   
	   
	
			   
		        /*reportIssuePage.selectSeverity("1");
			    Thread.sleep(1000);
			   */
			   
			   
			   
			   
			   
			   
			   
		   }
		
		 
		 
		 
		 
		 
		 
		 
		 
	
	

