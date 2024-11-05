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
#Feature: Sign In Validation
#
Feature: Sign In Validation

Background:
Given user is in application 

@smoketest
  Scenario Outline: User should be able to launch home page
    Given User is in Signin Page
		When User put valid emailid and password "<emailid>" and "<password>" in SignIn Page
    And User clicks on sign in button
    Then User should successfully loged in
    Then User closes the browser 
    
    Examples:
     |emailid|password|
    |rajattripathy19047@gmail.com|SB54*dbf|
    
