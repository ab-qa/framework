Feature: Demo for Web Service example 

	@EclaimPOC
	Scenario: Eclaim eligibility check
	When user requests 'get.eclaims.token' 
	And store response body 'token' into 'Token'
	And user requests 'post.eclaims.eligibility.check'
	Then response should have value contains ignoring case 'Y' at '$..eligibilityIndicator' 
	
	@EclaimPOCJSONSample
	Scenario Outline: Eclaim eligibility check using JSON format
	When user requests with json data '<get.eclaims.token>' 
	And store response body 'token' into 'Token'
	And user requests with json data '<post.eclaims.eligibility.check>'
	Then response should have value contains ignoring case 'Y' at '$..eligibilityIndicator' 
	
	Examples: {'datafile' : 'data/eclaim.json'}