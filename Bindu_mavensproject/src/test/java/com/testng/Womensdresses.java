package com.testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Womensdresses extends Resuablecode {
	
	@BeforeClass(groups= {"regression","smoke"})
	public void opentshirtpage() {
		clickonlinkelement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
    	clickonlinkelement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a"));
    	clickonlinkelement(By.linkText("T-shirts"));
	}
	 @Test(priority=6,groups="smoke")
	    public void  T_shirts(){
	       	String expectedvalue=verifytext(By.className("cat-name"));
	    	Assert.assertEquals(expectedvalue, "T-SHIRTS ");
	    	   	
	    }
	    @Test(priority=7,groups="regression")
	    public void Addtocart() {
	    	scrollbar(By.className("available-now"));
	    	Mousehoveraction(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
	    	clickonlinkelement(By.xpath("//*[text()='Add to cart']"));
	    	clickonlinkelement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span"));
	    	
	    }
	    @Test(priority=8,groups="regression")
	    public void AddTshirtthroughquickview() throws InterruptedException {
	    	scrollbar(By.className("available-now"));
	    	Thread.sleep(3000);
	    	Mousehoveraction(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
	    	clickonlinkelement(By.xpath("//*[text()='Quick view']"));
	    	Switchtoframe(0);
	    	clickonlinkelement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
	    	Thread.sleep(3000);
	        String expectedvalue=verifytext(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2"));
	    	Assert.assertEquals(expectedvalue, "Product successfully added to your shopping cart");
	    	clickonlinkelement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span"));
	    	
	    }


}
