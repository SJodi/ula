@signUp
Feature: Sign Up
  As a user
  I want to sign up into amazon
  So that i can create new user

  @TestCase04
  Scenario: 04- User can go to sign up  page from navbar
    Given user open amazon page
    When user click on button account on navbar
    And user click on button 'Create your Amazon account'
    Then sign up pages will be shown

  @TestCase05
  Scenario: 05 - User success create new account
    Given user open amazon page
    When user click on button account on navbar
    And user click on button 'Create your Amazon account'
    And fill all valid data
    Then mail verification is shown

  @TestCase06
  Scenario: 06 - User failed create new account with empty field
    Given user open amazon page
    When user click on button account on navbar
    And user click on button 'Create your Amazon account'
    And fill with empty data
    Then error field cant be empty is shown