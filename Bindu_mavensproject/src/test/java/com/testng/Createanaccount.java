package com.testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Createanaccount extends Resuablecode {
	@Test(groups="regression")
	
	public void createaccount() {
		
        clickonlinkelement(By.xpath("//*[@id=\"tb3\"]/table/tbody/tr[5]/td/table/tbody/tr[3]/td[2]/font/a/font"));
		sendkeys(By.name("emailid"),"Madduri@gmail.com");
		sendkeys(By.name("firstname"),"chenna");
		sendkeys(By.name("lastname"),"Madduri");
		sendkeys(By.name("password"),"Chenna@9");
		sendkeys(By.name("confirmpassword"),"Chenna@9");
		selectdropdown(By.name("hintquestion"),"Place of birth");
	    sendkeys(By.name("hintanswer"),"04/03/1980");
	    clickonlinkelement(By.name("Submit"));
	}    

}
	
