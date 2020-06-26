package com.testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Causaldresses extends Resuablecode {
	@Test(priority=1,groups="regression")
	public void verifytext_casualdresses() {
		clickonlinkelement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		clickonlinkelement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
		clickonlinkelement(By.linkText("Casual Dresses"));
		String expectedvalue=verifytext(By.className("cat-name"));
		Assert.assertEquals(expectedvalue, "CASUAL DRESSES ");
		//scrollbar(By.className("product-count"));
		//selectdropdown(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div[2]/div[1]/form/div/div/select"),"Product Name: A to Z");
		
		
	}

}
