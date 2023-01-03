Feature: Registration

  @RegistrationAdvantage

  Scenario Outline: Registration on the Advantage page

    Given Jose is on the page of advantage and he wants to register on the <website>

    When Jose enters his personal data
      | user   | email   | password   | confPassword   | firtName   | lastName   | phoneNumber   | city   | address   | state   | postalCode   |
      | <user> | <email> | <password> | <confPassword> | <firtName> | <lastName> | <phoneNumber> | <city> | <address> | <state> | <postalCode> |
    Then He can see the <user> logged in

    Examples:
      | user      | email                | password | confPassword | firtName | lastName | phoneNumber | city     | address           | state     | postalCode | website                                    |
      | josed1804 | josed96.11@gmail.com | Reto0818 | Reto0818     | jose     | diaz     | 3218903867  | medellin | carrera 68B 32-67 | Antioquia | 130240     | https://www.advantageonlineshopping.com/#/ |
