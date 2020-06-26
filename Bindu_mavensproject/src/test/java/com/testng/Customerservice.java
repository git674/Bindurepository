package com.testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Customerservice extends Resuablecode {
	
    
	@Test(priority=4,groups="regression")
	public void customerservice_through_contactus() {
		clickonlinkelement(By.linkText("Contact us"));
		selectdropdown(By.id("id_contact"),"Customer service");
		sendkeys(By.id("email"),"test@gmail.com");
		sendkeys(By.id("id_order"),"23456");
		sendkeys(By.id("message"),"I have done testing");
		clickonlinkelement(By.xpath("//*[@id=\"submitMessage\"]/span"));
		boolean verifymessage=checkverifymessage(By.xpath("//*[@id=\"center_column\"]/p"));
		Assert.assertTrue(verifymessage, "Element is displayed");
	}
    
    @Test(priority=5,groups="smoke")
    public void womens_tops() {
    	clickonlinkelement(By.linkText("Women"));
    	clickonlinkelement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a"));
    	checkbox_selection(By.xpath("/html/body/div/div[2]/div/div[3]/div[1]/div[2]/div[1]/form/div/div[1]/ul/li[1]/div/span/input"));
    	checkbox_selection(By.xpath("//*[@id=\"layered_id_attribute_group_1\"]"));
    	checkbox_selection(By.xpath("//*[@id=\"layered_id_attribute_group_14\"]"));
    	
    	}
       
    
	
}
