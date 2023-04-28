#Autor: Claudia Nieto
#Email: cmarce86@yahoo.es
#language: en
@All
Feature: Validate rates and fees
  As a user of CFA Cooperativa Financiera
  I want to access the platform
  To learn about the cooperative's rates and fees

  Background: Access to the main platform
    Given that I access the platform of the CFA Cooperativa Financiera


  @CaseFour
  Scenario Outline: validate Corporate Savings Account Plus rates
    When I select CuentaMás Business Savings Account
      | <product> |
    Then Verify that the price rates of the products appear on the screen
      | <category> |

    Examples:
      | product  | category                              |
      | Empresas | Tarifas de productos y servicios 2023 |