package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutline {
	public WebDriver driver;
	
	@Given("^I open new chrome browser enter url hotelappr$")
	public void i_open_new_chrome_browser_enter_url_hotelappr() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bharath\\Desktop\\Classes\\Browser_Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://adactin.com/HotelApp/");
	}

	@Given("^I want to enter (.*) (.*)$")
	public void i_want_to_enter(String userid, String pwdid) {
	    driver.findElement(By.id("username")).sendKeys(userid);
	    driver.findElement(By.id("password")).sendKeys(pwdid);

	}

	@Given("^I want to click on loginbutton$")
	public void i_want_to_click_on_loginbutton() {
	  driver.findElement(By.id("login")).click();
	}

	@When("^I successfully login verify my hotel home page title$")
	public void i_successfully_login_verify_my_hotel_home_page_title() {
		 WebElement ele = driver.findElement(By.linkText("Logout"));
		   if(ele.isDisplayed()) {
			   System.out.println("logged in successfully");
		   }else {
			   System.out.println("login failed");
		   }
	}

	@Then("^Close chrome mybrowser$")
	public void close_chrome_mybrowser() {
	   driver.close();
	}



}
