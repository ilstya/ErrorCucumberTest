Feature: Login

  Scenario: Login using valid email and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user clicks the login button
    Then user is on homepage

  Scenario: Login using invalid email and password
    Given user is on login page
    And user input invalid username with "nonstandard_user"
    And user input invalid password with "nonsecret_sauce"
    When user clicks the login button
    Then user should see an error message
