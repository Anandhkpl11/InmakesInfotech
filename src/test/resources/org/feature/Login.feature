Feature: Validate the facebook aaplication

  Scenario: validate login functionality
    Given User lanuch the browser
    When user enter the emailid
    And user enter the password
    And user click the login button
    Then To Navigate the facebook home page
