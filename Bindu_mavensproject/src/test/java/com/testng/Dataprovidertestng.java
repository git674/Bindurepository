package com.testng;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidertestng extends Resuablecode {
	
	@Test(dataProvider="calculate",groups= {"regression"})
	public void calculate(String homevalue,String downpayment,String loanamt,String interestrate) {
		//launchapp("chrome","https://www.mortgagecalculator.org/");
		sendkeys(By.id("homeval"),homevalue);
		sendkeys(By.id("downpayment"),downpayment);
		sendkeys(By.id("loanamt"),loanamt);
		sendkeys(By.id("intrstsrate"),interestrate);
		clickonlinkelement(By.name("cal"));
	}
	
	@DataProvider(name="calculate")
	public String[][] getmethod(){
		String arr[][]= {
				{"45000","4567","30000","25000"	},
				{"4567","34545","2345","34456"},
				{"34500","5000","4000","456"}
				};
		return arr;
	}
	}

	
		
	
