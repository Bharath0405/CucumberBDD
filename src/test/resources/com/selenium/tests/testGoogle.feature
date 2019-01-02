@testBackGround
Feature: Verify google web page


Background:
Given I want to open browser and navigte to google page


@verifyGmaillink
Scenario: I want to Gmail link on google page

When I open google page want to verify Gmail link
Then I want to click o Gmail link


@verifySearchTextBox
Scenario: I want to verify search textbox on google page

When I open google page want to verify search text box
Then I want to enter text in search text box