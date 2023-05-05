@US08_Api
Feature: Get_Lesson

  Scenario: Validate_Lesson
    Given send get request to get lesson
    Then validate body