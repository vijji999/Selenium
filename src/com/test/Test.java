package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
	public static void main(String args[]) {
	 System.setProperty("webdriver.chrome.driver","C:/Users/ss/Downloads/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
//	 WebDriverWait wait = new WebDriverWait(driver, 15);
	 driver.get("https://www.google.co.in/");
	 driver.manage().window().maximize();
	 driver.findElement(By.id("lst-ib")).sendKeys("fli");
//	 driver.quit();
	 
			 

}}
