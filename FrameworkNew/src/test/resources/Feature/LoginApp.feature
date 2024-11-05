Feature: Log In Validation

	Background:
	Given user is in application
	 
	@smoketest
  Scenario Outline: User should be able to launch home page
  	Given User is in Log in Page
  	When User put valid id and password "<username>" and "<password>"
    And User put valid emailid and password "<email>" and "<newpassword>" and "<confirmpassword>"
    And User clicks on log in button
    Then User should be on Home Page
    Then User closes the browser
 Examples:
|username|password|email|newpassword|confirmpassword|
|rajat|tripathy|rajattripathy19047@gmail.com|SB54*dbf|SB54*dbf|
 
#Feature: Sign In Validationṇ 
#@smoketest
  #Scenario: User should be able to launch home page
    #Given User is in Siginin in Page
   #When User put valid emailid and password "emailid" and "password"
    #And User put valid emailid and password "username" and "password" and "confirmpassword"
    #And User clicks on log in button
    #Then User should successfully loged in     