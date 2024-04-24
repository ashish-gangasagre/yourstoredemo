Feature: Search functinality 


Scenario: User Searches for a valid product
Given User opens the application 
When User enters valid product "HP" into search box fields
And User should get valid product displayed in search result 

Scenario: User searches invalid product
Given User opens the application
When User enters invalid product "honda" into search box field 
And User clicks on search button
Then User should get a meessage about no product matching

Scenario: User searches without any product 
Given User opens the application
When User dont enters any product into search box field
And User clicks on search button
Then User should get a meessage about no product matching