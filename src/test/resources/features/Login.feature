Feature: User Login

  Scenario Outline: Verify login with valid credentials

    Given User launches DemoBlaze application

    When User clicks login link

    And User enters login username "<username>"

    And User enters login password "<password>"

    And User clicks login button

    Then User should be logged in successfully

    Examples:
      | username  | password |
      | testuser1 | pass123  |
      | testuser2 | pass456  |
