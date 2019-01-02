package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class backGroundDemo {
	public static WebDriver driver;
	@Given("^I want to open browser and navigte to google page$")
	public void i_want_to_open_browser_and_navigte_to_google_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bharath\\Desktop\\Classes\\Browser_Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://google.com");

	}

	@When("^I open google page want to verify Gmail link$")
	public void i_open_google_page_want_to_verify_Gmail_link() {
	    WebElement ele = driver.findElement(By.linkText("Gmail"));
	    if(ele.isDisplayed()) {
	    	System.out.println("Gmail link present");
	    }else {
	    	System.out.println("Gmail link not dispalyed");
	    }
	}

	@Then("^I want to click o Gmail link$")
	public void i_want_to_click_o_Gmail_link() {
	    driver.findElement(By.linkText("Gmail")).click();
	}

	@When("^I open google page want to verify search text box$")
	public void i_open_google_page_want_to_verify_search_text_box() {
		 WebElement ele = driver.findElement(By.name("q"));
		    if(ele.isDisplayed()) {
		    	System.out.println("searc box present");
		    }else {
		    	System.out.println("search box not dispalyed");
		    }
	}

	@Then("^I want to enter text in search text box$")
	public void i_want_to_enter_text_in_search_text_box() {
	    driver.findElement(By.name("q")).sendKeys("selenium");
	}

}
