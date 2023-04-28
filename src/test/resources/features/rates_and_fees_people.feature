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
    Then Verify that the product price list screen appears
      | <category> | <fees> |

    Examples:
      | product  | category            | fees                |
      | Personas | Tasas de Colocación | Créditos de Consumo |

  @CaseTwo
  Scenario Outline: Validate the rates of traditional savings account rates
    When I select the savings account with the traditional savings product
      | <product> |
    Then Verify that the Traditional savings product rates screen appears
      | <fees> |

    Examples:
      | product  | fees                       |
      | Personas | Tasas de captación Ahorros |

  @CaseThree
  Scenario Outline: Validate the rates of the Productive Credit tariffs
    When I select the Productive Credit product
      | <product> |
    Then Verify that the product price list screen appears
      | <category> | <fees> |

    Examples:
      | product  | category            | fees                |
      | Personas | Tasas de Colocación | Créditos de Consumo |
