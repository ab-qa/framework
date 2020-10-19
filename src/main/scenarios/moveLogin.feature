Feature: To test the Move Android application

@MoveAndroid
Scenario: Move app Login

Given I start the application
And I wait for "10" seconds
When I click on language button
Then Lets go button should be displayed on the next page