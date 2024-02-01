package ilanalab.reto.web.step;

import ilanalab.reto.web.pageobject.RepositorioForm;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class CheckRegistration {
    private RepositorioForm repositorioForm;
    public void message(String messageResponse){
        String textoBuscado = repositorioForm.mensaje.getText();
        assertThat(textoBuscado, containsString(messageResponse));
    }
}
