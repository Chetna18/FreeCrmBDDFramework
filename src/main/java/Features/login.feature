Feature: Free CRM Login Feature
Scenario: Free CRM Login Test Scenario

Given User is already on Login page
When title of login page is Free CRM
Then user enters "chetna_dholakiya@yahoo.com" and "framework"
Then user clicks on login button
Then user is on home page
Then close the browser