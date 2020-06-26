package com.testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Shoppingcartfordresses extends Resuablecode {
	 @Test(priority=3)
	public void shoppingcart() {
		clickonlinkelement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b"));
		String expectedvalue=verifytext(By.xpath("//*[@id=\"center_column\"]/p"));
		Assert.assertEquals(expectedvalue, "Your shopping cart is empty.");	
							
	}
}
