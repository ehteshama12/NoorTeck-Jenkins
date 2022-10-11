Feature: Mercury Registeration

  Background: 
    Given user navigate to Mercury Application
    And User clicks Register Link

  Scenario: Verify User able to register
    When User provides Contact Information "John" "Cena" "703-333 -9999" "john@gmail.com"
    And User provides Mailing Infomration "123 street dr" "reston" "VA" "20191" "ARUBA"
    And User provides User Information "admin" "123456a" "123456a"
    And User clicks submit button
    Then User verifies success message "Success!"

  Scenario Outline: Verify User able to register
    When User provides Contact Information <first_name> <last_name> <phone> <email>
    And User provides Mailing Infomration <address> <city> <state> <postal_code> <country>
    And User provides User Information <username> <password> <confirm_psw>
    And User clicks submit button
    Then User verifies success message <message>

    Examples: 
      | first_name | last_name | phone           | email            | address         | city     | state | postal_code | country | username | password  | confirm_psw | message    |
      | "John"     | "Cena"    | "703-333 -9999" | "john@gmail.com" | "123 street dr" | "reston" | "VA"  | "20191"     | "ARUBA" | "admin"  | "123456a" | "123456a"   | "Success!" |
