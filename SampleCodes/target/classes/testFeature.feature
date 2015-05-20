Feature: Google search Excercise

  Scenario: Enter name and click on the first result
    Given that the user opens Google homepage on a web browser
    When the user enters "Eirol John Lacang"
    And the user press ENTER key on the keyboard
    Then the user should be shown the result page
    And the user clicks on the first result
    And the user closes the web browser

  Scenario: User clicks the Im Feeling Lucky button
    Given that the user opens Google homepage on a web browser
    When the user clicks on the Im Feeling Lucky button
    Then the user should be redirected to "https://www.google.com/doodles"
	And the user closes the web browser	