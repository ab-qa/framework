@TagName
Feature: Demo to show how to mange data for different regions
  
	@TestDiffEnvData
  	Scenario Outline: Diff Env Data
    	Given I login with username "<username>" and "<password>"

    	Examples: {'datafile' : 'data/${env}/testData.json'}