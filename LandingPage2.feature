Feature: Landing 

Scenario Outline:  Validate User provide valid Email in subscribe to newsletter
  
      Given chrome is launched and Opencart is launched
      Then User navigates on Landing Page
      When User clicks on subscribe to newsletter and provide  Email as input "<Email>" and clicks on arrow button
      Then User navigates to signup to newsletter form and shows valid Email inserted in the Email box
      When User clicks on country box and it shows dropdown list and selects country name 
      When User clicks the type of subscriber checkbox 
      And User clicks subscribe button
      Then User successfully subscribe newsletter
  
  Examples:
      |  Email                          |    
      | pratikshaambhore2000@gmail.com  |          
   
   
Scenario Outline:  Validate User provide invalid Email to newsletter form
      Given chrome is launched and Opencart is launched
  	  Then User navigates on Landing Page
  	  When User clicks on subscribe to newsletter button and provide invalid Email as input "<Email>" and clicks on arrow button
 	  Then User navigates to signup to newsletter form and shows invalid Email inserted in the Email box
  	  When User clicks on country box and it shows dropdown list and selects country name  
      When User clicks the type of subscriber checkbox 
      And User clicks subscribe button
      Then User not subscribe newsletter
  
  Examples:
        |  Email           |  
        | pratikshaambhore |   