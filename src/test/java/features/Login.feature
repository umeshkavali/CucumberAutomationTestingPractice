Feature: Login

  Scenario: Successful Login with Valid Credentials
    Given User launch ChromeDriver
    Then User should navigates to the URL "https://testautomationpractice.blogspot.com/"
    When User should enter the text fields
    Then User should click on the Male Radio Button
    And User check all the checkboxes
    Then User should select "United Kingdom" from the Country dropdown
    Then User should select "Green" from the Colors dropdown
    Then User should select the Date as "09/05/2023"
    And User should close the browser finally
