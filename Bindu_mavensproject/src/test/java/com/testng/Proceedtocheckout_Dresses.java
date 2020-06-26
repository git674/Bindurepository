package com.testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Proceedtocheckout_Dresses extends Resuablecode {
	
	@Test
	public void cart_checkout() throws InterruptedException {
		
		Mousehoveraction(By.xpath("//[@id='header']/div[3]/div/div/div[3]/div/a"));
		Thread.sleep(3000);
				
		clickonlinkelement(By.xpath("//*[@id=\"button_order_cart\"]/span"));
	}
}
