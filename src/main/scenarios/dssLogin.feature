@WebTesting
Feature: To create a Login test case for dss portal

  @WebTesting
  Scenario Outline: To validate the Customer login functionality
   Given user open the URL
   And user should be on Home page
   When user login using "<email>" and "<password>" on "Customer" tab
   Then user should login to the application successfully
   
      
   Examples:  {'datafile':'data/dssLoginData.json'}
    
    
    
  
  