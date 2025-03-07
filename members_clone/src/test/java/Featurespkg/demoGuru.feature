#Feature: Store login
#This feature deals with the login functionality.
#https://demo.guru99.com/test/newtours/
#Scenario Outline: Login with correct username and correct password
 #
    #Given I navigate to login page
    # When I entered username and password
    #When I insert "<userName>" and "<passWord>"
    #And I clicked signin button
    #Then Its navigated to the home page
    #
    #Examples:
    #| userName | passWord |
    #| mercury   | mercury   |
    #| admin2    | admin22  |
    #| admin3    | admin33   |
    
    #Feature: Flight Booking
#This feature deals with the login functionality.
#https://demo.guru99.com/test/newtours/
#Scenario: Booking flights with the correct details
#
     #Given I navigate to login page
     #When I clicked flights link
     #When I choose the trip
     #And I choose service class
     #Then I clicked on continue Button
Feature: Rediff Login Feature

  Scenario: User logs into Rediff
    Given User is on Rediff login page
    When User enters "testuser" and "password123"
    And Clicks on Sign In button
    Then User should be logged in
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     