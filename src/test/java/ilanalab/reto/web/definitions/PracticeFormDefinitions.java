package ilanalab.reto.web.definitions;

import ilanalab.reto.web.step.CheckRegistration;
import ilanalab.reto.web.step.FillForm;
import ilanalab.reto.web.step.OpenDemoQaStep;
import ilanalab.reto.web.step.SearchForm;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class PracticeFormDefinitions {
    @Steps
    OpenDemoQaStep openDemoQaStep;
    @Steps
    SearchForm searchForm;
    @Steps
    FillForm fillForm;
    @Steps
    CheckRegistration checkRegistration;



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
}
