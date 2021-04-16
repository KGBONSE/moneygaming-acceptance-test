Feature: moneygaming user registration
  As a new moneygaming.com player
  I want to be able to register using my full details
  So that I can play online casino games



    Scenario Outline: Money gaming password test

      Given I decide to join moneygaming
      When I provide my details as follows:
      And I enter my password "Cury1!w"
      Then I should see the text on the page "<password must be 6 charaters long>" using xpath "<Xpath>"
      When I enter my password "Cury1w"
      Then I should see the text on the page "<password must contain at least one special character>" using xpath "<Xpath>"
      When I enter my password "Curyw!"
      Then I should see the text on the page "<password must contain at least one number>" using xpath "<Xpath>"


      Examples:
      | |