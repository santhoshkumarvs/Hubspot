package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santhosh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://app.hubspot.com/login");
		driver.findElement(By.id("username")).sendKeys("santhoshkumarvs437@gmail.com");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("password")).sendKeys("05Nusb@0908");
		
		driver.findElement(By.id("loginBtn")).click();

		driver.close();
	}
	
//xpath //input[@class='gsfi']
}
