package com.stepdefinition;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pom.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdefinition {
	WebDriver driver;

@Given("User is on the Learnwise Login Page")
public void userIsOnTheLearnwiseLoginPage() {
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	driver.get("https://staging.admin.learnwise.wfglobal.org/#/admin-login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
   
}

@When("user should enter valid {string} and {string}")
public void userShouldEnterValidAnd(String string, String string2) {
	LoginPage.username(driver).sendKeys(string);
	LoginPage.password(driver).sendKeys(string2);
	//WebElement usernam= driver.findElement(By.id("input_0"));
	//usernam.sendKeys(string);
	//WebElement password= driver.findElement(By.id("input_1"));
	//password.sendKeys(string2);
	
    
}

@When("user should select Login Button")
public void userShouldSelectLoginButton() {
	LoginPage.loginbtn(driver).click();
	//WebElement loginbutton = driver.findElement(By.xpath("/html/body/article/div/div[2]/div/section/div/form/button"));
	//loginbutton.click();
    
}

@Then("user should verify success message")
public void userShouldVerifySuccessMessage() throws InterruptedException {
	
String Expectedtest ="ALL PROGRAMS";
String actualtext = driver.findElement(By.xpath("/html/body/article/div/div[2]/div/section/md-toolbar/p")).getText();
Assert.assertTrue("LOGIN Successful", Expectedtest.equals(actualtext));

driver.quit();
}

@When("user should enter invalid {string} and {string}")
public void userShouldEnterInvalidAnd(String string, String string2) {
	LoginPage.username(driver).sendKeys(string);
	LoginPage.password(driver).sendKeys(string2);
	
	//WebElement usernam= driver.findElement(By.id("input_0"));
	//usernam.sendKeys(string);
	//WebElement password= driver.findElement(By.id("input_1"));
	//password.sendKeys(string2);
	
    
}

@Then("user should verify unsuccessful message")
public void userShouldVerifyUnsuccessfulMessage() {
	
	  if(driver.getCurrentUrl().equalsIgnoreCase(
		         "https://staging.admin.learnwise.wfglobal.org/#/admin-login")){
		          
		         } else { 
		            
		            Assert.fail("Invalid Login NOT Success full");
		         } 
	
//	String Expectedtest ="These credentials do not match our records.";
//	String actualtext = driver.findElement(By.xpath("/html/body/article/div/div[2]/div/section/div/div[4]/md-dialog/md-dialog-content/div/p")).getText();
//	Assert.assertTrue("LOGIN Successful", Expectedtest.equals(actualtext));
	

   
}
}
