Feature: SmartBear login feature verification


  @postiveLoginSB
  Scenario: As a user I should be able to login using authenticated test data
    When User is on SmartBear login Page
    And User enters correct username
    And Enters the correct password
    And User clicks to login button
    Then User should ne logged in and be able to verify Welcome text is displayed
