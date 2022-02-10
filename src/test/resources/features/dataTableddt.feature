@cloudtable
  Feature: DDT example with cloudtables


    Scenario Outline: Adding multiple users to the table
      Given User is on cloudtables homepage
      When User  clicks on New button
      When User enters "<firstname>" to firstname field
      And  User enter "<lastname>" to lastname field
      And  User enter "<position>" to position field
      And  User enter "<salary>" to salary field
      And  User clicks on create button

      Examples:
      |firstname|lastname|position|salary|
      |devid    |johnsen |tester  |90K   |
      |janina    |r |Automation Enginer  |90K   |
      |devid    |johnsen |tester  |90K   |
      |Janina   |R       |SDET    |115000|
      |Nisso    |U       |Automation Engineer|150000|
      |Kamila   |S       |Developer|130000|
      |Fahima   |E       |UI Developer|180000|

