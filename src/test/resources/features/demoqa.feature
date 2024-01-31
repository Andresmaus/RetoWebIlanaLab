#Autor: Andres Sanchez
@CasosDePrueba
Feature: Automated Testing using Selenium at DemoQA.com
  As an Automation Engineer
  I want to conduct tests on DemoQA.com
  In order to verify the functionality of various elements and improve testing efficiency

  Background: Starting Test
    Given that Andres accesses the DemoQA app

  @Caso1
  Scenario Outline: Complete and submit the form correctly
    When I select the Forms module in the menu and then select Practice Form
    And I fill out the form with valid information
      | firstName   | lastName   | email   | gender   | mobile   | dateBirth   | subjects   | hobbies   | currents   | state   | city   |
      | <firstName> | <lastName> | <email> | <gender> | <mobile> | <dateBirth> | <subjects> | <hobbies> | <currents> | <state> | <city> |
    Then I verify that the content is visible.
      | content     |
      | <content>   |

    Examples:
      | firstName | lastName | email | gender | mobile | dateBirth | subjects | hobbies | currents | state | city | content  |
      | John      | Doe      | john@example.com | Male   | 1234567890 | 01/01/1990 | Maths    | Reading | Music    | NCR   | Delhi | Form submitted successfully |

  @Caso1
  Scenario: Completar y enviar el formulario correctamente
    Given que Andres ingresa a la app Exito
    When busca un producto iPhone y lo agrega al carrito
    Then verifica que pudo agregar correctamente el producto

  @Caso1
  Scenario: Completar y enviar el formulario correctamente
    Given que Andres ingresa a la app Exito
    When busca un producto iPhone y lo agrega al carrito
    Then verifica que pudo agregar correctamente el producto