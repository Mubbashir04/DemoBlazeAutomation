Feature: User Signup

  Scenario Outline: Verify user signup

    Given User launches DemoBlaze application

    When User clicks signup link

    And User enters signup username "<username>"

    And User enters signup password "<password>"

    And User clicks signup button

    Then User should signup successfully

    Examples:
      | username | password |
      | DemoUser1 | Demo123 |
      | DemoUser2 | Demo456 |