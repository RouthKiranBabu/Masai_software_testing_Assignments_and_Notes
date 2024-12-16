Feature: Check Title

Scenario: Used to check the title shifts...
	Given Chooses the "chrome"
	Then Opens the "https://automationteststore.com/"
	Then Checks the "A place to practice your automation skills!" title
	Then Clicks on "Apparel & Accessories"
	Then Checks the "Apparel & accessories" title
	Then Clicks on Sort by "Options"
	Then Clicks on "basket"

Scenario Outline: Clicking on different sort by options...
	Given Chooses the "chrome"
	Then Opens the "https://automationteststore.com/"
	Then Checks the "A place to practice your automation skills!" title
	Then Clicks on "Apparel & Accessories"
	Then Checks the "Apparel & accessories" title
	Then Clicks on Sort by <Options>
	Then Clicks on <basket>
	
	Examples:
		| Options | basket |
		| Date Old > New | (//a[@data-id="116"])[1] |
		| Name A - Z | (//a[@data-id="121"])[1] |
		| Name Z - A | (//a[@data-id="118"])[1] |
		
		
#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
