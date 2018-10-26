#Author: sebas-garcia-123@hotmail.com

Feature: Create a NewTours account
  As a web user
  I want to register on NewTours
  To make login
  
  Scenario: Register on NewTours
    Given that sebas wants to register into new tours he gets into register page
    When he types all required fields
    	| firstname | lastname	| phone 		| email			 | address 					| address2 | city 		 | state			| postalcode | country	| username | password 	| confirmpass |
      | Lucas 		| Garcia		|3153134278	| lg@mail.com| Cr 82 9 A sur 28	|				   | Medellin  | Antioquia	| 7777			 |COLOMBIA  | LucasV1  | 12345678		| 12345678  	|
    And  he clicks register button
    Then he should see a message that confirms register was succesful

