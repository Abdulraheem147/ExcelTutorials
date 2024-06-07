package com.excel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GetExcel {
	
	@Test(dataProvider="throwData",dataProviderClass=Excel3.class)
	public void getData(String data[]) {
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys(data[0]);
		driver.findElement(By.name("pass")).sendKeys(data[1]);
		driver.findElement(By.name("login")).click();
		String string = driver.getTitle();
		System.out.println(string);

	}

}
