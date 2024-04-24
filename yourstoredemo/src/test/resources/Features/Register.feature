Feature: Registration functionality  

Scenario: User create an account with mandatory fields
 Given User navigate to Register Account Page
 When User enters the details into the below fields
  |firstname  |Ashish                     |
  |lastname   |Gangasagre                 |
  |telephone  | 1234567890                |
  |password   |12345                       |
  |confrmpass |12345                      | 
  And User selects privacy policy 
  And User clicks on continue button
  Then User account should get created successfully
  
  
  Scenario: User create an account with all fields
 Given User navigate to Register Account Page
 When User enters the details into the below fields
  |firstname  |Ashish                     |
  |lastname   |Gangasagre                 |
  |telephone  | 1234567890                |
  |password   |12345                      |
  |confrmpass |12345                      | 
  And User selects yes for newsletter
  And User selects privacy policy 
  And User clicks on continue button
  Then User account should get created successfully
  
  
   Scenario: User create a duplicate account
 Given User navigate to Register Account Page
 When User enters the details into the below fields with duplicate email
  |firstname  |Ashish                     |
  |lastname   |Gangasagre                 |
  |email      |ashishgangasagre@gmail.com |
  |telephone  | 1234567890                |
  |password   |Ashu1234                   |
  And User selects yes for newsletter
  And User selects privacy policy 
  And User clicks on continue button
  Then User should get a proper worninig about duplicate email
  
   Scenario: User create an account without filling any details 
 Given User navigate to Register Account Page
 When User dont enters any details into fields 
 And User clicks on continue button
 Then User should get a proper worninig messages for every madatory field
  