@Postrequest
Feature: API demo on Move Health Activity

@Postrequest
Scenario: Post call on Move Activity Health
When user requests 'post.move.activity.health'
Then response should have value contains ignoring case 'SUCCESS' at '$..response'

