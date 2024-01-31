package ilanalab.reto.web.step;

import ilanalab.reto.web.pageobject.RepositorioForm;
import net.serenitybdd.annotations.Step;

public class OpenDemoQaStep {
    private RepositorioForm repositorioForm;
    @Step
    public void url() {
        repositorioForm.open();
    }
}
