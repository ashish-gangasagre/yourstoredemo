Feature: Login functionality

Scenario: Login with valid credentials
 Given User navigate to login page
 When User has entered valid email address "ashishgangasagre@gmail.com" into email field
 And User entered valid password "Ashu1234" into password field
 And User should click on login button
 Then User should succefully login
 
 
 Scenario: Login with invalid credentials
 Given User navigate to login page
 When User has entered invalid email address into email field
 And User entered invalid password "Ashu1234567" into password field
 And User should click on login button
 Then User should get aproper error message about credentials mismatch
 
 
 Scenario: Login wuth valid email and invalid password
 Given User navigate to login page
 When User has entered valid email address "ashishgangasagre@gmail.com" into email field
 And User entered invalid password "Ashu12345" into password field
 And User should click on login button
 Then User should get aproper error message about credentials mismatch
 
 
 Scenario: Login wuth invalid email and validpasspword
 Given User navigate to login page
 When User has entered invalid email address into email field
 And User entered valid password "Ashu1234" into password field
 And User should click on login button
 Then User should get aproper error message about credentials mismatch
 
 Scenario: Login without providin credentials
 Given User navigate to login page
 When User dont entered email into email field
 And User dont entered password into password field
 And User should click on login button
 Then User should get aproper error message about credentials mismatch
 
 
 
 