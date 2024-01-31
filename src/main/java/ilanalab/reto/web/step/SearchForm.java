package ilanalab.reto.web.step;

import ilanalab.reto.web.pageobject.RepositorioForm;
import net.serenitybdd.annotations.Step;

public class SearchForm {
    private RepositorioForm repositorioForm;
    @Step
    public void practiceForm() {
        repositorioForm.forms_btn.click();
        repositorioForm.practiceForm_btn.click();
    }
}
