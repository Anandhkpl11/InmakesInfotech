package org.stepdefiniation;

import org.Base.BaseClass;
import org.openqa.selenium.By;

import PageObjectModel.LoginPom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefiniation extends BaseClass{
	
	//LoginPom p=new LoginPom();
	
	@Given("User lanuch the browser")
	public void user_lanuch_the_browser() {
	   browser();
	   maximize();
	   implicitywait();
	}

	@When("user enter the emailid")
	public void user_enter_the_emailid() {
		url("https://www.facebook.com/");
	    
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("anandhakumar@gmail.com");               
	}

	@And("user enter the password")
	public void user_enter_the_password() throws InterruptedException {
		Thread.sleep(3000);

		driver.findElement(By.name("pass")).sendKeys("moorthi@05");
	}

	@And("user click the login button")
	public void user_click_the_login_button() {
	   
		driver.findElement(By.xpath("//*[@data-testid='royal_login_button']")).click();
	}

	@Then("To Navigate the facebook home page")
	public void to_navigate_the_facebook_home_page() {
		System.out.println("successfull login");
		//quit();
	}
	


}
