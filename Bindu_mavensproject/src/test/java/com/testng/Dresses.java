package com.testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dresses extends Resuablecode {
	
	
	@Test(priority=2,groups="regression")
	public void Eveningdresses() {
		clickonlinkelement(By.linkText("Women"));
	    clickonlinkelement(By.linkText("Dresses"));
		clickonlinkelement(By.linkText("Evening Dresses"));		
		checkbox_selection(By.xpath("//*[@id=\"layered_id_attribute_group_1\"]"));
		checkbox_selection(By.xpath("//*[@id=\"layered_id_attribute_group_24\"]"));
		checkbox_selection(By.xpath("//*[@id=\"layered_condition_new\"]"));
		scrollbar(By.className("available-now"));
    	Mousehoveraction(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
    	clickonlinkelement(By.xpath("//*[text()='More']"));
    	sendkeys(By.id("quantity_wanted"),"2");
    	clickonlinkelement(By.xpath("//*[text()='Add to cart']"));
    	clickonlinkelement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span"));
    	
	}
	}
	
	
