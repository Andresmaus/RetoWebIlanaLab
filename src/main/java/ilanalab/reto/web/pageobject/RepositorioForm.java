package ilanalab.reto.web.pageobject;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://demoqa.com/")
public class RepositorioForm extends PageObject {

    @FindBy(xpath = "//h5[contains(text(),'Forms')]")
    public WebElementFacade forms_btn;

    @FindBy(xpath = "//span[contains(text(),'Practice Form')]")
    public WebElementFacade practiceForm_btn;

    @FindBy(id = "firstName")
    public WebElementFacade firstName_txt;

    @FindBy(id = "lastName")
    public WebElementFacade lastName_txt;

    @FindBy(id = "userEmail")
    public WebElementFacade email_txt;

    @FindBy(xpath = "//label[contains(text(),'Male')]")
    public WebElementFacade gender_rdbtn;

    @FindBy(id = "userNumber")
    public WebElementFacade mobileNumber_txt;

    @FindBy(id = "dateOfBirthInput")
    public WebElementFacade birth;

    @FindBy(id = "submit")
    public WebElementFacade submit_btn;

    @FindBy(id = "example-modal-sizes-title-lg")
    public WebElementFacade mensaje;

    @FindBy(id = "currentAddress")
    public WebElementFacade current;
}
