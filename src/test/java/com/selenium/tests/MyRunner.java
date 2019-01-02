package com.selenium.tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="com.selenium.tests",tags= {"@HotelLoginScenario"} )
public class MyRunner {

}//,"@verifySearchTextBox"

//{"@HotelAppLogin,@HotelAppSearchHotel"}
//@HotelLoginScenario

//dryRun=false,monochrome=false,