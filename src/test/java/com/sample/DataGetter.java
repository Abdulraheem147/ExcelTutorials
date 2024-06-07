package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DataGetter {
	@Test(dataProvider="data",dataProviderClass=DataTransfer.class)
	public void get(String email,String pass) {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.name("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
		String string = driver.getTitle();
		System.out.println(string);

	}

}
