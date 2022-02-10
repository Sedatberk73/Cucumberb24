Feature:  Data driven testing using Scenario outline with Example table

  @gogleoutline
  Scenario Outline: Google capital cities search
    Given  User is on Google home page
    When user searches for "<Capital>" capital
    Then User should see "<capital>" in the result
    Examples:
      | Capital | capital |
    |usa      |Washington DC|
    |Ukraine  |Kyiv         |
    |germany  |berling      |
    |Spain    |madrit       |

