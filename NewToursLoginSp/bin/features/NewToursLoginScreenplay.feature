#Author: sebas-garcia-123@hotmail.com

Feature: New Tours Login
	As a web user I want to get into new tours page to make login
	
	@LoginSuccesful
  Scenario: Login into New Tours
    Given that sebas wants to login into new tours
    When he types username and password
    	| username  | password 	|
      | SebastianV2 	| 12345678  |
    And  he clicks sing-in button
    Then he should see the flight finder menu
    
  @WrongLogin  
  Scenario: Login into New Tours
  Given that sebas wants to login into new tours
   When he types username and password
    | username  | password 	|
    | LucasV1 	| 12345678  |
   And  he clicks sing-in button
   Then he should see the flight finder menu 