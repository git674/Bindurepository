package com.testng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Resuablecode {
	
	
	static WebDriver driver;
	
	static Actions action;
	JavascriptExecutor js;
	@Parameters("browsername")
    @BeforeTest(groups= {"regression","smoke","sanity"})
	public  void launchapp(String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chenn\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();					
			
		}else if(browsername.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.getko.driver", "C:\\Users\\chenn\\Downloads\\getkodriver_win32\\getkodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		//action=new Actions(driver);

	}
	@AfterSuite(groups= {"regression","smoke","sanity"})	
	public void closebrowser() {
		try {
			
		driver.quit();
	}catch(Exception e) {
		e.printStackTrace();
	 }
	}
	
	public void clickonlinkelement(By locater) {
		try {
			
		driver.findElement(locater).click();
	}catch(Exception e) {
		e.printStackTrace();
	 }
	}
	public void sendkeys(By locater,String text) {
		try {
			
		driver.findElement(locater).clear();
		driver.findElement(locater).sendKeys(text);
	}catch(Exception e) {
		e.printStackTrace();
	 }
	}
	
	public  void selectdropdown(By locator,String textname) {
		
		try {
		
		Select dropdown=new Select(driver.findElement(locator));		
		
		dropdown.selectByVisibleText(textname);
		
		} catch(Exception e) {
			
			e.printStackTrace();	
			}	
		
	}
	
	public boolean checkverifymessage(By locater) {
		boolean status=false;
	try {				
		 status=driver.findElement(locater).isDisplayed();
		
	} catch(Exception e) {
		
		e.printStackTrace();
	}
	
	return status;			
	}

   public boolean checkbox_selection(By locater) {
	 boolean status=false;
	 try {			
			 status=driver.findElement(locater).isSelected();
			
		} catch(Exception e) {
			
			e.printStackTrace();
		}
			
		return status;	
		} 
 

   public  void Mousehoveraction(By locater) {
	   try {
		   WebElement text=driver.findElement(locater);
		   Actions action=new Actions(driver);
		    action.moveToElement(text).perform();	   
		   
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
	    
   }
   public String verifytext(By locater) {
	   String text=null;
	   try {
	   text=driver.findElement(locater).getText();
   }catch(Exception e) {
	   e.printStackTrace();
    }
	   return text;
   }
   public void scrollbar(By locater) {
	   try {
	   js=(JavascriptExecutor)driver;
	   js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(locater));
   }catch(Exception e) {
	   e.printStackTrace();
   }
}
   public  void Switchtoframe(int index) {
	   try {
		   driver.switchTo().frame(index);
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
   }
   public void autocomplete(By locater,String value) {
	   try {
	   List<WebElement> values=driver.findElements(locater);
	   
	     for(int i=0;i<values.size();i++) {
	    	 System.out.println(values.size());
	    	 String text=values.get(i).getText();
	    	 if(text.equalsIgnoreCase("value")) {
	    	   values.get(i).click();
	    	   break;
	    	 }
	     }
   }catch(Exception e) {
	   e.printStackTrace(); 
	   }
    
   }
}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   