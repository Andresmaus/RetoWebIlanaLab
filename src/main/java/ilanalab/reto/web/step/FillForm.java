package ilanalab.reto.web.step;

import ilanalab.reto.web.pageobject.RepositorioForm;
import net.serenitybdd.annotations.Step;

public class FillForm {
    private RepositorioForm repositorioForm;
    @Step
    public void writeData(String firstName,String lastName, String email,String mobile,String dateBirth) {
        repositorioForm.firstName_txt.sendKeys(firstName);
        repositorioForm.lastName_txt.sendKeys(lastName);
        repositorioForm.email_txt.sendKeys(email);
        repositorioForm.gender_rdbtn.click();
        repositorioForm.mobileNumber_txt.sendKeys(mobile);
        repositorioForm.birth.sendKeys(dateBirth);
    }
}