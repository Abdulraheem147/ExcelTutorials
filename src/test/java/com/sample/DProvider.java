package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DProvider {
	@DataProvider(name="login")
	public String[][] data() {
		String[][] data=new String[2][2];
		data[0][0]="8610707648";
		data[0][1]="Abdul@123";
		data[1][0]="8610707648";
		data[1][1]="Abdul@123";
		return data;
	}
	@Test(dataProvider="login")
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
