Feature: Landing 
 
Scenario: Validate User navigates to Landing Page
  
  Given chrome is launched and Opencart is launched
  Then User navigates on Landing Page
 
Scenario: Validate Landing Page UI
 
 Given chrome is launched and Opencart is launched
 Then User navigates on Landing page
 And fields are visible on the Landing page
 
Scenario: Validate Landing page fields(Login button is clickable) 
 
  Given chrome is launched and Opencart is launched
  Then User navigates on Landing page
  When User clicks on login button
  Then Login button is clickable and User navigates to login page
 
