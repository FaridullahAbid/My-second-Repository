Feature: Tek School Homepage

  Scenario: Validating Tek school Login with an invalid user nad password
    Given
    When verfiy page title as TEK SCHOOL
    Then Click on Sign in Link
    Then Enter email address "Gulkhan@gmail.com"
    Then Enter password "khalajon"
    Then Validate the error meessage os displayed as "wrong username or password"
