@TagName
Feature: Demo to create scripts on local system
  
  Scenario: Android Native use case
  	Given I open hamburger menu
	When I navigate to parent "TVs & Appliances" and child "Air Conditioners" in menu
	Then I verify that the title in the action bar should be "Air Conditioners"
	When I select the second promotion banner on gellery page
	Then I verify sort filter options on gallery page