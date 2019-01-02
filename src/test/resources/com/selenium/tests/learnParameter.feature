@HotelAppLogin
Feature: Testing Hotel Application

@HotelLoginScenario
Scenario Outline: I want to login into HotelApp

Given I open new chrome browser enter url hotelappr
And I want to enter <userid> <pwdid>
And I want to click on loginbutton
When I successfully login verify my hotel home page title
Then Close chrome mybrowser

Examples:

|userid		    |	pwdid	|	
|seleniumtesting|password1	|
|demo1			|demo1	|