package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerSteps {
	
	static WebDriver driver;
	
	@Given("user launch the browser")
	public void user_launch_the_browser() {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subbian\\eclipse-workspace\\Arch\\cucumberAug\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		
	}

	@Given("user should be in telecom home page")
	public void user_should_be_in_telecom_home_page() {
	  
		driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("user click on Add Customer button")
	public void user_click_on_Add_Customer_button() {
		
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	 
	}

	@When("user should enter all the fields")
	public void user_should_enter_all_the_fields() {
		
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys("karthi");
		driver.findElement(By.id("lname")).sendKeys("rajan");
		driver.findElement(By.id("email")).sendKeys("karthi@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("tanjore");
		driver.findElement(By.id("telephoneno")).sendKeys("12345567788");
	   
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	}

	@Then("user should be displayed id is generated")
	public void user_should_be_displayed_id_is_generated() {
		
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	 
	}

}
