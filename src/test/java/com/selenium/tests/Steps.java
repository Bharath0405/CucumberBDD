package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	public static WebDriver driver;
	
	
	@Given("^I want to launch chrome browser$")
	public void i_want_to_launch_chrome_browser() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bharath\\Desktop\\Classes\\Browser_Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://adactin.com/HotelApp/");
}

	@Given("^I want to enter username$")
	public void i_want_to_enter_username() {
	  
		driver.findElement(By.id("username")).sendKeys("seleniumtesting");
		
	}

	@Given("^I want to enter Password$")
	public void i_want_to_enter_Password() {
		driver.findElement(By.id("password")).sendKeys("password1");
	}

	@Given("^I want to click on login button$")
	public void i_want_to_click_on_login_button() {
		driver.findElement(By.id("login")).click();
	}

	@When("^I successfully login verify home page title$")
	public void i_successfully_login_verify_home_page_title() {
	   WebElement ele = driver.findElement(By.linkText("Logout"));
	   if(ele.isDisplayed()) {
		   System.out.println("logged in successfully");
	   }else {
		   System.out.println("login failed");
	   }
	}

	@Then("^Close my browser$")
	public void close_my_browser() {
	   
		//driver.close();
	}
	
	
	
	
	
	@Given("^I want to search my hotel with given information$")
	public void i_want_to_search_my_hotel_with_given_information() {
		 WebElement ele = driver.findElement(By.id("Submit"));
		   if(ele.isDisplayed()) {
			   System.out.println("Submit button displayed");
		   }else {
			   System.out.println("button not displayed");
		   }
	}

	@Given("^I want to select location$")
	public void i_want_to_select_location() {
	   Select select = new Select(driver.findElement(By.id("location")));
	   select.selectByVisibleText("London");
	}

	@Given("^I want to select hotels$")
	public void i_want_to_select_hotels() {
	   
	}

	@Given("^I want to select room type$")
	public void i_want_to_select_room_type() {
	   
	}

	@Given("^I want to enter number of rooms$")
	public void i_want_to_enter_number_of_rooms() {
	   
	}

	@Given("^I want to enter number of children$")
	public void i_want_to_enter_number_of_children() {
	   
	}

	@When("^I click on search button$")
	public void i_click_on_search_button() {
	   
	}

	@Then("^I select hotel radio button$")
	public void i_select_hotel_radio_button() {
	   
	}

	@Then("^I want to close my browser$")
	public void i_want_to_close_my_browser() {
	   
	}
	
	

}
