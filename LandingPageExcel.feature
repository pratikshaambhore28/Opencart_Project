Feature: Landing 

Scenario Outline:  Validate User provide valid Email in subscribe to newsletter
  
      Given chrome is launched and Opencart is launched
      Then User navigates on Landing Page
      When User clicks on subscribe to newsletter and provide Email from given sheetName "<SheetName>" and rowNumber <RowNumber> and clicks on arrow button
      Then User navigates to signup to newsletter form and shows valid Email inserted in the Email box
      When User clicks on country box and it shows dropdown list and selects country name 
      When User clicks the type of subscriber checkbox 
      And User clicks subscribe button
      Then User successfully subscribe newsletter
  
  Examples:
      |  SheetName     | RowNumber     |    
      |  Sheet1        |   0           |
      |  Sheet1        |   1           |
