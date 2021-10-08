package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
 WebDriver driver;
	
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.id("input_0"));
	}
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.id("input_1"));
	
	}
	public static WebElement loginbtn(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/article/div/div[2]/div/section/div/form/button"));
		
	}
	
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
