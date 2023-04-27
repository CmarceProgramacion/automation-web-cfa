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


  @CaseOne
  Scenario Outline: validate the rates of free investment consumer credits
    When I select the Consumer line of credit with the Free Investment product for individuals.
      | <product> |
    Then Verify that it is displayed in the consumer credit line.
      | <category> | <fees> |

    Examples:
      | product  | category            | fees                |
      | Personas | Tasas de Colocación | Créditos de Consumo |