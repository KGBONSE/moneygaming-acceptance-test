Feature: moneygaming user registration
  As a new moneygaming.com player
  I want to be able to register using my full details
  So that I can play online casino games

  @test
  Scenario Outline: user registration process test
    Given I decide to join moneygaming
    Then I should see the page"Join now to Play Online Casino Games - Free or Cash | MoneyGaming.com"
    When I click to join
    Then I should see the text on the page "<errorTitle>" using xpath "<titleXpath>"
    And I should see the text on the page "<errorFname>" using xpath "<fNameXpath>"
    Then I should see the text on the page "<errorSname>" using xpath "<sNameXpath>"
    Then I should see the text on the page "<errorDOB>" using xpath "<DOBXpath>"

    When I provide my details as follows:
      | field     | value |
      | title     |       |
      | firstName | kofi  |
      | surName   | kofi  |
      | day       | 12    |
      | month     | 03    |
      | year      | 1989  |
    And I click to join
    Then I should see the text on the page "<errorTitle>" using xpath "<titleXpath>"

    When I provide my details as follows:
      | field     | value |
      | title     | Mr    |
      | firstName |       |
      | surName   | kofi  |
      | day       | 12    |
      | month     | 03    |
      | year      | 1989  |
    And I click to join
    Then I should see the text on the page "<errorFname>" using xpath "<fNameXpath>"

    When I provide my details as follows:
      | field     | value |
      | title     | Mr    |
      | firstName | Kofi  |
      | surName   |       |
      | day       | 12    |
      | month     | 03    |
      | year      | 1989  |
    And I click to join
    Then I should see the text on the page "<errorSname>" using xpath "<sNameXpath>"


    When I provide my details as follows:
      | field     | value |
      | title     | Mr    |
      | firstName | kofi  |
      | surName   | kofi  |
      | day       |       |
      | month     | 03    |
      | year      | 1989  |
    And I click to join
    Then I should see the text on the page "<errorDOB>" using xpath "<DOBXpath>"

    When I provide my details as follows:
      | field     | value |
      | title     | Mr    |
      | firstName | kofi  |
      | surName   | kofi  |
      | day       | 12    |
      | month     | 03    |
      | year      | 1989  |

    And I click to join


    Examples:
      | errorTitle             | titleXpath                              | errorFname             | fNameXpath                       | errorSname             | sNameXpath                       | errorDOB               | DOBXpath                                        |
      | This field is required | //select[@class='title required error'] | This field is required | //input[@class='required error'] | This field is required | //input[@class='required error'] | This field is required | //select[@class='dobDay inline required error'] |

