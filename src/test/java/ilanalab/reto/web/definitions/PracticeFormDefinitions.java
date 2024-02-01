package ilanalab.reto.web.definitions;

import ilanalab.reto.web.step.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class PracticeFormDefinitions {
    @Steps
    OpenDemoQaStep openDemoQaStep;
    @Steps
    SearchFormStep searchForm;
    @Steps
    FillFormStep fillForm;
    @Steps
    CheckRegistrationStep checkRegistration;
    @Steps
    SearchSliderStep sliderStep;
    @Steps
    MoveSlider moveSlider;
    @Steps
    SliderValue sliderValue;



    @Given("that Andres accesses the DemoQA app")
    public void thatAndresAccessesTheDemoQAApp() {
        openDemoQaStep.url();
    }

    @When("I select the Forms module in the menu and then select Practice Form")
    public void iSelectTheFormsModuleInTheMenuAndThenSelectPracticeForm() {
        searchForm.practiceForm();
    }

    @And("I fill out the form with valid information {string} {string} {string} {string} {string}")
    public void iFillOutTheFormWithValidInformation(String firstName, String lastName, String email, String mobile, String dateBirth) {
        fillForm.writeData(firstName,lastName,email,mobile,dateBirth);
    }

    @Then("I verify that the content is visible {string}")
    public void iVerifyThatTheContentIsVisible(String mensaje) {
        checkRegistration.message(mensaje);
    }

    @When("I am in the Slider section in the menu of DemoQA.com")
    public void iAmInTheSliderSectionInTheMenuOfDemoQACom() {
        sliderStep.slider();
    }
    @And("I drag the slider control to the position 3")
    public void iDragTheSliderControlToThePosition3() {
        moveSlider.move();
    }

    @Then("I verify that the displayed number is {string}")
    public void iVerifyThatTheDisplayedNumberIs(String valor) {
        sliderValue.value(valor);
    }
}
