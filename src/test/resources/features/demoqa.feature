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
    And I fill out the form with valid information "<firstName>" "<lastName>" "<email>" "<mobile>" "<dateBirth>"
    Then I verify that the content is visible "<content>"

    Examples:
      | firstName | lastName | email                      | mobile     | dateBirth  | content                        |
      | Andres    | Sanchez  | andressanchez@ilanalab.com | 1234567890 | 01/01/1990 | Thanks for submitting the form |

  @Caso3
  Scenario Outline: Verify the functionality of the carousel
    When I am in the Slider section in the menu of DemoQA.com
    And I drag the slider control to the position 3
    Then I verify that the displayed number is "<slider>"

    Examples:
      | slider |
      | 3      |
