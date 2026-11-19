Feature: Product Purchase

  Scenario: Purchase a product successfully

    Given User launches DemoBlaze application

    When User selects product "Samsung galaxy s6"

    And User adds the product to cart

    And User navigates to cart page

    And User places an order

    And User enters purchase details

    Then Purchase should be completed successfully