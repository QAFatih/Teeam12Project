@US08
Feature: US08_Vice Dean should be able to create courses

  Background: before_class
    Given User goes to the home page
    When  User clicks the login button
    And   User enters user name
    And   User enters user password
    And   User clicks the login button2
    Then  User clicks on the lessons button

  @US08_TC01
  Scenario: Lesson name must be valid
    When User enters a valid value in the lesson name text box, like "Math"
    And  User enters a valid value in the credit score text box, like "99"
    And  User clicks the submit button
    Then User sees the message like "lesson created"

  @US08_TC02
  Scenario: Lesson name should not get an invalid value
    When User enters a valid value in the lesson name text box, like "1234"
    And  User enters a valid value in the credit score text box, like "99"
    And  User clicks the submit button
    Then User sees the message like "error"

  @US08_TC03
  Scenario: Lesson name should not be left blank
    When User enters a valid value in the credit score text box, like "99"
    And  User clicks the submit button
    Then User sees the message like "error"

  @US08_TC04
  Scenario: Marking of Compulsory
    When User enters a valid value in the lesson name text box, like "Math"
    And  User clicks on the compulsory button
    And  User enters a valid value in the credit score text box, like "99"
    And  User clicks the submit button
    Then User sees the message like "lesson created"

#  @US08_TC05
#  Scenario: Compulsory is not checked
#    When User enters a valid value in the lesson name text box
#    And  User enters a valid value in the credit score text box
#    And  User clicks the submit button
#    Then User sees the message lesson created
#
#  @US08_TC06
#  Scenario: Vice Dean should be able to enter credit score
#    When User enters a valid value in the lesson name text box
#    And  User enters a valid value in the credit score text box
#    And  User clicks the submit button
#    Then User sees the message lesson created
#
#  @US08_TC07
#  Scenario: Credit Score should not be left blank
#    When User enters a valid value in the lesson name text box
#    And  User clicks the submit button
#    Then User sees the error message
#
#  @US08_TC08
#  Scenario: Credit Score section should not receive an invalid value
#    When User enters a valid value in the lesson name text box
#    And  User enters an invalid value in the credit score text box
#    And  User clicks the submit button
#    Then User sees the error message