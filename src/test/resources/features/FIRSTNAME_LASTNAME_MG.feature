Feature: moneygaming user registration
  As a new moneygaming.com player
  I want to be able to provide the right password
  So that I can complete the registration process



    Scenario Outline: Money gaming password test

      Given I decide to join moneygaming
      When I provide my details as follows:
            # More than 6 chars
      And I enter my password "Cury1!w"
      Then I should see the text on the page "<password must be 6 charaters long>" using xpath "<Xpath>"
          #No special chars provided
      When I enter my password "Cury1w"
      Then I should see the text on the page "<password must contain at least one special character>" using xpath "<Xpath>"
        # No number provided
      When I enter my password "Curyw!"
      Then I should see the text on the page "<password must contain at least one number>" using xpath "<Xpath>"


      When I enter my password "Cury7!"
      And I provide my details as follows:
      Then I should be able tyo complete my registration
      Examples:
      | |