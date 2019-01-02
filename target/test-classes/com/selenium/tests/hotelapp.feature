@HotelAppTestscenario
Feature: Testing Hotel Application

@HotelAppLogin
Scenario: I want to login into HotelApp

Given I want to launch chrome browser
And I want to enter username
And I want to enter Password
And I want to click on login button
When I successfully login verify home page title
Then Close my browser

@HotelAppSearchHotel
Scenario: I want to search my hotels

Given I want to search my hotel with given information
And I want to select location
And I want to select hotels
And I want to select room type
And I want to enter number of rooms
And I want to enter number of children
When I click on search button
Then I select hotel radio button
And I want to close my browser


