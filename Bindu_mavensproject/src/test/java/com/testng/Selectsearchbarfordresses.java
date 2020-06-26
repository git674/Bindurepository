package com.testng;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Selectsearchbarfordresses extends Resuablecode {
	@Test(priority=9)
	public void verifysummerdresses() throws InterruptedException {
		sendkeys(By.id("search_query_top"),"Dresses");
		autocomplete(By.xpath("//*[@id=\"index\"]/div[2]/ul/li[1]"), "Summer Dresses > Printed Chiffon Dress");
		Thread.sleep(3000);
		sendkeys(By.id("quantity_wanted"),"3");
		selectdropdown(By.id("group_1"),"M");
		//checkbox_selection(By.id("color_16"));
		clickonlinkelement(By.xpath("//*[text()='Add_to_cart']"));
		clickonlinkelement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span"));
	}
}