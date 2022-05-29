@signIn
Feature: Sign In
  As a user
  I want to login into amazon
  So that i can access my account

  @TestCase01
  Scenario: 01- User can go to login page from navbar
    Given user open amazon page
    When user click on button account on navbar
    Then user is directed to login page

  @TestCase02
  Scenario: 02- Success login with valid email and password
    Given user access login login page
    When user input email Valid
    And click on button continue
    And user input valid password
    And click button on button sign in
    Then user should be redirected to user home page as registered account

  @TestCase03
  Scenario: 03- Failed login with Invalid email
    Given user access login login page
    When user input email NonValid
    And click on button continue
    Then error non account found should be shown

